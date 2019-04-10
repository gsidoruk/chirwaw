package pl.gsystems.chirwaw.service.impl;

import org.springframework.web.bind.annotation.*;
import pl.gsystems.chirwaw.dto.*;
import pl.gsystems.chirwaw.service.PacjentService;
import pl.gsystems.chirwaw.utils.RandomString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

@RestController
public class PacjentServiceImpl implements PacjentService {

	static Random generator = new Random();


	@Override
	public PacjentComplexDto getPacjentAllData(int id) {
		return null;
	}

	@Override
	public PacjentDto getPacjent(int id) {
		return mockPacjent(id);
	}

	@Override
	public int savePacjent(PacjentDto dto) {
		return generator.nextInt(1000);
	}

	@Override
	public boolean deletePacjent( int id) {
		return true;

	}

	@Override
	public List<PacjentChorobaSearchResultDto> serchPacjent(PacjentChorobaSearchDto srearchCriteria, final int offset, final int limit) {
		List<PacjentChorobaSearchResultDto> pacjents = new ArrayList<>();
		for (int j = 0 ; j < generator.nextInt(offset); j++) {
			PacjentChorobaSearchResultDto pacjentDto = mockPacjentSearchResultDto(j);
			pacjents.add(pacjentDto);
		}
		return pacjents;
	}

	public static PacjentDto mockPacjent(int i) {
		PacjentDto pacjent = new PacjentDto();
		pacjent.setPacjentId(i);
		pacjent.setDataZgonu(new Date());
		pacjent.setImie(new RandomString(5).nextString());
		pacjent.setNazwisko(new RandomString(8).nextString());
		pacjent.setPesel(new RandomString(11, true).nextString());
		pacjent.setTelKontakt(new RandomString(9, true).nextString());

		List<ChorobaDto> chorobas = new ArrayList<ChorobaDto>();
		for (int j = 0 ; j < generator.nextInt(4); j++) {
			ChorobaDto chorobaDto = ChorobaServiceImpl.mockChor(j);
			chorobas.add(chorobaDto);
		}
	//	pacjent.setChorobas(chorobas);
		return pacjent;
	}

	public static PacjentChorobaSearchResultDto mockPacjentSearchResultDto(int i) {
		PacjentChorobaSearchResultDto pacjent = new PacjentChorobaSearchResultDto();
		pacjent.setPacjentId(i);
		pacjent.setDataZgonu(new Date());
		pacjent.setImie(new RandomString(5).nextString());
		pacjent.setNazwisko(new RandomString(8).nextString());
		pacjent.setPesel(new RandomString(11, true).nextString());
	//	pacjent.setTelKontakt(new RandomString(9, true).nextString());

		List<ChorobaDto> chorobas = new ArrayList<ChorobaDto>();
		for (int j = 0 ; j < generator.nextInt(4); j++) {
			ChorobaDto chorobaDto = ChorobaServiceImpl.mockChor(j);
			chorobas.add(chorobaDto);
		}
	//	pacjent.setChorobas(chorobas);
		return pacjent;
	}
}
