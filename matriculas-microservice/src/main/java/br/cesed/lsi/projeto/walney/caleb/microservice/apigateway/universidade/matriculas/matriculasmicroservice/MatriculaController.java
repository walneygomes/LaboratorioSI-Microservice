package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.matriculas.matriculasmicroservice;

import java.util.ArrayList; 
import java.util.List;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 
@RestController
public class MatriculaController {

	@GetMapping("/matriculas")
	public List<Matricula> findAll(){
		return (List<Matricula>) Stream.of("walney","2313",233);
	}

}
