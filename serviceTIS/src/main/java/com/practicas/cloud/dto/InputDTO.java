package com.practicas.cloud.dto;

public class InputDTO {
	
	Double montoInicial;
	Double aportacionAnual;
	Double incrementoAnual;
	Integer anosInversion;
	Double rendimiento;
		
	public InputDTO() {
		super();
	}

	public InputDTO(Double montoInicial, Double aportacionAnual, Double incrementoAnual, Integer anosInversion,
			Double rendimiento) {
		super();
		this.montoInicial = montoInicial;
		this.aportacionAnual = aportacionAnual;
		this.incrementoAnual = incrementoAnual;
		this.anosInversion = anosInversion;
		this.rendimiento = rendimiento;
	}

	public Double getMontoInicial() {
		return montoInicial;
	}

	public void setMontoInicial(Double montoInicial) {
		this.montoInicial = montoInicial;
	}

	public Double getAportacionAnual() {
		return aportacionAnual;
	}

	public void setAportacionAnual(Double aportacionAnual) {
		this.aportacionAnual = aportacionAnual;
	}

	public Double getIncrementoAnual() {
		return incrementoAnual;
	}

	public void setIncrementoAnual(Double incrementoAnual) {
		this.incrementoAnual = incrementoAnual;
	}

	public Integer getAnosInversion() {
		return anosInversion;
	}

	public void setAnosInversion(Integer anosInversion) {
		this.anosInversion = anosInversion;
	}

	public Double getRendimiento() {
		return rendimiento;
	}

	public void setRendimiento(Double rendimiento) {
		this.rendimiento = rendimiento;
	}

	@Override
	public String toString() {
		return "InputDTO [montoInicial=" + montoInicial + ", aportacionAnual=" + aportacionAnual + ", incrementoAnual="
				+ incrementoAnual + ", anosInversion=" + anosInversion + ", rendimiento=" + rendimiento + "]";
	}
	
	
	
}
