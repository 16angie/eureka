package trabajo.co.models.services;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import trabajo.co.models.entity.Trabajador;
import trabajo.co.models.repository.TrabajadorRepository;

@Service
public class TrabajadorServiceImp  implements TrabajadorService{
	
	@Autowired
	private TrabajadorRepository trabajadorReposiroty;

	@Transactional(readOnly= true)
	public Iterable<Trabajador> findAll() {
		return (List<Trabajador>) trabajadorReposiroty.findAll();
	}

	@Transactional(readOnly= true)
	public Trabajador  findById(Long id) {
		Trabajador trabajador = trabajadorReposiroty.findById(id).orElse(null);
		return trabajador;
	}

	@Override
	public Trabajador save(Trabajador trabajador) {
		return trabajadorReposiroty.save(trabajador);
	}

	@Override
	public void deleteById(Long id) {
		trabajadorReposiroty.deleteById(id);
	}

}
