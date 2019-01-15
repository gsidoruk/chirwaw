package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;
import java.util.Date;
import java.util.List;


/**
 * The persistent class for the dzien_oper database table.
 * 
 */
@Entity
@Table(name="dzien_oper")
@NamedQuery(name="DzienOper.findAll", query="SELECT d FROM DzienOper d")
public class DzienOper implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Temporal(TemporalType.DATE)
	private Date data;

	private String uwagi;

	//bi-directional many-to-one association to RelLekDzien
	@OneToMany(mappedBy="dzienOper")
	private List<RelLekDzien> relLekDziens;

	public DzienOper() {
	}

	public Date getData() {
		return this.data;
	}

	public void setData(Date data) {
		this.data = data;
	}

	public String getUwagi() {
		return this.uwagi;
	}

	public void setUwagi(String uwagi) {
		this.uwagi = uwagi;
	}

	public List<RelLekDzien> getRelLekDziens() {
		return this.relLekDziens;
	}

	public void setRelLekDziens(List<RelLekDzien> relLekDziens) {
		this.relLekDziens = relLekDziens;
	}

	public RelLekDzien addRelLekDzien(RelLekDzien relLekDzien) {
		getRelLekDziens().add(relLekDzien);
		relLekDzien.setDzienOper(this);

		return relLekDzien;
	}

	public RelLekDzien removeRelLekDzien(RelLekDzien relLekDzien) {
		getRelLekDziens().remove(relLekDzien);
		relLekDzien.setDzienOper(null);

		return relLekDzien;
	}

}