package pl.gsystems.chirwaw.dto;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
public class PacjentComplexDto implements Serializable {
	private static final long serialVersionUID = 1L;


	private Integer pacjentId;

	private OperacjaComplexDto operacja;

	private Date dataZgonu;

	private String imie;

	private String nazwisko;

	private String pesel;

	private String telKontakt;

}