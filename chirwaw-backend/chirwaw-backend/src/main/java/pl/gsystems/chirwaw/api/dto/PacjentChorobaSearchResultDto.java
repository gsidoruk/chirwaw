package pl.gsystems.chirwaw.api.dto;

import lombok.Getter;
import lombok.Setter;
import pl.gsystems.chirwaw.common.enums.ChorobaStan;
import pl.gsystems.chirwaw.common.enums.Tryb;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
public class PacjentChorobaSearchResultDto implements Serializable {
	private static final long serialVersionUID = 1L;


	private int pacjentId;

	private Date dataZgonu;

	private String imie;

	private String nazwisko;

	private String pesel;

	// choroba:

	private int chorobaId;

	private boolean czyNagla;

	private Date dataZgloszenia;

	private String rodzOper;

	private ChorobaStan decyzja;

	private String icd10;

	private Integer icd9;

	private Integer lekarzProwadzacyId;

	private String lekarzProwadzacy;

	private Tryb tryb;

}