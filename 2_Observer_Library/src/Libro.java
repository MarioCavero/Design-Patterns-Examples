
public class Libro {

	private String title;
	private String author;
	private boolean damaged;
	
	public Libro(String title, String author, boolean damaged) {
		this.title=title;
		this.author=author;
		this.damaged=damaged;
	}
	public boolean isDamaged() {
		return this.damaged;
	}
	
	public String getTitle() {
		return this.title;
	}
}
