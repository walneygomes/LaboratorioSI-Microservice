package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.alunos.alunosmicroservice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AlunoController {

	@GetMapping("/alunos")
	public List<Aluno> findAll(){
		return (List<Aluno>) Stream.of("walney","2313",233);
	}
	
	@RequestMapping("/{idAluno}")
	public List<Aluno>  getAluno(@PathVariable("idAluno") int idAluno){
		return Collections.singletonList(new Aluno(idAluno, "walney","23213",2017,23));
	
	}
	
	
	
	
	
	
	
	
}
