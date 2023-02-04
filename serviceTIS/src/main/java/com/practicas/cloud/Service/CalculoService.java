package com.practicas.cloud.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.practicas.cloud.dto.InputDTO;
import com.practicas.cloud.dto.OutputDTO;
import com.practicas.cloud.dto.RowDTO;

@Service
public class CalculoService {
	
	public OutputDTO calcularTabla(InputDTO input) {
		 List<RowDTO> tablaOutput = new ArrayList<RowDTO>();
		 
		 OutputDTO output = new OutputDTO();
		 
		 Double saldoinicial;
		 Double saldofinal = 0.0;
		 Double rendimiento;
		 Double aportacionAnterior = 0.0;
		 Double aportacionActual;
		 Double sumaAportacion = 0.0;
		 int anosInversion = input.getAnosInversion().intValue();
		 
		 for(int i=1;i<=anosInversion ;i++) {
		 
			 if(i == 1) {
				 
				 saldofinal =  this.calcularSaldoFinal(input);
				 rendimiento = this.calcularRendimiento(input);
				 
				 tablaOutput.add(new RowDTO(i,Math.ceil(input.getMontoInicial()), Math.ceil(input.getAportacionAnual()),
						 Math.ceil(rendimiento),Math.ceil(saldofinal)));
			
				 output.setGanancia(Math.ceil(rendimiento));
				 output.setMontoFinal(Math.ceil(rendimiento+input.getMontoInicial()+input.getAportacionAnual()));
				 output.setTablaOutput(tablaOutput);
				 
				 aportacionAnterior = input.getAportacionAnual();
				 sumaAportacion = aportacionAnterior;
				 
			 }else {
				 
				 saldoinicial = saldofinal;
				 aportacionActual = this.calcularAportacionActual(aportacionAnterior, input.getIncrementoAnual());
				 rendimiento = this.calcularRendimiento(saldoinicial, aportacionActual, input.getRendimiento());
				 saldofinal = this.calcularSaldoFinal(saldoinicial, aportacionActual, rendimiento);
				 
				 tablaOutput.add(new RowDTO(i,Math.ceil(saldoinicial),Math.ceil(aportacionActual),Math.ceil(rendimiento),Math.ceil(saldofinal)));
						 
				
				 aportacionAnterior = aportacionActual;
				 sumaAportacion = sumaAportacion + aportacionAnterior;
				 
				 output.setMontoFinal(Math.ceil(saldofinal));
				 output.setGanancia(Math.ceil(saldofinal-input.getMontoInicial()-sumaAportacion));     
			 }
		 
		 }
		 
		 return output;
	}
	
	private Double calcularRendimiento(InputDTO input) {
		return (input.getMontoInicial()+input.getAportacionAnual()) * (input.getRendimiento()/100);
	}
	
	private Double calcularRendimiento(Double saldoInicial, Double aportacion,Double rendimiento) {
		return (saldoInicial+aportacion) * (rendimiento/100);
	}
	
	private Double calcularSaldoFinal(InputDTO input) {
		return input.getMontoInicial()+input.getAportacionAnual()+ this.calcularRendimiento(input);
	}
	
	private Double calcularSaldoFinal(Double saldoInicial, Double aportacion, Double rendimiento) {
		return saldoInicial+aportacion+ rendimiento; 
	}
	
	private Double calcularAportacionActual(Double aportacionAnterior,Double rendimiento) {
		return (aportacionAnterior)*(1+(rendimiento/100));
	}
	
}
