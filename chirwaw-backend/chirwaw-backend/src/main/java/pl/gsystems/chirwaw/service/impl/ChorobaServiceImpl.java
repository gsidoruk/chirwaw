package pl.gsystems.chirwaw.service.impl;

import java.util.Date;
import java.util.List;
import java.util.Random;

import pl.gsystems.chirwaw.dto.ChorobaDto;
import pl.gsystems.chirwaw.dto.ChorobaStan;
import pl.gsystems.chirwaw.dto.PacjentDto;
import pl.gsystems.chirwaw.service.ChorobaService;
import pl.gsystems.chirwaw.utils.RandomString;

public class ChorobaServiceImpl implements ChorobaService {

	static Random generator = new Random();
	
	@Override
	public int saveChoroba(int pacjentId, ChorobaDto choroba) {

		int i = generator.nextInt(1000);
		return i;
	}

	@Override
	public boolean changeStatus(int chorobaId, ChorobaStan status) {
		// TODO Auto-generated method stub
		return (generator.nextInt(10) % 2 == 0 ) ? true : false;
	}

	@Override
	public List<ChorobaDto> serchChoroba(ChorobaDto srearchCriteria, int limit, int offset) {
		int num = generator.nextInt(10);
		for(int i =0; i < num; i++) {
			ChorobaDto chor = new ChorobaDto();
		}
		return null;
	}

	public static ChorobaDto mockChor(int i) {
		ChorobaDto chor = new ChorobaDto();
		chor.setPacjentId(generator.nextInt(1000));
		chor.setCzyNagla(false);
		chor.setDataPrzyjecia(new Date());
		chor.setDataWprow(new Date());
		chor.setDataZgloszenia(new Date());
		chor.setDecyzja(getStatus(i));
		chor.setIcd10(new RandomString(3).nextString());
		chor.setIcd9(generator.nextInt(7));
		chor.setIdChor(generator.nextInt(10));
		chor.setLekarzProwadzacyId(generator.nextInt(100));
		chor.setLekarzRejestrujacyId(generator.nextInt(100));
		chor.setNrSalaOddz(""+generator.nextInt(10));
		chor.setOdcinekId(""+generator.nextInt(10));
		chor.setPotwierdzenie(i%2 == 0);
		return chor;
	}

	private static ChorobaStan getStatus(int i) {
		if(i%6 == 0) return ChorobaStan.ARCHIWALNY;
		if(i%6 == 1) return ChorobaStan.GOTOWY;
		if(i%6 == 2) return ChorobaStan.OCZEKUJE;
		if(i%6 == 3) return ChorobaStan.REZYGNACJA;
		if(i%6 == 4) return ChorobaStan.ZAKWALIFIKOWANY;
		return ChorobaStan.ZAPLANOWANY;
	}

}
