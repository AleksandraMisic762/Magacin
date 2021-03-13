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
		if(artikal == null) {
			throw new RuntimeException("Artikal ne sme biti null.");
		}
		if(artikli.contains(artikal)) {
			throw new RuntimeException("Artikal vec postoji u magacinu.");
		}
		artikli.push(artikal);
	}

	@Override
	public Artikal izbaciArtikal(Artikal artikal) {
		if(artikal == null) {
			throw new RuntimeException("Artikal ne sme biti null.");
		}
		if(!artikli.contains(artikal)) {
			throw new RuntimeException("Artikal ne postoji u magacinu.");
		}
		for(int i = 0; i < artikli.size(); i++) {
			if(artikli.get(i).equals(artikal)) {
				return artikli.remove(i);
			}
		}
		return null;
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		for(int i = 0; i < artikli.size(); i++) {
			if(artikli.get(i).getSifra() == sifra) {
				return artikli.get(i);
			}
		}
		return null;
	}

}
