package pl.gsystems.chirwaw.service;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import pl.gsystems.chirwaw.dto.ChorobaDto;
import pl.gsystems.chirwaw.dto.enums.ChorobaStan;

@RequestMapping(value = "/choroba")
public interface ChorobaService {

	@ApiOperation(value = "Add new or update Choroba for given pacjentId", response = int.class)
	@RequestMapping(value = "/saveChoroba/{pacjentId}", method = RequestMethod.POST)
	int saveChoroba(@RequestParam(value="pacjentId") int pacjentId, @RequestBody ChorobaDto choroba);

	@ApiOperation(value = "Change status for Choroba", response = boolean.class)
	@RequestMapping(value = "/changeStatus/{chorobaId}/{status}", method = RequestMethod.POST)
	boolean changeStatus(@RequestParam(value="chorobaId") int chorobaId, @RequestParam(value="status") ChorobaStan status);

}
