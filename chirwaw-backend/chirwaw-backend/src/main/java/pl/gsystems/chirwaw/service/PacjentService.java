package pl.gsystems.chirwaw.service;

import java.util.List;

import org.springframework.web.bind.annotation.*;
import pl.gsystems.chirwaw.dto.PacjentDto;
import pl.gsystems.chirwaw.dto.PacjentSearchDto;


public interface PacjentService {

	@RequestMapping(value = "/getPacjent", method = RequestMethod.GET)
	PacjentDto getPacjent(@RequestParam(value="id", defaultValue="0") int id);

	@RequestMapping(value = "/savePacjent", method = RequestMethod.POST)
	int savePacjent(@RequestBody PacjentDto dto);

	@RequestMapping(value = "/serchPacjent/{offset}/{limit}", method = RequestMethod.POST)
	List<PacjentDto> serchPacjent(@RequestBody PacjentSearchDto srearchCriteria, @PathVariable("offset") final int offset, @PathVariable("limit") final int limit);
}
