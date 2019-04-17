package pl.gsystems.chirwaw.common.enums;

public enum ChorobaStan {
	ARCHIWALNY("A"),OCZEKUJE("O"), GOTOWY("G"), ZAKWALIFIKOWANY("W"), ZAPLANOWANY("K"), REZYGNACJA("R");
	
	private String code;
	
	private ChorobaStan (String code) {
		this.code = code;
	}
}
