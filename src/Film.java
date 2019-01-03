
public class Film {

	private String nazivFilma;
	private String reziser;
	private int godPremijere;
	private String zanr;
	private boolean isVisible;

	public Film(String nazivFilma, String reziser, int godPremijere, String zanr) {

		this.nazivFilma = nazivFilma;
		this.reziser = reziser;
		this.godPremijere = godPremijere;
		this.zanr = zanr;
		this.isVisible = false;
	}

	public void ucitajFilm(String nazivFilma, String reziser, int godPremijere, String zanr) {

		this.nazivFilma = nazivFilma;
		this.reziser = reziser;
		this.godPremijere = godPremijere;
		this.zanr = zanr;
		this.isVisible = false;
	}

	public String getNaziv() {
		return this.nazivFilma;
	}

	public String getReziser() {
		return this.reziser;
	}

	public int getGodPrem() {
		return this.godPremijere;
	}

	public String getZanr() {
		return this.zanr;
	}

	public boolean getVisible() {
		return this.isVisible;
	}

	public void setVisible() {
		this.isVisible = true;
	}
}
