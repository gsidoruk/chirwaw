package pl.gsystems.chirwaw.dao;

import java.io.Serializable;
import javax.persistence.*;


/**
 * The persistent class for the SLO_SALA_OPER database table.
 * 
 */
@Entity
@Table(name="SLO_SALA_OPER")
@NamedQuery(name="SloSalaOper.findAll", query="SELECT s FROM SloSalaOper s")
public class SloSalaOper implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="nr_sala_oper")
	private String nrSalaOper;

	public SloSalaOper() {
	}

	public String getNrSalaOper() {
		return this.nrSalaOper;
	}

	public void setNrSalaOper(String nrSalaOper) {
		this.nrSalaOper = nrSalaOper;
	}

}