package pl.gsystems.chirwaw.dto;

import lombok.Getter;
import lombok.Setter;
import pl.gsystems.chirwaw.dto.enums.ChorobaStan;
import pl.gsystems.chirwaw.dto.enums.Tryb;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Setter
public class PacjentChorobaSearchDto implements Serializable {
	private static final long serialVersionUID = 1L;


	private Integer pacjentId;

	private Date dataZgonuStart;

	private Date dataZgonuEnd;

	private String imie;

	private String nazwisko;

	private String pesel;

	private String telKontakt;

	// choroba:

	private Integer chorobaId;

	private Boolean czyNagla;

	private Date dataPrzyjeciaStart;

	private Date dataPrzyjeciaEnd;

	private Date dataWprowStart;

	private Date dataWprowEnd;

	private Date dataZgloszeniaStart;

	private Date dataZgloszeniaEnd;

	private String nrSalaOddz;

	private Boolean potwierdzenie;

	private String rodzOper;

	private String uwagi;

	private List<ChorobaStan> decyzja;

	private String icd10;

	private Integer icd9;

	private Integer lekarzProwadzacyId;

	private Integer lekarzRejestrujacyId;

	private String odcinekId;

	private List<Tryb> tryb;

}