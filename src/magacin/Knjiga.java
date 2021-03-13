package magacin;

public class Knjiga extends Artikal {

	private String isbn;
	
	public Knjiga(int sifra, String naziv, String opis, int kolicina, String isbn) {
		super(sifra, naziv, opis, kolicina);
		this.isbn = isbn;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		if(isbn.length() != 13) {
			throw new RuntimeException("ISBN mora da ima 13 cifara");
		}
		this.isbn = isbn;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + ((isbn == null) ? 0 : isbn.hashCode());
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
		Knjiga other = (Knjiga) obj;
		if (isbn == null) {
			if (other.isbn != null)
				return false;
		} else if (!isbn.equals(other.isbn))
			return false;
		return true;
	}
	
	

}
