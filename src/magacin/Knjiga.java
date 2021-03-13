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
		this.isbn = isbn;
	}

}
