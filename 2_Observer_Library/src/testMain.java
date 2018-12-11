//Implements an Observer without the Java Observer and observable utility
public class testMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Library library=new Library();
		AlarmaLibro alarma=library.getAlarma();
		//true means its damaged
		Libro libro1=new Libro("Physics", "Einstein", true);
		Libro libro2=new Libro("Natural Science", "Darwin", true);
		
		Stock stock=new Stock(alarma);
		Administration administracion=new Administration(alarma);
		Compras compras=new Compras(alarma);
		
		library.returnBook(libro1);
		
		System.out.println("");
		
		
		
		alarma.removeObserver(administracion);
		library.returnBook(libro2);
		System.out.println("");
	}

}
