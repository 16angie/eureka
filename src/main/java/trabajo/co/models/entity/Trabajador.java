package trabajo.co.models.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity 
@Table(name="trabajadores")
public class Trabajador {
		
	/**
	 * este id identificara el trabajador 
	 */
	@Id   
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	public Long id;
	
	@Column(name ="tr_nombre",nullable = false)
	public String nombre;
	
	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public void funciones(){};
	
}
