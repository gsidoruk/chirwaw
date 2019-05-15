package pl.gsystems.chirwaw.core.service;

import java.util.List;

import pl.gsystems.chirwaw.api.dto.PacjentSearchDto;
import pl.gsystems.chirwaw.core.dto.PacjentCoreDto;


public interface PacjentService {

    PacjentCoreDto getPacjent(int id);

    int savePacjent( PacjentCoreDto dto);

    boolean deletePacjent(int id);

    List<PacjentCoreDto> searchPacjent(PacjentSearchDto searchCriteria);
}