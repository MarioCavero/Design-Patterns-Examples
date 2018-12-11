
public class MotorElectrico {

	private boolean conectado = false;

	 public MotorElectrico() {
	 System.out.println("Creando motor el�ctrico");
	 this.conectado = false;
	 }

	 public void conectar() {
	 System.out.println("Conectando motor el�ctrico");
	 this.conectado = true;
	 }

	 public void activar() {
	 if (!this.conectado) {
	 System.out.println("No se puede activar porque no " +
	 "esta conectado el motor el�ctrico");
	 } else {
	 System.out.println("Est� conectado, activando motor" +
	 " el�ctrico....");
	 }
	 }

	 public void moverMasRapido() {
	 if (!this.conectado) {
	 System.out.println("No se puede mover r�pido el motor " +
	 "el�ctrico porque no est� conectado...");
	 } else {
	 System.out.println("Moviendo m�s r�pido...aumentando voltaje");
	 }
	 }

	 public void detener() {
	 if (!this.conectado) {
	 System.out.println("No se puede detener motor el�ctrico" +
	 " porque no est� conectado");
	 } else {
	
	 System.out.println("Deteniendo motor el�ctrico");
	 }
	 }

	 public void desconectar() {
	 System.out.println("Desconectando motor el�ctrico...");
	 this.conectado = false;
	 }

}
