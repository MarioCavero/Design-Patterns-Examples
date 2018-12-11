
public class Libro {

	 String title;
	 String author;
	 boolean isDamaged;
	
	public Libro() {
		this.title="Default";
		this.author="Default";
		this.isDamaged=false;
	}
	
	public Libro(String title, String author, boolean isDamaged) {
		this.title=title;
		this.author=author;
		this.isDamaged=isDamaged;
	}
}
