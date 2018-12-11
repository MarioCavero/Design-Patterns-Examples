//el tipo de conduccion deportiva. overridea los metodos
public class Deportivo implements TipoConduccion{

	@Override
	public int consumoActual() {
		// TODO Auto-generated method stub
		System.out.println("El consumo actual es muy elevado!!");
		return 16;
	}

	@Override
	public void tipoConduccion() {
		// TODO Auto-generated method stub
		System.out.println("El tipo de conduccion es deportivo");
	}

}
