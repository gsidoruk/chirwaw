package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the PROTOKOL_VW database table.
 * 
 */
@Entity
@Table(name="PROTOKOL_VW")
@NamedQuery(name="ProtokolVw.findAll", query="SELECT p FROM ProtokolVw p")
public class ProtokolVw implements Serializable {
	private static final long serialVersionUID = 1L;

	private String archiwum;

	@Column(name="as1_id_lek")
	private int as1IdLek;

	@Column(name="as1_inny")
	private String as1Inny;

	@Column(name="as1_nazwisko")
	private String as1Nazwisko;

	@Column(name="as1_tytul")
	private String as1Tytul;

	@Column(name="as2_id_lek")
	private int as2IdLek;

	@Column(name="as2_inny")
	private String as2Inny;

	@Column(name="as2_nazwisko")
	private String as2Nazwisko;

	@Column(name="as2_tytul")
	private String as2Tytul;

	@Column(name="as3_id_lek")
	private int as3IdLek;

	@Column(name="as3_inny")
	private String as3Inny;

	@Column(name="as3_nazwisko")
	private String as3Nazwisko;

	@Column(name="as3_tytul")
	private String as3Tytul;

	@Temporal(TemporalType.DATE)
	private Date data;

	private String icd10;

	@Column(name="icd10_opis")
	private String icd10Opis;

	private String icd9;

	@Column(name="icd9_opis")
	private String icd9Opis;

	@Column(name="id_anest")
	private int idAnest;

	@Column(name="id_chor")
	private int idChor;

	@Column(name="id_dec")
	private String idDec;

	@Column(name="id_icd9")
	private int idIcd9;

	@Column(name="id_lek_oper")
	private int idLekOper;

	@Column(name="id_pac")
	private int idPac;

	@Column(name="id_prot")
	private int idProt;

	@Column(name="id_zniecz")
	private int idZniecz;

	private String imie;

	@Column(name="imie_anest")
	private String imieAnest;

	private String nazwisko;

	@Column(name="nazwisko_anest")
	private String nazwiskoAnest;

	@Column(name="nr_ks_gl")
	private String nrKsGl;

	@Column(name="nr_ks_oddz")
	private String nrKsOddz;

	@Column(name="nr_oper")
	private String nrOper;

	@Column(name="nr_sala_oddz")
	private String nrSalaOddz;

	@Column(name="nr_sala_oper")
	private String nrSalaOper;

	@Column(name="oper_nazwisko")
	private String operNazwisko;

	@Column(name="oper_tytul")
	private String operTytul;

	@Column(name="operator_inny")
	private String operatorInny;

	@Column(name="opis_oper")
	private String opisOper;

	private String pesel;

	private String procedura;

	private String punkty;

	private String rozpoznanie;

	@Column(name="tytul_anest")
	private String tytulAnest;

	private String znieczulenie;

	public ProtokolVw() {
	}

	public String getArchiwum() {
		return this.archiwum;
	}

	public void setArchiwum(String archiwum) {
		this.archiwum = archiwum;
	}

	public int getAs1IdLek() {
		return this.as1IdLek;
	}

	public void setAs1IdLek(int as1IdLek) {
		this.as1IdLek = as1IdLek;
	}

	public String getAs1Inny() {
		return this.as1Inny;
	}

	public void setAs1Inny(String as1Inny) {
		this.as1Inny = as1Inny;
	}

	public String getAs1Nazwisko() {
		return this.as1Nazwisko;
	}

	public void setAs1Nazwisko(String as1Nazwisko) {
		this.as1Nazwisko = as1Nazwisko;
	}

	public String getAs1Tytul() {
		return this.as1Tytul;
	}

	public void setAs1Tytul(String as1Tytul) {
		this.as1Tytul = as1Tytul;
	}

	public int getAs2IdLek() {
		return this.as2IdLek;
	}

	public void setAs2IdLek(int as2IdLek) {
		this.as2IdLek = as2IdLek;
	}

	public String getAs2Inny() {
		return this.as2Inny;
	}

	public void setAs2Inny(String as2Inny) {
		this.as2Inny = as2Inny;
	}

	public String getAs2Nazwisko() {
		return this.as2Nazwisko;
	}

	public void setAs2Nazwisko(String as2Nazwisko) {
		this.as2Nazwisko = as2Nazwisko;
	}

	public String getAs2Tytul() {
		return this.as2Tytul;
	}

