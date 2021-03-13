package magacin.interfejs;

import magacin.Artikal;

public interface IMagacin {

	void dodajArtikal(Artikal artikal);
	
	Artikal izbaciArtikal(Artikal artikal);
	
	Artikal pronadjiArtikal(int sifra);
}
