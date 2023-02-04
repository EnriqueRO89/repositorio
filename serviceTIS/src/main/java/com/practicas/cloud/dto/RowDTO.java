package com.practicas.cloud.dto;

public class RowDTO {
	
	public Integer ano;
	public Double saldoInicial;
	public Double aportacion;
	public Double rendimiento;
	public Double saldoFinal;
	
	
	
	public RowDTO() {
		super();
	}



	public Integer getAno() {
		return ano;
	}



	public void setAno(Integer ano) {
		this.ano = ano;
	}



	public Double getSaldoInicial() {
		return saldoInicial;
	}



	public void setSaldoInicial(Double saldoInicial) {
		this.saldoInicial = saldoInicial;
	}



	public Double getAportacion() {
		return aportacion;
	}



	public void setAportacion(Double aportacion) {
		this.aportacion = aportacion;
	}



	public Double getRendimiento() {
		return rendimiento;
	}



	public void setRendimiento(Double rendimiento) {
		this.rendimiento = rendimiento;
	}



	public Double getSaldoFinal() {
		return saldoFinal;
	}



	public void setSaldoFinal(Double saldoFinal) {
		this.saldoFinal = saldoFinal;
	}



	public RowDTO(Integer ano, Double saldoInicial, Double aportacion, Double rendimiento, Double saldoFinal) {
		super();
		this.ano = ano;
		this.saldoInicial = saldoInicial;
		this.aportacion = aportacion;
		this.rendimiento = rendimiento;
		this.saldoFinal = saldoFinal;
	}
	
	
}
