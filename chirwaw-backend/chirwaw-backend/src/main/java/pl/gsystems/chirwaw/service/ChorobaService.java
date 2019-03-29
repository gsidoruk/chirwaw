package pl.gsystems.chirwaw.service;

import java.util.List;

import pl.gsystems.chirwaw.dto.ChorobaDto;
import pl.gsystems.chirwaw.dto.enums.ChorobaStan;

public interface ChorobaService {
	
	// add new or update existing
	int saveChoroba(int pacjentId, ChorobaDto choroba);
	
	boolean changeStatus(int chorobaId, ChorobaStan status);

	List<ChorobaDto> serchChoroba(ChorobaDto srearchCriteria, int limit, int offset);
}
