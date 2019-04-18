package pl.gsystems.chirwaw.api.endpoint.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import pl.gsystems.chirwaw.api.dto.*;
import pl.gsystems.chirwaw.api.endpoint.PacjentGateway;
import pl.gsystems.chirwaw.api.mappres.PacjentMapper;
import pl.gsystems.chirwaw.core.dto.PacjentCoreDto;
import pl.gsystems.chirwaw.core.service.PacjentService;
import pl.gsystems.chirwaw.utils.RandomString;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

@RestController
public class PacjentGatewayController implements PacjentGateway {

	static Random generator = new Random();

	private PacjentMapper pacjentMapper = new PacjentMapper();

	@Autowired
	private PacjentService pacjentService;


	@Override
	public PacjentComplexDto getPacjentAllData(int id) {
		return null;
	}

	@Override
	public PacjentDto getPacjent(int id) {
		PacjentCoreDto pacjent = pacjentService.getPacjent(id);
		PacjentDto pacjentDto = pacjentMapper.fromCore(pacjent);
		return pacjentDto;
	}

	@Override
	public int savePacjent(PacjentDto dto) {
		PacjentCoreDto pacjentCoreDto = pacjentMapper.toCore(dto);
		int pacjentId = pacjentService.savePacjent(pacjentCoreDto);
		return pacjentId;
	}

	@Override
	public boolean deletePacjent( int id) {
		return pacjentService.deletePacjent(id);

	}

	@Override
	public List<PacjentDto> serchPacjent(@RequestBody PacjentDto srearchCriteria, @PathVariable("offset") int offset, @PathVariable("limit") int limit) {
		PacjentCoreDto pacjentCoreDto = pacjentMapper.toCore(srearchCriteria);
		List<PacjentCoreDto> search = pacjentService.search(pacjentCoreDto);
		List<PacjentDto> collect = search.stream().map(p -> pacjentMapper.fromCore(p)).collect(Collectors.toList());
		return collect;
	}

	@Override
	public List<PacjentChorobaSearchResultDto> serchPacjentChoroba(PacjentChorobaSearchDto srearchCriteria, final int offset, final int limit) {
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
			ChorobaDto chorobaDto = ChorobaGatewayController.mockChor(j);
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
			ChorobaDto chorobaDto = ChorobaGatewayController.mockChor(j);
			chorobas.add(chorobaDto);
		}
	//	pacjent.setChorobas(chorobas);
		return pacjent;
	}
}
