package pl.gsystems.chirwaw.api.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Data;

@Data
public class OperacjaDto implements Serializable {
	
	private Integer idOper;
	
	private Integer idChor;

	private Integer OperatorLekId;
	private String operatorInny;
	
	private int as1IdLek;
	private String as1Inny;

	private int as2IdLek;
	private String as2Inny;


	private int as3IdLek;
	private String as3Inny;

	private Date data;
	private String rozpOpis;
	private String opisOperacji;
	private Integer idAnest;
	private String nrSalaOper;
	private Integer nrEkranowy;

}