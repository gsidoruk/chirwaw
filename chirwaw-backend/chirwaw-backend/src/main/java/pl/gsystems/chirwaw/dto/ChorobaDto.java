package pl.gsystems.chirwaw.dto;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Getter
@Setter
public class ChorobaDto implements Serializable {

	private Integer idChor;

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