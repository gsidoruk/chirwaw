package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SLO_ANEST database table.
 * 
 */
@Entity
@Table(name="SLO_ANEST")
@NamedQuery(name="SloAnest.findAll", query="SELECT s FROM SloAnest s")
public class SloAnest implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_anest")
	private int idAnest;

	private String aktywny;

	private String imie;

	private String nazwisko;

	private String tytul;

	public SloAnest() {
	}

	public int getIdAnest() {
		return this.idAnest;
	}

	public void setIdAnest(int idAnest) {
		this.idAnest = idAnest;
	}

	public String getAktywny() {
		return this.aktywny;
	}

	public void setAktywny(String aktywny) {
		this.aktywny = aktywny;
	}

	public String getImie() {
		return this.imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getTytul() {
		return this.tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

}