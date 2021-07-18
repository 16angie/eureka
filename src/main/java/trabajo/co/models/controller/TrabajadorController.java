package trabajo.co.models.controller;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import trabajo.co.models.entity.Trabajador;
import trabajo.co.models.services.TrabajadorService;

@RestController
@RequestMapping("/trabajadores")
public class TrabajadorController {
	
	@Autowired
	private TrabajadorService service;
	
	@GetMapping("/listar")
	public ResponseEntity<?> listar(){
		return ResponseEntity.ok().body(service.findAll());
	}
	
	@GetMapping("/{id}")
	public  ResponseEntity<?> ver(@PathVariable Long id){
		Trabajador trabajador = service.findById(id);
		if(trabajador != null) {
			return ResponseEntity.status(HttpStatus.CREATED).body(trabajador);
		}
		return null;
	}
	
	@PostMapping
	public ResponseEntity<?> crear(@RequestBody Trabajador trabajador){
		Trabajador trabajadorBd = service.save(trabajador);
		return ResponseEntity.status(HttpStatus.CREATED).body(trabajadorBd);
	}
	
	@PutMapping("/{id}")
	public ResponseEntity<?> actualizar(@PathVariable Long id,@RequestBody Trabajador trabajador ){
		Trabajador trabajadors = service.findById(id);
		
		if(trabajadors == null) {
			return ResponseEntity.notFound().build();
		}
		Trabajador trabajadorbd = trabajadors;
		trabajadorbd.setNombre(trabajador.getNombre());
		
		return ResponseEntity.status(HttpStatus.CREATED).body(trabajadorbd);
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<?> eliminar(@PathVariable Long id){
		service.deleteById(id);
		return ResponseEntity.notFound().build();
	}
	

}
