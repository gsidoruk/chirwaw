package pl.gsystems.chirwaw.common.enums;

public enum Tryb {
	PILNE("A"),DOSC_PILNE("B"), PRZEWLEKLE("C");
	
	private String code;
	
	private Tryb (String code) {
		this.code = code;
	}
}
