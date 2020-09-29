package com.bolsadeideas.springboot.form.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.bolsadeideas.springboot.form.app.models.entity.User;

/**
 * Vamos a necesitar 2 metodos handler un GET para mostrar el formulario
 * <code>(@GetMapping)</code> y POST para procesar o recibir los datos del
 * formulario <code>(@PostMapping)</code>
 * 
 */
@Controller
public class FormController {
	@GetMapping("/form")
	public String form(Model model) {
		model.addAttribute("title", "Form Usuario");
		return "form";
	}

	/*
	 * 1.- con @RequestParam T ImputName 2.- @RequestParam(name="ImputName") T
	 * ImputName
	 */
	@PostMapping("/form")
	public String procesar(User user, Model model) {
		model.addAttribute("title", "Resultado Form");
		model.addAttribute("user", user);

		return "resultform";
	}
}