package pl.gsystems.chirwaw.service;

import java.util.List;

import pl.gsystems.chirwaw.dto.PacjentDto;

public interface PacjentService {
	
	PacjentDto getPacjent(int id);

	int savePacjent(PacjentDto dto);
	
	List<PacjentDto> serchPacjent(PacjentDto srearchCriteria, int limit, int offset);
}
