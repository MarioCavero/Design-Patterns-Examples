
public class Delantero extends Jugador{

	public Delantero(int tiempoJugado, int salario, int goles) {
		
		super(tiempoJugado, salario, goles);
		// TODO Auto-generated constructor stub
		System.out.println("Se ha creado el delantero");
	}
	//lo hacemos segun el objetivo del jugador
	@Override
	public void objetivo() {
		// TODO Auto-generated method stub
		System.out.println("Calculado el objetivo del delantero");
		int suma=goles*30;
		this.puntos+=suma;
		
	}
	//y segun el salario
	@Override
	public void salario() {
		// TODO Auto-generated method stub
		System.out.println("calculando la resta del salario del delantero");
		float suma=(float) (this.salario*0.1);
		this.puntos-=suma;
	}

}
