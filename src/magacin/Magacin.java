package magacin;

import java.util.LinkedList;

import magacin.interfejs.IMagacin;

public class Magacin implements IMagacin{
	
	LinkedList<Artikal> artikli;

	public Magacin() {
		super();
		this.artikli = new LinkedList<>();
	}

	public LinkedList<Artikal> getArtikli() {
		return artikli;
	}

	public void setArtikli(LinkedList<Artikal> artikli) {
		this.artikli = artikli;
	}

	@Override
	public void dodajArtikal(Artikal artikal) {
		
		
	}

	@Override
	public Artikal izbaciArtikal(Artikal artikal) {
		
		return null;
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		
		return null;
	}

}
