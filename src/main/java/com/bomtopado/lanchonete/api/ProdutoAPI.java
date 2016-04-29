package com.bomtopado.lanchonete.api;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.bomtopado.lanchonete.models.Produto;

//1. Define que aqui terá um controlador REST
@RestController
//2. Faz com que você evite repetições do "/api/" em todos os caminhos abaixo
@RequestMapping("/api/")
public class ProdutoAPI {
	
	//3. Define o caminho localhost:8080/api/test
	@RequestMapping("test")
	public Produto test(){
		//4. Cria o produto para o teste
		Produto produto = new Produto();
		produto.setId(0l);
		produto.setNome("Teste");
		produto.setValor(1d);
		//5. Retorna o produto que aparecerá, por padrão, em JSON: {"id":0,"nome":"Teste","valor":1.0}
		return produto;
	}
}
