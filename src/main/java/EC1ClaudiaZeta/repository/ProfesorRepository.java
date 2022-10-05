package EC1ClaudiaZeta.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;



import EC1ClaudiaZeta.model.Profesor;

@Repository
public interface ProfesorRepository extends JpaRepository<Profesor, Integer> {


}
