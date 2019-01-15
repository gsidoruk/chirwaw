package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the odcinek database table.
 * 
 */
@Entity
@Table(name="odcinek")
@NamedQuery(name="Odcinek.findAll", query="SELECT o FROM Odcinek o")
public class Odcinek implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_odcinka")
	private String idOdcinka;

	private String info;

	@Column(name="nazwa_odc")
	private String nazwaOdc;

	private String ordynator;

	//bi-directional many-to-one association to Choroba
	@OneToMany(mappedBy="odcinek")
	private List<Choroba> chorobas;

	//bi-directional many-to-one association to Lekarz
	@OneToMany(mappedBy="odcinek")
	private List<Lekarz> lekarzs;

	public Odcinek() {
	}

	public String getIdOdcinka() {
		return this.idOdcinka;
	}

	public void setIdOdcinka(String idOdcinka) {
		this.idOdcinka = idOdcinka;
	}

	public String getInfo() {
		return this.info;
	}

	public void setInfo(String info) {
		this.info = info;
	}

	public String getNazwaOdc() {
		return this.nazwaOdc;
	}

	public void setNazwaOdc(String nazwaOdc) {
		this.nazwaOdc = nazwaOdc;
	}

	public String getOrdynator() {
		return this.ordynator;
	}

	public void setOrdynator(String ordynator) {
		this.ordynator = ordynator;
	}

	public List<Choroba> getChorobas() {
		return this.chorobas;
	}

	public void setChorobas(List<Choroba> chorobas) {
		this.chorobas = chorobas;
	}

	public Choroba addChoroba(Choroba choroba) {
		getChorobas().add(choroba);
		choroba.setOdcinek(this);

		return choroba;
	}

	public Choroba removeChoroba(Choroba choroba) {
		getChorobas().remove(choroba);
		choroba.setOdcinek(null);

		return choroba;
	}

	public List<Lekarz> getLekarzs() {
		return this.lekarzs;
	}

	public void setLekarzs(List<Lekarz> lekarzs) {
		this.lekarzs = lekarzs;
	}

	public Lekarz addLekarz(Lekarz lekarz) {
		getLekarzs().add(lekarz);
		lekarz.setOdcinek(this);

		return lekarz;
	}

	public Lekarz removeLekarz(Lekarz lekarz) {
		getLekarzs().remove(lekarz);
		lekarz.setOdcinek(null);

		return lekarz;
	}

}