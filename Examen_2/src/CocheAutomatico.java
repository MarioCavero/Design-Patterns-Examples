//Nuestra clase Coche, que irá cambiando el tipo de conduccion que tiene
public class CocheAutomatico {

	TipoConduccion tipo;
//Por defecto el tipo de conduccion del coche es ecologico
	public CocheAutomatico() {
		this.tipo=new Ecologica();
	}
	
		
	
	public void tipo() {
		
		this.tipo.tipoConduccion();
	}
	public int consumo() {
		return this.tipo.consumoActual();
	}
	public void setTipo(TipoConduccion tipo) {
		this.tipo=tipo;
	}
}
