package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SLO_SALA_ODDZ database table.
 * 
 */
@Entity
@Table(name="SLO_SALA_ODDZ")
@NamedQuery(name="SloSalaOddz.findAll", query="SELECT s FROM SloSalaOddz s")
public class SloSalaOddz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="nr_sala_oddz")
	private String nrSalaOddz;

	private String telefon;

	public SloSalaOddz() {
	}

	public String getNrSalaOddz() {
		return this.nrSalaOddz;
	}

	public void setNrSalaOddz(String nrSalaOddz) {
		this.nrSalaOddz = nrSalaOddz;
	}

	public String getTelefon() {
		return this.telefon;
	}

	public void setTelefon(String telefon) {
		this.telefon = telefon;
	}

}