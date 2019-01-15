package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.List;


/**
 * The persistent class for the SLO_TRYBY database table.
 * 
 */
@Entity
@Table(name="SLO_TRYBY")
@NamedQuery(name="SloTryby.findAll", query="SELECT s FROM SloTryby s")
public class SloTryby implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_trybu")
	private String idTrybu;

	private String tryb;

	//bi-directional many-to-one association to Choroba
	@OneToMany(mappedBy="sloTryby")
	private List<Choroba> chorobas;

	public SloTryby() {
	}

	public String getIdTrybu() {
		return this.idTrybu;
	}

	public void setIdTrybu(String idTrybu) {
		this.idTrybu = idTrybu;
	}

	public String getTryb() {
		return this.tryb;
	}

	public void setTryb(String tryb) {
		this.tryb = tryb;
	}

	public List<Choroba> getChorobas() {
		return this.chorobas;
	}

	public void setChorobas(List<Choroba> chorobas) {
		this.chorobas = chorobas;
	}

	public Choroba addChoroba(Choroba choroba) {
		getChorobas().add(choroba);
		choroba.setSloTryby(this);

		return choroba;
	}

	public Choroba removeChoroba(Choroba choroba) {
		getChorobas().remove(choroba);
		choroba.setSloTryby(null);

		return choroba;
	}

}