package br.cesed.lsi.projeto.walney.caleb.microservice.apigateway.universidade.cursos.cursosmicroservice;

import java.util.Collections; 
import java.util.List;
import java.util.stream.Stream;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

 

@RestController
public class CursoController {

	
	@GetMapping("/cursos")
	public List<Curso> findAll(){
		return (List<Curso>) Stream.of("walney","2313",233);
	}
	
	@RequestMapping("/{idCurso}")
	public List<String>  getAluno(@PathVariable("idCurso") int idCurso){
		return Collections.singletonList(new Curso().getNomeCurso());
	
	}
	
	
	
	
}