	public void setAs2Tytul(String as2Tytul) {
		this.as2Tytul = as2Tytul;
	}

	public int getAs3IdLek() {
		return this.as3IdLek;
	}

	public void setAs3IdLek(int as3IdLek) {
		this.as3IdLek = as3IdLek;
	}

	public String getAs3Inny() {
		return this.as3Inny;
	}

	public void setAs3Inny(String as3Inny) {
		this.as3Inny = as3Inny;
	}

	public String getAs3Nazwisko() {
		return this.as3Nazwisko;
	}

	public void setAs3Nazwisko(String as3Nazwisko) {
		this.as3Nazwisko = as3Nazwisko;
	}

	public String getAs3Tytul() {
		return this.as3Tytul;
	}

	public void setAs3Tytul(String as3Tytul) {
		this.as3Tytul = as3Tytul;
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getIcd10() {
		return this.icd10;
	}

	public void setIcd10(String icd10) {
		this.icd10 = icd10;
	}

	public String getIcd10Opis() {
		return this.icd10Opis;
	}

	public void setIcd10Opis(String icd10Opis) {
		this.icd10Opis = icd10Opis;
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

	public int getIdAnest() {
		return this.idAnest;
	}

	public void setIdAnest(int idAnest) {
		this.idAnest = idAnest;
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

	public int getIdLekOper() {
		return this.idLekOper;
	}

	public void setIdLekOper(int idLekOper) {
		this.idLekOper = idLekOper;
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

	public int getIdZniecz() {
		return this.idZniecz;
	}

	public void setIdZniecz(int idZniecz) {
		this.idZniecz = idZniecz;
	}

	public String getImie() {
		return this.imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getImieAnest() {
		return this.imieAnest;
	}

	public void setImieAnest(String imieAnest) {
		this.imieAnest = imieAnest;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public String getNazwiskoAnest() {
		return this.nazwiskoAnest;
	}

	public void setNazwiskoAnest(String nazwiskoAnest) {
		this.nazwiskoAnest = nazwiskoAnest;
	}

	public String getNrKsGl() {
		return this.nrKsGl;
	}

	public void setNrKsGl(String nrKsGl) {
		this.nrKsGl = nrKsGl;
	}

	public String getNrKsOddz() {
		return this.nrKsOddz;
	}

	public void setNrKsOddz(String nrKsOddz) {
		this.nrKsOddz = nrKsOddz;
	}

	public String getNrOper() {
		return this.nrOper;
	}

	public void setNrOper(String nrOper) {
		this.nrOper = nrOper;
	}

	public String getNrSalaOddz() {
		return this.nrSalaOddz;
	}

	public void setNrSalaOddz(String nrSalaOddz) {
		this.nrSalaOddz = nrSalaOddz;
	}

	public String getNrSalaOper() {
		return this.nrSalaOper;
	}

	public void setNrSalaOper(String nrSalaOper) {
		this.nrSalaOper = nrSalaOper;
	}

	public String getOperNazwisko() {
		return this.operNazwisko;
	}

	public void setOperNazwisko(String operNazwisko) {
		this.operNazwisko = operNazwisko;
	}

	public String getOperTytul() {
		return this.operTytul;
	}

	public void setOperTytul(String operTytul) {
		this.operTytul = operTytul;
	}

	public String getOperatorInny() {
		return this.operatorInny;
	}

	public void setOperatorInny(String operatorInny) {
		this.operatorInny = operatorInny;
	}

	public String getOpisOper() {
		return this.opisOper;
	}

	public void setOpisOper(String opisOper) {
		this.opisOper = opisOper;
	}

	public String getPesel() {
		return this.pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getProcedura() {
		return this.procedura;
	}

	public void setProcedura(String procedura) {
		this.procedura = procedura;
	}

	public String getPunkty() {
		return this.punkty;
	}

	public void setPunkty(String punkty) {
		this.punkty = punkty;
	}

	public String getRozpoznanie() {
		return this.rozpoznanie;
	}

	public void setRozpoznanie(String rozpoznanie) {
		this.rozpoznanie = rozpoznanie;
	}

	public String getTytulAnest() {
		return this.tytulAnest;
	}

	public void setTytulAnest(String tytulAnest) {
		this.tytulAnest = tytulAnest;
	}

	public String getZnieczulenie() {
		return this.znieczulenie;
	}

	public void setZnieczulenie(String znieczulenie) {
		this.znieczulenie = znieczulenie;
	}

}