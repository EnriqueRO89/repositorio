package com.practicas.cloud.dto;

import java.util.ArrayList;
import java.util.List;

public class OutputDTO {
	
	public Double ganancia;
	public Double montoFinal;
	public List<RowDTO> tablaOutput = new ArrayList<RowDTO>();
	
	
	
	public OutputDTO() {
		super();
	}



	public OutputDTO(Double ganancia, Double montoFinal, List<RowDTO> tablaOutput) {
		super();
		this.ganancia = ganancia;
		this.montoFinal = montoFinal;
		this.tablaOutput = tablaOutput;
	}



	public Double getGanancia() {
		return ganancia;
	}



	public void setGanancia(Double ganancia) {
		this.ganancia = ganancia;
	}



	public Double getMontoFinal() {
		return this.montoFinal;
	}



	public void setMontoFinal(Double montoFinal) {
		this.montoFinal = montoFinal;
	}



	public List<RowDTO> getTablaOutput() {
		return tablaOutput;
	}



	public void setTablaOutput(List<RowDTO> tablaOutput) {
		this.tablaOutput = tablaOutput;
	}
	
	
	
	

}
