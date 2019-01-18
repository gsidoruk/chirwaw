package pl.gsystems.chirwaw.service;

import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import pl.gsystems.chirwaw.dto.PacjentDto;


public interface PacjentService {

	String testRest(String param);

	PacjentDto getPacjent(int id);

	int savePacjent(PacjentDto dto);
	
	List<PacjentDto> serchPacjent(PacjentDto srearchCriteria, int limit, int offset);
}
