package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the REL_LEK_DZIEN database table.
 * 
 */
@Entity
@Table(name="REL_LEK_DZIEN")
@NamedQuery(name="RelLekDzien.findAll", query="SELECT r FROM RelLekDzien r")
public class RelLekDzien implements Serializable {
	private static final long serialVersionUID = 1L;

	private String rola;

	//bi-directional many-to-one association to DzienOper
	@ManyToOne
	@JoinColumn(name="data")
	private DzienOper dzienOper;

	//bi-directional many-to-one association to Lekarz
	@ManyToOne
	@JoinColumn(name="id_lekarza")
	private Lekarz lekarz;

	public RelLekDzien() {
	}

	public String getRola() {
		return this.rola;
	}

	public void setRola(String rola) {
		this.rola = rola;
	}

	public DzienOper getDzienOper() {
		return this.dzienOper;
	}

	public void setDzienOper(DzienOper dzienOper) {
		this.dzienOper = dzienOper;
	}

	public Lekarz getLekarz() {
		return this.lekarz;
	}

	public void setLekarz(Lekarz lekarz) {
		this.lekarz = lekarz;
	}

}