package pl.gsystems.chirwaw.api.dto;

import java.io.Serializable;
import java.util.Date;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PacjentSearchDto implements Serializable {
	private static final long serialVersionUID = 1L;


	private Integer pacjentId;

	private String imie;

	private String nazwisko;

	private String pesel;

	private String telKontakt;

	private Date dataZgonuStart;

	private Date dataZgonuEnd;
}