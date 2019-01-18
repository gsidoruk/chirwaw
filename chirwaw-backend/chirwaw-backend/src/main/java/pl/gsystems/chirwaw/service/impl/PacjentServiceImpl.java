package pl.gsystems.chirwaw.service.impl;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;
import pl.gsystems.chirwaw.dto.ChorobaDto;
import pl.gsystems.chirwaw.dto.ChorobaStan;
import pl.gsystems.chirwaw.dto.PacjentDto;
import pl.gsystems.chirwaw.service.ChorobaService;
import pl.gsystems.chirwaw.service.PacjentService;
import pl.gsystems.chirwaw.utils.RandomString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;

//@RestController
public class PacjentServiceImpl { //implements PacjentService {

	static Random generator = new Random();


//	@RequestMapping("/greeting")
//	public String testRest(@RequestParam(value="name", defaultValue="World") String name) {
//		return "its allive";
//	}

//	@Override
	public PacjentDto getPacjent(int id) {
		return mockPacjent(id);
	}

	//@Override
	public int savePacjent(PacjentDto dto) {
		return generator.nextInt(1000);
	}

//	@Override
	public List<PacjentDto> serchPacjent(PacjentDto srearchCriteria, int limit, int offset) {
		List<PacjentDto> pacjents = new ArrayList<>();
		for (int j = 0 ; j < generator.nextInt(offset); j++) {
			PacjentDto pacjentDto = mockPacjent(j);
			pacjents.add(pacjentDto);
		}
		return pacjents;
	}

	public static PacjentDto mockPacjent(int i) {
		PacjentDto pacjent = new PacjentDto();
		pacjent.setIdPac(i);
		pacjent.setDataWprow(new Date());
		pacjent.setDataZgonu(new Date());
		pacjent.setIdLekarzaRej(generator.nextInt(1000));
		pacjent.setImie(new RandomString(5).nextString());
		pacjent.setNazwisko(new RandomString(8).nextString());
		pacjent.setPesel(new RandomString(11, true).nextString());
		pacjent.setTelKontakt(new RandomString(9, true).nextString());

		List<ChorobaDto> chorobas = new ArrayList<ChorobaDto>();
		for (int j = 0 ; j < generator.nextInt(4); j++) {
			ChorobaDto chorobaDto = ChorobaServiceImpl.mockChor(j);
			chorobas.add(chorobaDto);
		}
		pacjent.setChorobas(chorobas);
		return pacjent;
	}
}
