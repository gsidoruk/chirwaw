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
public class ChorobaComplexDto implements Serializable {

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

	private List<OperacjaDto> operacjas;

	private List<ProtokolDto> protokols;

}