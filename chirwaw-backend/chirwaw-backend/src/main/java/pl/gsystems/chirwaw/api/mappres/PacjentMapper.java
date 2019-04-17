package pl.gsystems.chirwaw.api.mappres;
import java.util.Date;

import pl.gsystems.chirwaw.api.dto.PacjentDto;
import pl.gsystems.chirwaw.core.dto.PacjentCoreDto;

public class PacjentMapper {

    public PacjentCoreDto toCore(PacjentDto dto) {
        PacjentCoreDto coreDto = new PacjentCoreDto();
        coreDto.setPacjentId(dto.getPacjentId());
        coreDto.setDataZgonu(dto.getDataZgonu());
        coreDto.setImie(dto.getImie());
        coreDto.setNazwisko(dto.getNazwisko());
        coreDto.setPesel(dto.getPesel());
        coreDto.setTelKontakt(dto.getTelKontakt());
        return coreDto;
    }

    public PacjentDto fromCore(PacjentCoreDto coreDto) {
        PacjentDto dto = new PacjentDto();
        dto.setPacjentId(coreDto.getPacjentId());
        dto.setDataZgonu(coreDto.getDataZgonu());
        dto.setImie(coreDto.getImie());
        dto.setNazwisko(coreDto.getNazwisko());
        dto.setPesel(coreDto.getPesel());
        dto.setTelKontakt(coreDto.getTelKontakt());
        return dto;
    }
}