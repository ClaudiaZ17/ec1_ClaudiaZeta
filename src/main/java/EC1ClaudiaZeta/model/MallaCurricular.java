package EC1ClaudiaZeta.model;

import java.sql.Date;
import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.ForeignKey;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;



@Entity
@Table(name ="mallas")
public class MallaCurricular {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer idMallla;
	private Date año;
	
	
	@OneToOne
	private Universidad universidad;
	
	
	@OneToMany(mappedBy = "malla")
	private List<Curso> items =new ArrayList<>();
	
	
	
	
	
	public Integer getIdMallla() {
		return idMallla;
	}
	public void setIdMallla(Integer idMallla) {
		this.idMallla = idMallla;
	}
	public Date getAño() {
		return año;
	}
	public void setAño(Date año) {
		this.año = año;
	}
	
	
	
	
	
}

	

