package pl.gsystems.chirwaw.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Setter
public class PacjentDto implements Serializable {
	private static final long serialVersionUID = 1L;


	private Integer pacjentId;

	private Date dataZgonu;

	private String imie;

	private String nazwisko;

	private String pesel;

	private String telKontakt;

}