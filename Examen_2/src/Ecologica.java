//el tipo de conduccion ecologica. overridea los metodos
public class Ecologica implements TipoConduccion{

	@Override
	public int consumoActual() {
		// TODO Auto-generated method stub
		System.out.println("Consumo actual: el del ecologico");
		return 3;
	}

	@Override
	public void tipoConduccion() {
		// TODO Auto-generated method stub
		System.out.println("Tipo de conduccion: ECOLOGICA");
	}

}
