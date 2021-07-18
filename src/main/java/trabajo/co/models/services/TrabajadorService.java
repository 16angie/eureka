package trabajo.co.models.services;



import trabajo.co.models.entity.Trabajador;


public interface TrabajadorService {
	
	public Iterable<Trabajador> findAll();
	
	public Trabajador findById(Long id);
	
	public Trabajador save(Trabajador trabajador);
	
	public void deleteById(Long id);
}
