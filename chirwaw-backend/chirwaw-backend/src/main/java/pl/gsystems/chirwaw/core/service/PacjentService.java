package pl.gsystems.chirwaw.core.service;

import pl.gsystems.chirwaw.core.dto.PacjentCoreDto;

import java.util.List;


public interface PacjentService {


    PacjentCoreDto getPacjent(int id);


    int savePacjent( PacjentCoreDto dto);

    List<PacjentCoreDto> search(PacjentCoreDto dto);


    boolean deletePacjent(int id);

}