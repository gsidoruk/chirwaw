package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the icd10 database table.
 * 
 */
@Entity
@Table(name="icd10")
@NamedQuery(name="Icd10.findAll", query="SELECT i FROM Icd10 i")
public class Icd10 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private String icd10;

	private String aktywnosc;

	private String rozpoznanie;

	private String typ;

	//bi-directional many-to-one association to Choroba
	@OneToMany(mappedBy="icd10Bean")
	private List<Choroba> chorobas;

	public Icd10() {
	}

	public String getIcd10() {
		return this.icd10;
	}

	public void setIcd10(String icd10) {
		this.icd10 = icd10;
	}

	public String getAktywnosc() {
		return this.aktywnosc;
	}

	public void setAktywnosc(String aktywnosc) {
		this.aktywnosc = aktywnosc;
	}

	public String getRozpoznanie() {
		return this.rozpoznanie;
	}

	public void setRozpoznanie(String rozpoznanie) {
		this.rozpoznanie = rozpoznanie;
	}

	public String getTyp() {
		return this.typ;
	}

	public void setTyp(String typ) {
		this.typ = typ;
	}

	public List<Choroba> getChorobas() {
		return this.chorobas;
	}

	public void setChorobas(List<Choroba> chorobas) {
		this.chorobas = chorobas;
	}

	public Choroba addChoroba(Choroba choroba) {
		getChorobas().add(choroba);
		choroba.setIcd10Bean(this);

		return choroba;
	}

	public Choroba removeChoroba(Choroba choroba) {
		getChorobas().remove(choroba);
		choroba.setIcd10Bean(null);

		return choroba;
	}

}