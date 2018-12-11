
public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		MotorElectricoAdapter motorElectrico = new MotorElectricoAdapter(new MotorElectrico());
        motorElectrico.encender();
        motorElectrico.acelerar();
        motorElectrico.apagar();
	}

}
