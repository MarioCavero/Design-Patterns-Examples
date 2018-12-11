import java.util.EmptyStackException;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Kid nino1=new Kid("Nacho");
		Kid nino2=new Kid("Petra");
		Kid nino3=new Kid ("Rita");
		Kid nino4=new Kid ("Lofemegildo");
		
		try {
			nino1=new Pegatina(nino1);
			nino2=new Pegatina(nino2);
			nino3=new Pegatina(nino3);
			nino3=new Certificado(nino3);
			nino4=new Pegatina(nino4);
			nino4=new Libro (nino4, "Chistes para nenes buenos");
			nino4=new Certificado(nino4);
			nino4=new Libro (nino4, "Chistes para nenes buenos"); // segundo libro, da error
		} catch(EmptyStackException exception) {
			System.out.println("Error: ya tiene un libro");
		}
		System.out.println(nino1.getDescription());
		System.out.println(nino2.getDescription());
		System.out.println(nino3.getDescription());
		System.out.println(nino4.getDescription());
		nino4.getNombreLibro();
		System.out.println("Reseteamos ninos");
		nino1=nino1.resetearNene();
		nino2=nino2.resetearNene();
		nino3=nino3.resetearNene();
		nino4=nino4.resetearNene();
		System.out.println(nino1.getDescription());
		System.out.println(nino2.getDescription());
		System.out.println(nino3.getDescription());
		System.out.println(nino4.getDescription());
	}

}
