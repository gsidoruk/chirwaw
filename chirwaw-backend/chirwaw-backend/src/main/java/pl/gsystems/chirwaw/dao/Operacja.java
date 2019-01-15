package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;


/**
 * The persistent class for the operacja database table.
 * 
 */
@Entity
@Table(name="operacja")
@NamedQuery(name="Operacja.findAll", query="SELECT o FROM Operacja o")
public class Operacja implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_oper")
	private int idOper;

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

	@Column(name="id_lek_oper")
	private int idLekOper;

	@Column(name="nr_ekranowy")
	private int nrEkranowy;

	@Column(name="nr_sala_oper")
	private String nrSalaOper;

	@Column(name="oper_opis")
	private String operOpis;

	@Column(name="operator_inny")
	private String operatorInny;

	@Column(name="rozp_opis")
	private String rozpOpis;

	//bi-directional many-to-one association to Choroba
	@ManyToOne
	@JoinColumn(name="id_chor")
	private Choroba choroba;

	public Operacja() {
	}

	public int getIdOper() {
		return this.idOper;
	}

	public void setIdOper(int idOper) {
		this.idOper = idOper;
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

	public int getIdLekOper() {
		return this.idLekOper;
	}

	public void setIdLekOper(int idLekOper) {
		this.idLekOper = idLekOper;
	}

	public int getNrEkranowy() {
		return this.nrEkranowy;
	}

	public void setNrEkranowy(int nrEkranowy) {
		this.nrEkranowy = nrEkranowy;
	}

	public String getNrSalaOper() {
		return this.nrSalaOper;
	}

	public void setNrSalaOper(String nrSalaOper) {
		this.nrSalaOper = nrSalaOper;
	}

	public String getOperOpis() {
		return this.operOpis;
	}

	public void setOperOpis(String operOpis) {
		this.operOpis = operOpis;
	}

	public String getOperatorInny() {
		return this.operatorInny;
	}

	public void setOperatorInny(String operatorInny) {
		this.operatorInny = operatorInny;
	}

	public String getRozpOpis() {
		return this.rozpOpis;
	}

	public void setRozpOpis(String rozpOpis) {
		this.rozpOpis = rozpOpis;
	}

	public Choroba getChoroba() {
		return this.choroba;
	}

	public void setChoroba(Choroba choroba) {
		this.choroba = choroba;
	}

}