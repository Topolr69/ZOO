package zvirata;

import java.time.LocalDate;

public class Savec extends Zvire{
	final boolean TEPLOKREVNOST = true;		//atributy pro teplokrevnost a tt
	double telesnaTeplota;
	
	public Savec(LocalDate datumNarozeni, String jmeno, boolean zijuVCesku,double telesnaTeplota ) {
		super Zvire (datumNarozeni, jmeno,  zijuVCesku);	
		this.telesnaTeplota = telesnaTeplota; 	
	}
	
	public vydejZvuk(String citoslovce) {
		System.out.println(citoslovce);
	}

}
