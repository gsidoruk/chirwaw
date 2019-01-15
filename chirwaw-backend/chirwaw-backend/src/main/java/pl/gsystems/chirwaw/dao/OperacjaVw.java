package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the OPERACJA_VW database table.
 * 
 */
@Entity
@Table(name="OPERACJA_VW")
@NamedQuery(name="OperacjaVw.findAll", query="SELECT o FROM OperacjaVw o")
public class OperacjaVw implements Serializable {
	private static final long serialVersionUID = 1L;

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

	@Column(name="id_anest")
	private int idAnest;

	@Column(name="id_chor")
	private int idChor;

	@Column(name="id_dec")
	private String idDec;

	@Column(name="id_lek_oper")
	private int idLekOper;

	@Column(name="id_oper")
	private int idOper;

	@Column(name="id_pac")
	private int idPac;

	private String imie;

	@Column(name="imie_anest")
	private String imieAnest;

	private String nazwisko;

	@Column(name="nazwisko_anest")
	private String nazwiskoAnest;

	@Column(name="nr_ekranowy")
	private int nrEkranowy;

	@Column(name="nr_sala_oddz")
	private String nrSalaOddz;

	@Column(name="nr_sala_oper")
	private String nrSalaOper;

	@Column(name="oper_nazwisko")
	private String operNazwisko;

	@Column(name="oper_opis")
	private String operOpis;

	@Column(name="oper_tytul")
	private String operTytul;

	@Column(name="operator_inny")
	private String operatorInny;

	private String pesel;

	private String punkty;

	@Column(name="rodz_oper")
	private String rodzOper;

	@Column(name="rozp_opis")
	private String rozpOpis;

	private String rozpozn;

	@Column(name="tytul_anest")
	private String tytulAnest;

	public OperacjaVw() {
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

	public int getIdLekOper() {
		return this.idLekOper;
	}

	public void setIdLekOper(int idLekOper) {
		this.idLekOper = idLekOper;
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

	public int getNrEkranowy() {
		return this.nrEkranowy;
	}

	public void setNrEkranowy(int nrEkranowy) {
		this.nrEkranowy = nrEkranowy;
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

	public String getOperOpis() {
		return this.operOpis;
	}

	public void setOperOpis(String operOpis) {
		this.operOpis = operOpis;
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

	public String getPesel() {
		return this.pesel;
	}

	public void setPesel(String pesel) {
		this.pesel = pesel;
	}

	public String getPunkty() {
		return this.punkty;
	}

	public void setPunkty(String punkty) {
		this.punkty = punkty;
	}

	public String getRodzOper() {
		return this.rodzOper;
	}

	public void setRodzOper(String rodzOper) {
		this.rodzOper = rodzOper;
	}

	public String getRozpOpis() {
		return this.rozpOpis;
	}

	public void setRozpOpis(String rozpOpis) {
		this.rozpOpis = rozpOpis;
	}

	public String getRozpozn() {
		return this.rozpozn;
	}

	public void setRozpozn(String rozpozn) {
		this.rozpozn = rozpozn;
	}

	public String getTytulAnest() {
		return this.tytulAnest;
	}

	public void setTytulAnest(String tytulAnest) {
		this.tytulAnest = tytulAnest;
	}

}