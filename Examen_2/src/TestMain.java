
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CocheAutomatico coche=new CocheAutomatico();
		coche.tipo();
		System.out.println("El consumo del coche es de "+coche.consumo()+" litros a los 100");
		TipoConduccion deportivo=new Deportivo();
		System.out.println();
		coche.setTipo(deportivo);
		coche.tipo();
		System.out.println("El consumo del coche es de "+coche.consumo()+" litros a los 100");
		
		System.out.println();
		TipoConduccion normal=new Normal();
		coche.setTipo(normal);
		coche.tipo();
		System.out.println("El consumo del coche es de "+coche.consumo()+" litros a los 100");
	}

}
