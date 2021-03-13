package magacin;

import java.util.Date;

public class KucnaHemija extends Artikal {

	private Date rokTrajanja;
	
	public KucnaHemija(int sifra, String naziv, String opis, int kolicina, Date rokTrajanja) {
		super(sifra, naziv, opis, kolicina);
		this.rokTrajanja = rokTrajanja;
	}

	public Date getRokTrajanja() {
		return rokTrajanja;
	}

	public void setRokTrajanja(Date rokTrajanja) {
		this.rokTrajanja = rokTrajanja;
	}	
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((rokTrajanja == null) ? 0 : rokTrajanja.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		KucnaHemija other = (KucnaHemija) obj;
		if (rokTrajanja == null) {
			if (other.rokTrajanja != null)
				return false;
		} else if (!rokTrajanja.equals(other.rokTrajanja))
			return false;
		return true;
	}
}
