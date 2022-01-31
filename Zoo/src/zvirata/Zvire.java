package zvirata;

import java.time.LocalDate;
import java.util.ArrayList;

public class Zvire {
	LocalDate datumNarozeni;		//atributy tridy Zvire
	ArrayList<Integer>hodinyKrmeni;
	int pocetKrmeniZaDen;
	String jmeno;
	boolean zijuVCesku;
	
	public Zvire(LocalDate datumNarozeni, String jmeno, boolean zijuVCesku )  {		//konstruktor s parametrama
		this.datumNarozeni = datumNarozeni;
		this.jmeno = jmeno;
		this.zijuVCesku = zijuVCesku;		
	}
	
	public void vypisInformace() {		//metoda pro vypis informaci z atributu
		System.out.println("datum narozeni: " + datumNarozeni + ", hodiny krmeni: " + hodinyKrmeni + ", pocet krmeni: " + pocetKrmeniZaDen + ", jmeno: " + jmeno + ", kde zvire zije: " + zijuVCesku  );
	}
	

	public LocalDate getDatumNarozeni() {		//verejne gettery pro vsechy atributy
		return datumNarozeni;
	}

	public ArrayList<Integer> getHodinyKrmeni() {
		return hodinyKrmeni;
	}

	public int getPocetKrmeniZaDen() {
		return pocetKrmeniZaDen;
	}

	public String getJmeno() {
		return jmeno;
	}

	public boolean isZijuVCesku() {
		return zijuVCesku;
	}
	

	public void setHodinyKrmeni(ArrayList<Integer> hodinyKrmeni) {		//verejne settery pro hodiny krmeni a krmeni za den
		this.hodinyKrmeni = hodinyKrmeni;
	}

	public void setPocetKrmeniZaDen(int pocetKrmeniZaDen) {
		this.pocetKrmeniZaDen = pocetKrmeniZaDen;
	}
	
	
	
	
	
	
	
	
	
	
	
}
