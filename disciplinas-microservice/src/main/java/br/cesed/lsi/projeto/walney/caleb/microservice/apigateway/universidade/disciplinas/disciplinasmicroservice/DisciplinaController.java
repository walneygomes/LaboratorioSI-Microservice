package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.disciplinas.disciplinasmicroservice;

import java.util.List;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class DisciplinaController {

	

	@GetMapping("/disciplinas")
	public List<Disciplina> findAll(){
		return (List<Disciplina>) Stream.of("walney","2313",233);
	}

}
