package pl.gsystems.chirwaw.dto;

import lombok.Data;
import pl.gsystems.chirwaw.dao.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
public class ChorobaDto implements Serializable {

	private Integer idChor;

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

	private PacjentDto pacjent;

	private Tryb tryb;

	private List<OperacjaDto> operacjas;

	private List<ProtokolDto> protokols;

}