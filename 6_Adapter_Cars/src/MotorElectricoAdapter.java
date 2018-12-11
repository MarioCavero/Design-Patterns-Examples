
public class MotorElectricoAdapter extends Motor{

	MotorElectrico motorElectrico;
	public MotorElectricoAdapter(MotorElectrico motorElectrico) {
		this.motorElectrico=motorElectrico;
	}
	@Override
	public void encender() {
		// TODO Auto-generated method stub
		motorElectrico.conectar();
		motorElectrico.activar();
	}

	@Override
	public void acelerar() {
		// TODO Auto-generated method stub
		motorElectrico.moverMasRapido();
	}

	@Override
	public void apagar() {
		// TODO Auto-generated method stub
		motorElectrico.desconectar();
	}

}
