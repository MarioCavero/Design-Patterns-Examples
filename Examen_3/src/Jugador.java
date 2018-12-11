//clase abstracta del jugador, del cual heredaran delantero y portero
public abstract class Jugador {

	 String tipo;
	 int tiempoJugado;
	 int salario;
	 float puntos=0;
	 int goles;
	//el constructor del jugador, que luego será implementado por el portero y delantero de manera un poco diferente (el portero empeiza con 50 puntos).
	 //se podria dejar vacio y que lo implementen el delantero y el portero pero creo que de esta manera, llamas directamente al super, 
	 //con los mismos parametros. 
	public Jugador(int tiempoJugado, int salario, int goles) {
		this.tiempoJugado=tiempoJugado;
	
		this.salario=salario;
		this.goles=goles;
	}
	//el metodo es final porque asi las subclases no lo pueden tocar. 
	//ira llamando a los distintos metodos de la clase. Los que son abstract son porque los llamamos de forma generica
	//pero cada subclase los implementara a su manera
	public final String calculaValoracion(){
		System.out.println("Estoy calculando la valoracion del jugador:");
		if(this.tiempoJugado<20) this.tipo="malisimo";
		else {
		objetivo();
		salario();
		getPuntos();
		this.tipo=calculoFinal();
		}
		return this.tipo; 
		
	}
	//simplemente cogemos los puntos del jugador
	public void getPuntos() {
		System.out.println("El jugador tiene "+this.puntos+" puntos");
	}
	//estos dos metodos los implementaran las subclases
	public abstract void objetivo();
	public abstract void salario();
	//calculamos el tipo, y eso lo guardaremos al tipo, en el "calculaValoracion", que es el metodo que nos interesa
	public String calculoFinal() {
		if(this.puntos<0)return "malisimo";
		else if(this.puntos>=10 && this.puntos<10)return "malo";
		else if(this.puntos>=10 && this.puntos<20)return "normal";
		else if(this.puntos>=20 && this.puntos<40)return "bueno";
		else return "GALACTICO!";
		
	}
}
