package pl.gsystems.chirwaw.service.impl;

import java.util.List;
import java.util.Random;

import pl.gsystems.chirwaw.dto.ChorobaDto;
import pl.gsystems.chirwaw.dto.ChorobaStan;
import pl.gsystems.chirwaw.service.ChorobaService;

public class ChorobaServiceImpl implements ChorobaService {

	Random generator = new Random();
	
	@Override
	public int saveChoroba(int pacjentId, ChorobaDto choroba) {

		int i = generator.nextInt(1000);
		return i;
	}

	@Override
	public boolean changeStatus(int chorobaId, ChorobaStan status) {
		// TODO Auto-generated method stub
		return (generator.nextInt(10) % 2 == 0 ) ? true : false;
	}

	@Override
	public List<ChorobaDto> serchChoroba(ChorobaDto srearchCriteria, int limit, int offset) {
		int i = generator.nextInt(10);
		return null;
	}

}
