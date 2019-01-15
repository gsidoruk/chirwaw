package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the CHOROBA_VW database table.
 * 
 */
@Entity
@Table(name="CHOROBA_VW")
@NamedQuery(name="ChorobaVw.findAll", query="SELECT c FROM ChorobaVw c")
public class ChorobaVw implements Serializable {
	private static final long serialVersionUID = 1L;

	@Column(name="czy_nagla")
	private String czyNagla;

	@Temporal(TemporalType.DATE)
	@Column(name="data_przyjecia")
	private Date dataPrzyjecia;

	@Temporal(TemporalType.DATE)
	@Column(name="data_wprow")
	private Date dataWprow;

	@Temporal(TemporalType.DATE)
	@Column(name="data_zgloszenia")
	private Date dataZgloszenia;

	private String decyzja;

	private String icd10;

	private String icd9;

	@Column(name="icd9_opis")
	private String icd9Opis;

	@Column(name="id_chor")
	private int idChor;

	@Column(name="id_dec")
	private String idDec;

	@Column(name="id_icd9")
	private int idIcd9;

	@Column(name="id_lekarza")
	private int idLekarza;

	@Column(name="id_lekarza_rej")
	private int idLekarzaRej;

	@Column(name="id_odcinka")
	private String idOdcinka;

	@Column(name="id_oper")
	private int idOper;

	@Column(name="id_pac")
	private int idPac;

	@Column(name="id_prot")
	private int idProt;

	@Column(name="id_trybu")
	private String idTrybu;

	private String imie;

	@Column(name="imie_lek")
	private String imieLek;

	@Column(name="nazw_lek")
	private String nazwLek;

	@Column(name="nazwa_odc")
	private String nazwaOdc;

	private String nazwisko;

	@Temporal(TemporalType.DATE)
	@Column(name="operacja_data")
	private Date operacjaData;

	@Column(name="operacja_nr_sala_oper")
	private String operacjaNrSalaOper;

	private String pesel;

	private String potwierdzenie;

	private String prof;

	@Column(name="protokol_archiwum")
	private String protokolArchiwum;

	@Temporal(TemporalType.DATE)
	@Column(name="protokol_data")
	private Date protokolData;

	@Column(name="protokol_id_lek_oper")
	private int protokolIdLekOper;

	@Column(name="protokol_nr_ks_gl")
	private String protokolNrKsGl;

	@Column(name="protokol_nr_oper")
	private String protokolNrOper;

	@Column(name="protokol_nr_sala_oper")
	private String protokolNrSalaOper;

	@Column(name="rodz_oper")
	private String rodzOper;

	private String rozpoznanie;

	private String status;

	@Column(name="tel_kontakt")
	private String telKontakt;

	private String tryb;

	private String tytul;

	private String uwagi;

	public ChorobaVw() {
	}

	public String getCzyNagla() {
		return this.czyNagla;
	}

	public void setCzyNagla(String czyNagla) {
		this.czyNagla = czyNagla;
	}

	public Date getDataPrzyjecia() {
		return this.dataPrzyjecia;
	}

	public void setDataPrzyjecia(Date dataPrzyjecia) {
		this.dataPrzyjecia = dataPrzyjecia;
	}

	public Date getDataWprow() {
		return this.dataWprow;
	}

	public void setDataWprow(Date dataWprow) {
		this.dataWprow = dataWprow;
	}

	public Date getDataZgloszenia() {
		return this.dataZgloszenia;
	}

	public void setDataZgloszenia(Date dataZgloszenia) {
		this.dataZgloszenia = dataZgloszenia;
	}

	public String getDecyzja() {
		return this.decyzja;
	}

	public void setDecyzja(String decyzja) {
		this.decyzja = decyzja;
	}

	public String getIcd10() {
		return this.icd10;
	}

	public void setIcd10(String icd10) {
		this.icd10 = icd10;
	}

	public String getIcd9() {
		return this.icd9;
	}

	public void setIcd9(String icd9) {
		this.icd9 = icd9;
	}

	public String getIcd9Opis() {
		return this.icd9Opis;
	}

	public void setIcd9Opis(String icd9Opis) {
		this.icd9Opis = icd9Opis;
	}

	public int getIdChor() {
		return this.idChor;
	}

	public void setIdChor(int idChor) {
		this.idChor = idChor;
	}

	public String getIdDec() {
		return this.idDec;
	}

