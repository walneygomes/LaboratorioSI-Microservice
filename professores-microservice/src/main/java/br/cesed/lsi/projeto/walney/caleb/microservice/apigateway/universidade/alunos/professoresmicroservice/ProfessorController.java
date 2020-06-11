package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.alunos.professoresmicroservice;

import java.util.ArrayList; 
import java.util.List;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
public class ProfessorController {

	@GetMapping("/professores")
	public List<Professor> findAll(){
		return (List<Professor>) Stream.of("walney","2313",233);
	}
}
