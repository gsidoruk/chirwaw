package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the icd9 database table.
 * 
 */
@Entity
@Table(name="icd9")
@NamedQuery(name="Icd9.findAll", query="SELECT i FROM Icd9 i")
public class Icd9 implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_icd9")
	private int idIcd9;

	private String aktywnosc;

	private String icd9;

	private String opis;

	@Column(name="opis_oper")
	private String opisOper;

	//bi-directional many-to-one association to Choroba
	@OneToMany(mappedBy="icd9")
	private List<Choroba> chorobas;

	public Icd9() {
	}

	public int getIdIcd9() {
		return this.idIcd9;
	}

	public void setIdIcd9(int idIcd9) {
		this.idIcd9 = idIcd9;
	}

	public String getAktywnosc() {
		return this.aktywnosc;
	}

	public void setAktywnosc(String aktywnosc) {
		this.aktywnosc = aktywnosc;
	}

	public String getIcd9() {
		return this.icd9;
	}

	public void setIcd9(String icd9) {
		this.icd9 = icd9;
	}

	public String getOpis() {
		return this.opis;
	}

	public void setOpis(String opis) {
		this.opis = opis;
	}

	public String getOpisOper() {
		return this.opisOper;
	}

	public void setOpisOper(String opisOper) {
		this.opisOper = opisOper;
	}

	public List<Choroba> getChorobas() {
		return this.chorobas;
	}

	public void setChorobas(List<Choroba> chorobas) {
		this.chorobas = chorobas;
	}

	public Choroba addChoroba(Choroba choroba) {
		getChorobas().add(choroba);
		choroba.setIcd9(this);

		return choroba;
	}

	public Choroba removeChoroba(Choroba choroba) {
		getChorobas().remove(choroba);
		choroba.setIcd9(null);

		return choroba;
	}

}