package pl.gsystems.chirwaw.dto;

import lombok.Data;
import pl.gsystems.chirwaw.dao.*;

import java.io.Serializable;
import java.util.Date;
import java.util.List;


@Data
public class ChorobaDto implements Serializable {

	private int idChor;

	private String czyNagla;

	private Date dataPrzyjecia;

	private Date dataWprow;

	private Date dataZgloszenia;

	private String nrSalaOddz;

	private String potwierdzenie;

	private String rodzOper;

	private String uwagi;

	private SloDec sloDec;

	private Icd10 icd10;

	private Icd9 icd9;

	private Lekarz lekarz1;

	private Lekarz lekarzRej;

	private Odcinek odcinek;

	private PacjentDto pacjent;

	private SloTryby sloTryby;

	private List<Operacja> operacjas;

	private List<Protokol> protokols;

}