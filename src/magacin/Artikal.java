package magacin;

public class Artikal {
	private int sifra;
	private String naziv;
	private String opis;
	private int kolicina;
	
	public Artikal(int sifra, String naziv, String opis, int kolicina) {
		super();
		this.sifra = sifra;
		this.naziv = naziv;
		this.opis = opis;
		this.kolicina = kolicina;
	}
	
	public int getSifra() {
		return sifra;
	}
	
	public void setSifra(int sifra) {
		if(sifra <= 0 ) {
			throw new RuntimeException("Sifra mora da bude broj veci od 0.");
		}
		this.sifra = sifra;
	}
	
	public String getNaziv() {
		return naziv;
	}
	
	public void setNaziv(String naziv) {
		if(naziv.length() < 2) {
			throw new RuntimeException("Naziv mora da ima bar 2 karaktera.");
		}
		this.naziv = naziv;
	}
	
	public String getOpis() {
		return opis;
	}
	
	public void setOpis(String opis) {
		if(opis.length() < 2) {
			throw new RuntimeException("Opis mora da ima bar 2 karaktera.");
		}
		this.opis = opis;
	}
	
	public int getKolicina() {
		return kolicina;
	}
	
	public void setKolicina(int kolicina) {
		if(kolicina < 0) {
			throw new RuntimeException("Kolicina ne moze da bude negativna");
		}
		this.kolicina = kolicina;
	}
	
	@Override
	public String toString() {
		return "Artikal [naziv=" + naziv + ", opis=" + opis + ", kolicina=" + kolicina + "]";
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + kolicina;
		result = prime * result + ((naziv == null) ? 0 : naziv.hashCode());
		result = prime * result + ((opis == null) ? 0 : opis.hashCode());
		result = prime * result + sifra;
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Artikal other = (Artikal) obj;
		if (naziv == null) {
			if (other.naziv != null)
				return false;
		} else if (!naziv.equals(other.naziv))
			return false;
		if (sifra != other.sifra)
			return false;
		return true;
	}
	
	

}
