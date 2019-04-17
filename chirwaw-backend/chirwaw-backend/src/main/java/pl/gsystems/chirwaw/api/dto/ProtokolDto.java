package pl.gsystems.chirwaw.api.dto;

import java.io.Serializable;

import lombok.Data;

import java.util.Date;


@Data
public class ProtokolDto implements Serializable {

	private Integer idProt;

	private Integer idChor;
	
	private Integer idLekOper;
	private String operatorInny;
	
	private Integer as1IdLek;
	private String as1Inny;

	private Integer as2IdLek;
	private String as2Inny;

	private Integer as3IdLek;
	private String as3Inny;

	private Date data;

	private Integer idAnest;

	private Integer idIcd9;

	private boolean archiwum;
	
	private Integer idZniecz;

	private String nrKsGl;

	private String nrKsOddz;

	private String nrOper;

	private String nrSalaOper;

	private String opisOper;

	private String procedura;

	private String punkty;

	private String rozpoznanie;

}