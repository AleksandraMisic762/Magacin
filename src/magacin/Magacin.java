package magacin;

import java.util.LinkedList;

import magacin.interfejs.IMagacin;

public class Magacin implements IMagacin {

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
		artikli.add(artikal);
	}

	@Override
	public Artikal izbaciArtikal(Artikal artikal) {
		Artikal rezultat = null;
		for (int i = 0; i < artikli.size(); i++) {
			if (artikli.get(i).equals(artikal)) {
				rezultat = artikli.get(i);
				artikli.remove(i);
				break;
			}
		}
		return rezultat;
	}

	@Override
	public Artikal pronadjiArtikal(int sifra) {
		Artikal rezultat = null;
		for (int i = 0; i < artikli.size(); i++) {
			if (artikli.get(i).getSifra() == sifra) {
				rezultat = artikli.get(i);
				break;
			}
		}
		return rezultat;
	}

}
