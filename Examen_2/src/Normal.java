//el tipo de conduccion normal. overridea los metodos
public class Normal implements TipoConduccion{

	@Override
	public int consumoActual() {
		// TODO Auto-generated method stub
		System.out.println("El consumo actual es normal");
		return 6;
	}

	@Override
	public void tipoConduccion() {
		// TODO Auto-generated method stub
		System.out.println("El tipo de conduccion es Normal");
	}

}
