package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the choroba database table.
 * 
 */
@Entity
@Table(name="choroba")
@NamedQuery(name="Choroba.findAll", query="SELECT c FROM Choroba c")
public class Choroba implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_chor")
	private int idChor;

	private String browser;

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

	@Temporal(TemporalType.DATE)
	@Column(name="data_zgonu")
	private Date dataZgonu;

	private String ip;

	@Column(name="nr_sala_oddz")
	private String nrSalaOddz;

	private String potwierdzenie;

	@Column(name="rodz_oper")
	private String rodzOper;

	private String uwagi;

	//bi-directional many-to-one association to SloDec
	@ManyToOne
	@JoinColumn(name="id_dec")
	private SloDec sloDec;

	//bi-directional many-to-one association to Icd10
	@ManyToOne
	@JoinColumn(name="icd10")
	private Icd10 icd10Bean;

	//bi-directional many-to-one association to Icd9
	@ManyToOne
	@JoinColumn(name="id_icd9")
	private Icd9 icd9;

	//bi-directional many-to-one association to Lekarz
	@ManyToOne
	@JoinColumn(name="id_lekarza")
	private Lekarz lekarz1;

	//bi-directional many-to-one association to Lekarz
	@ManyToOne
	@JoinColumn(name="id_lekarza_rej")
	private Lekarz lekarz2;

	//bi-directional many-to-one association to Odcinek
	@ManyToOne
	@JoinColumn(name="id_odcinka")
	private Odcinek odcinek;

	//bi-directional many-to-one association to Pacjent
	@ManyToOne
	@JoinColumn(name="id_pac")
	private Pacjent pacjent;

	//bi-directional many-to-one association to SloTryby
	@ManyToOne
	@JoinColumn(name="id_trybu")
	private SloTryby sloTryby;

	//bi-directional many-to-one association to Operacja
	@OneToMany(mappedBy="choroba")
	private List<Operacja> operacjas;

	//bi-directional many-to-one association to Protokol
	@OneToMany(mappedBy="choroba")
	private List<Protokol> protokols;

	public Choroba() {
	}

	public int getIdChor() {
		return this.idChor;
	}

	public void setIdChor(int idChor) {
		this.idChor = idChor;
	}

	public String getBrowser() {
		return this.browser;
	}

	public void setBrowser(String browser) {
		this.browser = browser;
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

	public Date getDataZgonu() {
		return this.dataZgonu;
	}

	public void setDataZgonu(Date dataZgonu) {
		this.dataZgonu = dataZgonu;
	}

	public String getIp() {
		return this.ip;
	}

	public void setIp(String ip) {
		this.ip = ip;
	}

	public String getNrSalaOddz() {
		return this.nrSalaOddz;
	}

	public void setNrSalaOddz(String nrSalaOddz) {
		this.nrSalaOddz = nrSalaOddz;
	}

	public String getPotwierdzenie() {
		return this.potwierdzenie;
	}

	public void setPotwierdzenie(String potwierdzenie) {
		this.potwierdzenie = potwierdzenie;
	}

	public String getRodzOper() {
		return this.rodzOper;
	}

	public void setRodzOper(String rodzOper) {
		this.rodzOper = rodzOper;
	}

	public String getUwagi() {
		return this.uwagi;
	}

	public void setUwagi(String uwagi) {
		this.uwagi = uwagi;
	}

	public SloDec getSloDec() {
		return this.sloDec;
	}

	public void setSloDec(SloDec sloDec) {
		this.sloDec = sloDec;
	}

	public Icd10 getIcd10Bean() {
		return this.icd10Bean;
	}

	public void setIcd10Bean(Icd10 icd10Bean) {
		this.icd10Bean = icd10Bean;
	}

	public Icd9 getIcd9() {
		return this.icd9;
	}

	public void setIcd9(Icd9 icd9) {
		this.icd9 = icd9;
	}

	public Lekarz getLekarz1() {
		return this.lekarz1;
	}

	public void setLekarz1(Lekarz lekarz1) {
		this.lekarz1 = lekarz1;
	}

	public Lekarz getLekarz2() {
		return this.lekarz2;
	}

	public void setLekarz2(Lekarz lekarz2) {
		this.lekarz2 = lekarz2;
	}

	public Odcinek getOdcinek() {
		return this.odcinek;
	}

	public void setOdcinek(Odcinek odcinek) {
		this.odcinek = odcinek;
	}

	public Pacjent getPacjent() {
		return this.pacjent;
	}

	public void setPacjent(Pacjent pacjent) {
		this.pacjent = pacjent;
	}

	public SloTryby getSloTryby() {
		return this.sloTryby;
	}

	public void setSloTryby(SloTryby sloTryby) {
		this.sloTryby = sloTryby;
	}

	public List<Operacja> getOperacjas() {
		return this.operacjas;
	}

	public void setOperacjas(List<Operacja> operacjas) {
		this.operacjas = operacjas;
	}

	public Operacja addOperacja(Operacja operacja) {
		getOperacjas().add(operacja);
		operacja.setChoroba(this);

		return operacja;
	}

	public Operacja removeOperacja(Operacja operacja) {
		getOperacjas().remove(operacja);
		operacja.setChoroba(null);

		return operacja;
	}

	public List<Protokol> getProtokols() {
		return this.protokols;
	}

	public void setProtokols(List<Protokol> protokols) {
		this.protokols = protokols;
	}

	public Protokol addProtokol(Protokol protokol) {
		getProtokols().add(protokol);
		protokol.setChoroba(this);

		return protokol;
	}

	public Protokol removeProtokol(Protokol protokol) {
		getProtokols().remove(protokol);
		protokol.setChoroba(null);

		return protokol;
	}

}