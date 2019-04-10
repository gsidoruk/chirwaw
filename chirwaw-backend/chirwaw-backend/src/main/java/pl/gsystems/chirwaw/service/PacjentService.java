package pl.gsystems.chirwaw.service;

import java.util.List;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;
import pl.gsystems.chirwaw.dto.PacjentComplexDto;
import pl.gsystems.chirwaw.dto.PacjentDto;
import pl.gsystems.chirwaw.dto.PacjentChorobaSearchDto;
import pl.gsystems.chirwaw.dto.PacjentChorobaSearchResultDto;


@RequestMapping(value = "/pacjent")
public interface PacjentService {

	@ApiOperation(value = "Return all information related with Pacjent, by pacjentId", response = PacjentComplexDto.class)
	@RequestMapping(value = "/getPacjentAllData", method = RequestMethod.GET)
	PacjentComplexDto getPacjentAllData(@RequestParam(value="id") int id);

	@ApiOperation(value = "Return base Pacjent, by pacjentId", response = PacjentDto.class)
	@RequestMapping(value = "/getPacjent", method = RequestMethod.GET)
	PacjentDto getPacjent(@RequestParam(value="id") int id);

	@ApiOperation(value = "Save only Pacjent, without Choroba", response = int.class)
	@RequestMapping(value = "/savePacjent", method = RequestMethod.POST)
	int savePacjent(@RequestBody PacjentDto dto);

	@ApiOperation(value = "Delete Pacejnt and all related objects (Choroby, Operacja, Protokol)")
	@RequestMapping(value = "/deletePacjent", method = RequestMethod.DELETE)
	boolean deletePacjent(@RequestParam(value="id") int id);

	@ApiOperation(value = "Search Pacjent and Choroba, return list of Choroba", response = PacjentChorobaSearchResultDto.class)
	@RequestMapping(value = "/serchPacjent/{offset}/{limit}", method = RequestMethod.POST)
	List<PacjentChorobaSearchResultDto> serchPacjent(@RequestBody PacjentChorobaSearchDto srearchCriteria, @PathVariable("offset") final int offset, @PathVariable("limit") final int limit);
}
