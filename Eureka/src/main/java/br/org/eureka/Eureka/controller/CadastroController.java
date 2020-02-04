package br.org.eureka.Eureka.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import br.org.eureka.Eureka.model.CadastroUsuario;
import br.org.eureka.Eureka.service.ICadastroUsuarioService;

@RestController
@CrossOrigin("*")
public class CadastroController {
	
	@Autowired
	private ICadastroUsuarioService servico;
	
	@PostMapping("/cadastro/novo/")
	public ResponseEntity<CadastroUsuario> incluirNovo (@RequestBody CadastroUsuario cadastro) {
		System.out.println(cadastro.getNome());
		servico.adicionarNovoUsuario(cadastro);
		System.out.println(cadastro.getNome());
		return ResponseEntity.ok(cadastro);
	}
	
	@GetMapping("/cadastro/todos/")
	public ResponseEntity<List<CadastroUsuario>> mostrarTodos(){
		return ResponseEntity.ok(servico.recuperarTodos());
	}
	
	@GetMapping("/cadastro/{idusuario}")
	public ResponseEntity<CadastroUsuario> mostrarPeloId(@PathVariable int idusuario){
		CadastroUsuario c = servico.recuperarPorId(idusuario);
		if (c != null) {
			return ResponseEntity.ok(c);
		}
		return ResponseEntity.notFound().build();
	}
}