	public void setIdDec(String idDec) {
		this.idDec = idDec;
	}

	public int getIdIcd9() {
		return this.idIcd9;
	}

	public void setIdIcd9(int idIcd9) {
		this.idIcd9 = idIcd9;
	}

	public int getIdLekarza() {
		return this.idLekarza;
	}

	public void setIdLekarza(int idLekarza) {
		this.idLekarza = idLekarza;
	}

	public int getIdLekarzaRej() {
		return this.idLekarzaRej;
	}

	public void setIdLekarzaRej(int idLekarzaRej) {
		this.idLekarzaRej = idLekarzaRej;
	}

	public String getIdOdcinka() {
		return this.idOdcinka;
	}

	public void setIdOdcinka(String idOdcinka) {
		this.idOdcinka = idOdcinka;
	}

	public int getIdOper() {
		return this.idOper;
	}

	public void setIdOper(int idOper) {
		this.idOper = idOper;
	}

	public int getIdPac() {
		return this.idPac;
	}

	public void setIdPac(int idPac) {
		this.idPac = idPac;
	}

	public int getIdProt() {
		return this.idProt;
	}

	public void setIdProt(int idProt) {
		this.idProt = idProt;
	}

	public String getIdTrybu() {
		return this.idTrybu;
	}

	public void setIdTrybu(String idTrybu) {
		this.idTrybu = idTrybu;
	}

	public String getImie() {
		return this.imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getImieLek() {
		return this.imieLek;
	}

	public void setImieLek(String imieLek) {
		this.imieLek = imieLek;
	}

	public String getNazwLek() {
		return this.nazwLek;
	}

	public void setNazwLek(String nazwLek) {
		this.nazwLek = nazwLek;
	}

	public String getNazwaOdc() {
		return this.nazwaOdc;
	}

	public void setNazwaOdc(String nazwaOdc) {
		this.nazwaOdc = nazwaOdc;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Date getOperacjaData() {
		return this.operacjaData;
	}

	public void setOperacjaData(Date operacjaData) {
		this.operacjaData = operacjaData;
	}

	public String getOperacjaNrSalaOper() {
		return this.operacjaNrSalaOper;
	}

	public void setOperacjaNrSalaOper(String operacjaNrSalaOper) {
		this.operacjaNrSalaOper = operacjaNrSalaOper;
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

	public String getProf() {
		return this.prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public String getProtokolArchiwum() {
		return this.protokolArchiwum;
	}

	public void setProtokolArchiwum(String protokolArchiwum) {
		this.protokolArchiwum = protokolArchiwum;
	}

	public Date getProtokolData() {
		return this.protokolData;
	}

	public void setProtokolData(Date protokolData) {
		this.protokolData = protokolData;
	}

	public int getProtokolIdLekOper() {
		return this.protokolIdLekOper;
	}

	public void setProtokolIdLekOper(int protokolIdLekOper) {
		this.protokolIdLekOper = protokolIdLekOper;
	}

	public String getProtokolNrKsGl() {
		return this.protokolNrKsGl;
	}

	public void setProtokolNrKsGl(String protokolNrKsGl) {
		this.protokolNrKsGl = protokolNrKsGl;
	}

	public String getProtokolNrOper() {
		return this.protokolNrOper;
	}

	public void setProtokolNrOper(String protokolNrOper) {
		this.protokolNrOper = protokolNrOper;
	}

	public String getProtokolNrSalaOper() {
		return this.protokolNrSalaOper;
	}

	public void setProtokolNrSalaOper(String protokolNrSalaOper) {
		this.protokolNrSalaOper = protokolNrSalaOper;
	}

	public String getRodzOper() {
		return this.rodzOper;
	}

	public void setRodzOper(String rodzOper) {
		this.rodzOper = rodzOper;
	}

	public String getRozpoznanie() {
		return this.rozpoznanie;
	}

	public void setRozpoznanie(String rozpoznanie) {
		this.rozpoznanie = rozpoznanie;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getTelKontakt() {
		return this.telKontakt;
	}

	public void setTelKontakt(String telKontakt) {
		this.telKontakt = telKontakt;
	}

	public String getTryb() {
		return this.tryb;
	}

	public void setTryb(String tryb) {
		this.tryb = tryb;
	}

	public String getTytul() {
		return this.tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getUwagi() {
		return this.uwagi;
	}

	public void setUwagi(String uwagi) {
		this.uwagi = uwagi;
	}

}