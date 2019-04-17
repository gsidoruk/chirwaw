package pl.gsystems.chirwaw.core.service;

import pl.gsystems.chirwaw.core.dto.PacjentCoreDto;


public interface PacjentService {


    PacjentCoreDto getPacjent(int id);


    int savePacjent( PacjentCoreDto dto);


    boolean deletePacjent(int id);

}