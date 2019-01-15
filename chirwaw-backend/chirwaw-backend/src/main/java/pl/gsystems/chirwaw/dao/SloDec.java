package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the SLO_DEC database table.
 * 
 */
@Entity
@Table(name="SLO_DEC")
@NamedQuery(name="SloDec.findAll", query="SELECT s FROM SloDec s")
public class SloDec implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_dec")
	private String idDec;

	private String decyzja;

	//bi-directional many-to-one association to Choroba
	@OneToMany(mappedBy="sloDec")
	private List<Choroba> chorobas;

	public SloDec() {
	}

	public String getIdDec() {
		return this.idDec;
	}

	public void setIdDec(String idDec) {
		this.idDec = idDec;
	}

	public String getDecyzja() {
		return this.decyzja;
	}

	public void setDecyzja(String decyzja) {
		this.decyzja = decyzja;
	}

	public List<Choroba> getChorobas() {
		return this.chorobas;
	}

	public void setChorobas(List<Choroba> chorobas) {
		this.chorobas = chorobas;
	}

	public Choroba addChoroba(Choroba choroba) {
		getChorobas().add(choroba);
		choroba.setSloDec(this);

		return choroba;
	}

	public Choroba removeChoroba(Choroba choroba) {
		getChorobas().remove(choroba);
		choroba.setSloDec(null);

		return choroba;
	}

}