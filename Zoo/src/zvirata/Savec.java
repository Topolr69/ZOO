package zvirata;

import java.time.LocalDate;

public class Savec extends Zvire{
	final boolean TEPLOKREVNOST = true;		//atributy pro teplokrevnost a tt
	double telesnaTeplota;
	
	public Savec(LocalDate datumNarozeni, String jmeno, boolean zijuVCesku,double telesnaTeplota ) {
		this.datumNarozeni = datumNarozeni;
		this.jmeno = jmeno;
		this.zijuVCesku = zijuVCesku;
		this.telesnaTeplota = telesnaTeplota; 
		
	}

}
