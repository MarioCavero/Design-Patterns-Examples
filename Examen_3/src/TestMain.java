
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Jugador ronaldo=new Delantero(40,12,3);
		String valoracionRonaldo=ronaldo.calculaValoracion();
		System.out.println("La valoracion de Ronaldo es de: "+valoracionRonaldo);
		System.out.println();
		Jugador pepe=new Delantero(30,10,1);
		String valoracionPepe=pepe.calculaValoracion();
		System.out.println("La valoracion de Pepe es de: "+valoracionPepe);
		
		System.out.println();
		
		Jugador casillas=new Portero(21,8,1);
		String valoCasillas=casillas.calculaValoracion();
		System.out.println("La valoracion de Casillas es de: "+valoCasillas);
		System.out.println();
		Jugador deGea=new Portero(30,12,20);
		String valoracionDeGea=deGea.calculaValoracion();
		System.out.println("La valoracion de deGea es de: "+valoracionDeGea);
		
		
	}

}
