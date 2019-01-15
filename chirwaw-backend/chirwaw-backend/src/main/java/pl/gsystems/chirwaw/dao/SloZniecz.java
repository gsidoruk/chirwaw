package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SLO_ZNIECZ database table.
 * 
 */
@Entity
@Table(name="SLO_ZNIECZ")
@NamedQuery(name="SloZniecz.findAll", query="SELECT s FROM SloZniecz s")
public class SloZniecz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_zniecz")
	private int idZniecz;

	private String aktywnosc;

	private String znieczulenie;

	public SloZniecz() {
	}

	public int getIdZniecz() {
		return this.idZniecz;
	}

	public void setIdZniecz(int idZniecz) {
		this.idZniecz = idZniecz;
	}

	public String getAktywnosc() {
		return this.aktywnosc;
	}

	public void setAktywnosc(String aktywnosc) {
		this.aktywnosc = aktywnosc;
	}

	public String getZnieczulenie() {
		return this.znieczulenie;
	}

	public void setZnieczulenie(String znieczulenie) {
		this.znieczulenie = znieczulenie;
	}

}