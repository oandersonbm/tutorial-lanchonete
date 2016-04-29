package com.bomtopado.lanchonete.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.bomtopado.lanchonete.models.Produto;

//1. Define que a classe será um controlador "normal"
@Controller
//2. Define o endereço atribuído a esse controlador, no caso: localhost:8080/produtos/
@RequestMapping("/produtos/")
public class ProdutoController {
	//3. Aqui optei por informar que o path/caminho para a página é o mesmo do controlador
	@RequestMapping("")
	public String test(Model model){
		//4. Cria um produto qualquer
		Produto p = new Produto();
		p.setId(0l);
		p.setNome("Teste");
		p.setValor(1d);
		
		//5. Adiciona o produto ao modelo
		model.addAttribute("produto", p);
		
		//6. Informa qual o local que a página Thymeleaf está
		return "index";
	}
	
	//-- COMPLEMENTO PARA QUE VOCÊ COMPREENDA MELHOR --//
	
	//7. Criei um novo controlador que retornará o produto "josivelson" no endereço localhost:8080/produtos/josivelson
	@RequestMapping("josivelson")
	public String test2(Model model){
		//8. Criei o produto que será exibido
		Produto p = new Produto();
		p.setId(1l);
		p.setNome("I'm Josivelson. My name is cool!");
		p.setValor(1d);
		
		//9. Adicionei o produto ao modelo
		model.addAttribute("produto", p);
		
		//10. Informei qual a página do Thymeleaf que receberá
		return "josivelson/index";
	}
}
