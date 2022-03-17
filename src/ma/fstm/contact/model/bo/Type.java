package ma.fstm.contact.model.bo;

import java.util.HashSet;
import java.util.Set;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

@Entity
@Table(name="type")
public class Type {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	Long id;
	String titre;
	@OneToMany(fetch=FetchType.LAZY, mappedBy = "type")
	Set<Contact> c;
	public Type() {
		this.c = new HashSet<Contact>();
	}
	
	
	public Type(Long id, String titre, Set<Contact> c) {
		super();
		this.id = id;
		this.titre = titre;
		this.c = c;
	}


	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitre() {
		return titre;
	}
	public void setTitre(String titre) {
		this.titre = titre;
	}
	public Set<Contact> getC() {
		return c;
	}
	public void setC(Set<Contact> c) {
		this.c = c;
	}
}
