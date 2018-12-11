
public class Portero extends Jugador{
	//el portero empieza empieza con 50 puntos de mas
	public Portero(int tiempoJugado, int salario, int goles) {
		super(tiempoJugado, salario, goles);
		this.puntos=50;
		// TODO Auto-generated constructor stub
		System.out.println("Se ha creado el portero");
	}
	//y lo mismo que con el delantero
	@Override
	public void objetivo() {
		// TODO Auto-generated method stub
		System.out.println("Calculado el objetivo del portero");
		int suma=goles*30;
		this.puntos-=suma;
	}
	//lo mismo que con el delantero
	@Override
	public void salario() {
		// TODO Auto-generated method stub
		System.out.println("calculando la resta del salario del delantero");
		float suma=(float) (this.salario*0.08);
		this.puntos-=suma;
	}

}
