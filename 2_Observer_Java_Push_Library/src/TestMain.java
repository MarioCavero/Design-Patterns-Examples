
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Library biblioteca = new Library();
		AlarmaLibro alarmaLibro = biblioteca.getAlarma();
		
		Libro libro = new Libro("Harry Potter", "JK Rowling",true);	
		
		Compras depCompras = new Compras(alarmaLibro);
		Stock depStock = new Stock(alarmaLibro);
		Administration depAdmin = new Administration(alarmaLibro);
		
		biblioteca.returnBook(libro);
		
		// Imprimimos un espacio en blanco
        System.out.println("");
		
		// Segunda Prueba
		// Desuscribimos a dos observadores y devolvemos otro libro defectuoso para comprobar la funcionalidad de las desuscripciones
		alarmaLibro.deleteObserver(depStock);
		alarmaLibro.deleteObserver(depAdmin);
		Libro libro2 = new Libro("Eldest", "RR Martin", true);
		biblioteca.returnBook(libro2);
	}

}
