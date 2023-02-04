package com.practicas.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.practicas.cloud.Service.CalculoService;
import com.practicas.cloud.dto.InputDTO;
import com.practicas.cloud.dto.OutputDTO;

@RestController
public class ServiceController {
	
	@Autowired
	private CalculoService service;
	
	@GetMapping("/calculo")  
	public ResponseEntity<OutputDTO> realizarCalculo(@RequestParam(name="montoInicial") Double montoInicial,
													 @RequestParam(name="aportacionAnual") Double aportacionAnual,
													 @RequestParam(name="incrementoAnual") Double incrementoAnual,
													 @RequestParam(name="anosInversion") Integer anosInversion,
													 @RequestParam(name="rendimiento") Double rendimiento) {
		
		InputDTO input = new InputDTO(montoInicial, aportacionAnual, incrementoAnual, anosInversion, rendimiento);
		OutputDTO output = service.calcularTabla(input);
		return new ResponseEntity<OutputDTO>(output, HttpStatus.OK);
	}
}
