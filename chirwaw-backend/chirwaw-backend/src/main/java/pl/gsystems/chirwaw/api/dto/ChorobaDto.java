package pl.gsystems.chirwaw.api.dto;

import lombok.Getter;
import lombok.Setter;
import pl.gsystems.chirwaw.common.enums.ChorobaStan;
import pl.gsystems.chirwaw.common.enums.Tryb;

import java.io.Serializable;
import java.util.Date;


@Getter
@Setter
public class ChorobaDto implements Serializable {

	private Integer chorobaId;

	private Integer pacjentId;

	private boolean czyNagla;

	private Date dataPrzyjecia;

	private Date dataWprow;

	private Date dataZgloszenia;

	private String nrSalaOddz;

	private boolean potwierdzenie;

	private String rodzOper;

	private String uwagi;

	private ChorobaStan decyzja;

	private String icd10;

	private Integer icd9;

	private Integer lekarzProwadzacyId;

	private Integer lekarzRejestrujacyId;

	private String odcinekId;

	private Tryb tryb;

}