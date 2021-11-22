package com.trabalho.controller;


import java.io.IOException;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.mvc.method.annotation.ResponseBodyEmitter;

import com.trabalho.service.AplicativoService;

@Controller
public class AplicativoController {
	
	private AplicativoService aplicativoService;
	
	@RequestMapping(value = { "/findAll" }, method = RequestMethod.GET)
	public ResponseBodyEmitter findAll() throws IOException {
		ResponseBodyEmitter emitter = new ResponseBodyEmitter();
		emitter.send(aplicativoService.findAll());
		return emitter;
	}

}
