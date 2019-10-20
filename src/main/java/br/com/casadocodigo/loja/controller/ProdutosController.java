package br.com.casadocodigo.loja.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import br.com.casadocodigo.loja.models.Produto;

@Controller
public class ProdutosController {

	@RequestMapping("/produtos/form")
	public String form () {
		return "produtos/form";		
	}
	
	@RequestMapping("/produtos")
	public String gravar(Produto produto) {
		System.out.println(produto);
		/*
		 * System.out.println("Descrição: "+descricao);
		 * System.out.println("Páginas: "+paginas);
		 */
		
		return "ok";
	}
}
