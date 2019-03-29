package pl.gsystems.chirwaw.dto.enums;

public enum Tryb {
	PILNE("A"),DOSC_PILNE("B"), PRZEWLEKLE("C");
	
	private String code;
	
	private Tryb (String code) {
		this.code = code;
	}
}
