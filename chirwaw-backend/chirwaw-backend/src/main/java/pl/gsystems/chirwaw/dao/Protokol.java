package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the protokol database table.
 * 
 */
@Entity
@Table(name="protokol")
@NamedQuery(name="Protokol.findAll", query="SELECT p FROM Protokol p")
public class Protokol implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_prot")
	private int idProt;

	private String archiwum;

	@Column(name="as1_id_lek")
	private int as1IdLek;

	@Column(name="as1_inny")
	private String as1Inny;

	@Column(name="as2_id_lek")
	private int as2IdLek;

	@Column(name="as2_inny")
	private String as2Inny;

	@Column(name="as3_id_lek")
	private int as3IdLek;

	@Column(name="as3_inny")
	private String as3Inny;

	@Temporal(TemporalType.DATE)
	private Date data;

	@Column(name="id_anest")
	private int idAnest;

	@Column(name="id_icd9")
	private int idIcd9;

	@Column(name="id_lek_oper")
	private int idLekOper;

	@Column(name="id_zniecz")
	private int idZniecz;

	@Column(name="nr_ks_gl")
	private String nrKsGl;

	@Column(name="nr_ks_oddz")
	private String nrKsOddz;

	@Column(name="nr_oper")
	private String nrOper;

	@Column(name="nr_sala_oper")
	private String nrSalaOper;

	@Column(name="operator_inny")
	private String operatorInny;

	@Column(name="opis_oper")
	private String opisOper;

	private String procedura;

	private String punkty;

	private String rozpoznanie;

	//bi-directional many-to-one association to Choroba
	@ManyToOne
	@JoinColumn(name="id_chor")
	private Choroba choroba;

	public Protokol() {
	}

	public int getIdProt() {
		return this.idProt;
	}

	public void setIdProt(int idProt) {
		this.idProt = idProt;
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

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public int getIdAnest() {
		return this.idAnest;
	}

	public void setIdAnest(int idAnest) {
		this.idAnest = idAnest;
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

	public int getIdZniecz() {
		return this.idZniecz;
	}

	public void setIdZniecz(int idZniecz) {
		this.idZniecz = idZniecz;
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

	public String getNrSalaOper() {
		return this.nrSalaOper;
	}

	public void setNrSalaOper(String nrSalaOper) {
		this.nrSalaOper = nrSalaOper;
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

	public Choroba getChoroba() {
		return this.choroba;
	}

	public void setChoroba(Choroba choroba) {
		this.choroba = choroba;
	}

}