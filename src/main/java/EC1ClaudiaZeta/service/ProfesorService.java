package EC1ClaudiaZeta.service;

import java.util.List;

import EC1ClaudiaZeta.model.Profesor;



public interface ProfesorService {
	

	void guardar(Profesor profesor);
	void actualizar(Profesor profesor);
	void eliminar(Integer id);
	List<Profesor> listar();
	Profesor obtener(Integer id);

}
