package magacin;

import java.util.LinkedList;

public class Magacin {
	
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

}
