package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the pacjent database table.
 * 
 */
@Entity
@Table(name="pacjent")
@NamedQuery(name="Pacjent.findAll", query="SELECT p FROM Pacjent p")
public class Pacjent implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_pac")
	private int idPac;

	private String browser;

	@Temporal(TemporalType.DATE)
	@Column(name="data_wprow")
	private Date dataWprow;

	@Temporal(TemporalType.DATE)
	@Column(name="data_zgonu")
	private Date dataZgonu;

	@Column(name="id_lekarza_rej")
	private int idLekarzaRej;

	private String imie;

	private String ip;

	private String nazwisko;

	private String pesel;

	private String potwierdzenie;

	@Column(name="tel_kontakt")
	private String telKontakt;

	//bi-directional many-to-one association to Choroba
	@OneToMany(mappedBy="pacjent")
	private List<Choroba> chorobas;

	public Pacjent() {
	}

	public int getIdPac() {
		return this.idPac;
	}

	public void setIdPac(int idPac) {
		this.idPac = idPac;
	}

	public String getBrowser() {
		return this.browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
	}

	public Date getDataWprow() {
		return this.dataWprow;
	}

	public void setDataWprow(Date dataWprow) {
		this.dataWprow = dataWprow;
	}

	public Date getDataZgonu() {
		return this.dataZgonu;
	}

	public void setDataZgonu(Date dataZgonu) {
		this.dataZgonu = dataZgonu;
	}

	public int getIdLekarzaRej() {
		return this.idLekarzaRej;
	}

	public void setIdLekarzaRej(int idLekarzaRej) {
		this.idLekarzaRej = idLekarzaRej;
	}

	public String getImie() {
		return this.imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getPesel() {
		return this.pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getPotwierdzenie() {
		return this.potwierdzenie;
	}

	public void setPotwierdzenie(String potwierdzenie) {
		this.potwierdzenie = potwierdzenie;
	}

	public String getTelKontakt() {
		return this.telKontakt;
	}

	public void setTelKontakt(String telKontakt) {
		this.telKontakt = telKontakt;
	}

	public List<Choroba> getChorobas() {
		return this.chorobas;
	}

	public void setChorobas(List<Choroba> chorobas) {
		this.chorobas = chorobas;
	}

	public Choroba addChoroba(Choroba choroba) {
		getChorobas().add(choroba);
		choroba.setPacjent(this);

		return choroba;
	}

	public Choroba removeChoroba(Choroba choroba) {
		getChorobas().remove(choroba);
		choroba.setPacjent(null);

		return choroba;
	}

}