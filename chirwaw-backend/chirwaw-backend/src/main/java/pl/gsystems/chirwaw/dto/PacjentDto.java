package pl.gsystems.chirwaw.dto;

import pl.gsystems.chirwaw.dao.Choroba;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


public class PacjentDto implements Serializable {
	private static final long serialVersionUID = 1L;


	private int idPac;

	private Date dataWprow;

	private Date dataZgonu;

	private int idLekarzaRej;

	private String imie;

	private String nazwisko;

	private String pesel;

	private String telKontakt;

	private List<ChorobaDto> chorobas;

}