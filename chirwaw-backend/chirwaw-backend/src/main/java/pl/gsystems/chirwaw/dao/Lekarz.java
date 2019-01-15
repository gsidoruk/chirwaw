package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.sql.Time;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the lekarz database table.
 * 
 */
@Entity
@Table(name="lekarz")
@NamedQuery(name="Lekarz.findAll", query="SELECT l FROM Lekarz l")
public class Lekarz implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="id_lekarza")
	private int idLekarza;

	@Column(name="admin_apteczka")
	private String adminApteczka;

	@Column(name="admin_magazyn")
	private String adminMagazyn;

	private String administrator;

	private String aktywnosc;

	@Column(name="cofanie_archiwum_protok_oper")
	private String cofanieArchiwumProtokOper;

	@Column(name="czy_lekarz")
	private String czyLekarz;

	@Temporal(TemporalType.DATE)
	@Column(name="data_waznosci_hasla")
	private Date dataWaznosciHasla;

	@Column(name="dobowa_norma_dyzuru")
	private Time dobowaNormaDyzuru;

	@Column(name="ed_por")
	private String edPor;

	@Column(name="ed_sem")
	private String edSem;

	@Column(name="ed_url")
	private String edUrl;

	@Column(name="ed_uwag_dnia")
	private String edUwagDnia;

	private String edycja;

	@Column(name="ewid_czasu_pracy")
	private String ewidCzasuPracy;

	@Column(name="export_protokol_vw_to_csv")
	private String exportProtokolVwToCsv;

	@Column(name="gen_rap")
	private String genRap;

	@Column(name="haslo_hash")
	private String hasloHash;

	private String imie;

	private String kwalifikowanie;

	private String login;

	private String logowanie;

	private String nazwisko;

	@Column(name="norma_dobowa_czasu")
	private Time normaDobowaCzasu;

	@Column(name="norma_tyg_czasu")
	private Time normaTygCzasu;

	@Column(name="plan_oper")
	private String planOper;

	private String prof;

	@Column(name="raport_czasu_pracy")
	private String raportCzasuPracy;

	private String status;

	@Column(name="super_login")
	private String superLogin;

	private String tytul;

	@Column(name="wymiar_zat")
	private String wymiarZat;

	@Column(name="zmiana_przypisania_chor_do_pac")
	private String zmianaPrzypisaniaChorDoPac;

	//bi-directional many-to-one association to RelLekDzien
	@OneToMany(mappedBy="lekarz")
	private List<RelLekDzien> relLekDziens;

	//bi-directional many-to-one association to Choroba
	@OneToMany(mappedBy="lekarz1")
	private List<Choroba> chorobas1;

	//bi-directional many-to-one association to Choroba
	@OneToMany(mappedBy="lekarz2")
	private List<Choroba> chorobas2;

	//bi-directional many-to-one association to Odcinek
	@ManyToOne
	@JoinColumn(name="id_odcinka")
	private Odcinek odcinek;

	public Lekarz() {
	}

	public int getIdLekarza() {
		return this.idLekarza;
	}

	public void setIdLekarza(int idLekarza) {
		this.idLekarza = idLekarza;
	}

	public String getAdminApteczka() {
		return this.adminApteczka;
	}

	public void setAdminApteczka(String adminApteczka) {
		this.adminApteczka = adminApteczka;
	}

	public String getAdminMagazyn() {
		return this.adminMagazyn;
	}

	public void setAdminMagazyn(String adminMagazyn) {
		this.adminMagazyn = adminMagazyn;
	}

	public String getAdministrator() {
		return this.administrator;
	}

	public void setAdministrator(String administrator) {
		this.administrator = administrator;
	}

	public String getAktywnosc() {
		return this.aktywnosc;
	}

	public void setAktywnosc(String aktywnosc) {
		this.aktywnosc = aktywnosc;
	}

	public String getCofanieArchiwumProtokOper() {
		return this.cofanieArchiwumProtokOper;
	}

	public void setCofanieArchiwumProtokOper(String cofanieArchiwumProtokOper) {
		this.cofanieArchiwumProtokOper = cofanieArchiwumProtokOper;
	}

	public String getCzyLekarz() {
		return this.czyLekarz;
	}

	public void setCzyLekarz(String czyLekarz) {
		this.czyLekarz = czyLekarz;
	}

	public Date getDataWaznosciHasla() {
		return this.dataWaznosciHasla;
	}

	public void setDataWaznosciHasla(Date dataWaznosciHasla) {
		this.dataWaznosciHasla = dataWaznosciHasla;
	}

	public Time getDobowaNormaDyzuru() {
		return this.dobowaNormaDyzuru;
	}

	public void setDobowaNormaDyzuru(Time dobowaNormaDyzuru) {
		this.dobowaNormaDyzuru = dobowaNormaDyzuru;
	}

	public String getEdPor() {
		return this.edPor;
	}

	public void setEdPor(String edPor) {
		this.edPor = edPor;
	}

	public String getEdSem() {
		return this.edSem;
	}

	public void setEdSem(String edSem) {
		this.edSem = edSem;
	}

	public String getEdUrl() {
		return this.edUrl;
	}

	public void setEdUrl(String edUrl) {
		this.edUrl = edUrl;
	}

	public String getEdUwagDnia() {
		return this.edUwagDnia;
	}

	public void setEdUwagDnia(String edUwagDnia) {
		this.edUwagDnia = edUwagDnia;
	}

	public String getEdycja() {
		return this.edycja;
	}

	public void setEdycja(String edycja) {
		this.edycja = edycja;
	}

	public String getEwidCzasuPracy() {
		return this.ewidCzasuPracy;
	}

	public void setEwidCzasuPracy(String ewidCzasuPracy) {
		this.ewidCzasuPracy = ewidCzasuPracy;
	}

	public String getExportProtokolVwToCsv() {
		return this.exportProtokolVwToCsv;
	}

	public void setExportProtokolVwToCsv(String exportProtokolVwToCsv) {
		this.exportProtokolVwToCsv = exportProtokolVwToCsv;
	}

	public String getGenRap() {
		return this.genRap;
	}

	public void setGenRap(String genRap) {
		this.genRap = genRap;
	}

	public String getHasloHash() {
		return this.hasloHash;
	}

	public void setHasloHash(String hasloHash) {
		this.hasloHash = hasloHash;
	}

	public String getImie() {
		return this.imie;
	}

	public void setImie(String imie) {
		this.imie = imie;
	}

	public String getKwalifikowanie() {
		return this.kwalifikowanie;
	}

	public void setKwalifikowanie(String kwalifikowanie) {
		this.kwalifikowanie = kwalifikowanie;
	}

	public String getLogin() {
		return this.login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getLogowanie() {
		return this.logowanie;
	}

	public void setLogowanie(String logowanie) {
		this.logowanie = logowanie;
	}

	public String getNazwisko() {
		return this.nazwisko;
	}

	public void setNazwisko(String nazwisko) {
		this.nazwisko = nazwisko;
	}

	public Time getNormaDobowaCzasu() {
		return this.normaDobowaCzasu;
	}

	public void setNormaDobowaCzasu(Time normaDobowaCzasu) {
		this.normaDobowaCzasu = normaDobowaCzasu;
	}

	public Time getNormaTygCzasu() {
		return this.normaTygCzasu;
	}

	public void setNormaTygCzasu(Time normaTygCzasu) {
		this.normaTygCzasu = normaTygCzasu;
	}

	public String getPlanOper() {
		return this.planOper;
	}

	public void setPlanOper(String planOper) {
		this.planOper = planOper;
	}

	public String getProf() {
		return this.prof;
	}

	public void setProf(String prof) {
		this.prof = prof;
	}

	public String getRaportCzasuPracy() {
		return this.raportCzasuPracy;
	}

	public void setRaportCzasuPracy(String raportCzasuPracy) {
		this.raportCzasuPracy = raportCzasuPracy;
	}

	public String getStatus() {
		return this.status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getSuperLogin() {
		return this.superLogin;
	}

	public void setSuperLogin(String superLogin) {
		this.superLogin = superLogin;
	}

	public String getTytul() {
		return this.tytul;
	}

	public void setTytul(String tytul) {
		this.tytul = tytul;
	}

	public String getWymiarZat() {
		return this.wymiarZat;
	}

	public void setWymiarZat(String wymiarZat) {
		this.wymiarZat = wymiarZat;
	}

	public String getZmianaPrzypisaniaChorDoPac() {
		return this.zmianaPrzypisaniaChorDoPac;
	}

	public void setZmianaPrzypisaniaChorDoPac(String zmianaPrzypisaniaChorDoPac) {
		this.zmianaPrzypisaniaChorDoPac = zmianaPrzypisaniaChorDoPac;
	}

	public List<RelLekDzien> getRelLekDziens() {
		return this.relLekDziens;
	}

	public void setRelLekDziens(List<RelLekDzien> relLekDziens) {
		this.relLekDziens = relLekDziens;
	}

	public RelLekDzien addRelLekDzien(RelLekDzien relLekDzien) {
		getRelLekDziens().add(relLekDzien);
		relLekDzien.setLekarz(this);

		return relLekDzien;
	}

	public RelLekDzien removeRelLekDzien(RelLekDzien relLekDzien) {
		getRelLekDziens().remove(relLekDzien);
		relLekDzien.setLekarz(null);

		return relLekDzien;
	}

	public List<Choroba> getChorobas1() {
		return this.chorobas1;
	}

	public void setChorobas1(List<Choroba> chorobas1) {
		this.chorobas1 = chorobas1;
	}

	public Choroba addChorobas1(Choroba chorobas1) {
		getChorobas1().add(chorobas1);
		chorobas1.setLekarz1(this);

		return chorobas1;
	}

	public Choroba removeChorobas1(Choroba chorobas1) {
		getChorobas1().remove(chorobas1);
		chorobas1.setLekarz1(null);

		return chorobas1;
	}

	public List<Choroba> getChorobas2() {
		return this.chorobas2;
	}

	public void setChorobas2(List<Choroba> chorobas2) {
		this.chorobas2 = chorobas2;
	}

	public Choroba addChorobas2(Choroba chorobas2) {
		getChorobas2().add(chorobas2);
		chorobas2.setLekarz2(this);

		return chorobas2;
	}

	public Choroba removeChorobas2(Choroba chorobas2) {
		getChorobas2().remove(chorobas2);
		chorobas2.setLekarz2(null);

		return chorobas2;
	}

	public Odcinek getOdcinek() {
		return this.odcinek;
	}

	public void setOdcinek(Odcinek odcinek) {
		this.odcinek = odcinek;
	}

}