public class MotorComun extends Motor {

 public MotorComun(){
 super();
 System.out.println("Creando el motor com�n");
 }

 @Override
 public void encender() {
 System.out.println("encendiendo motor com�n");
 }

 @Override
 public void acelerar() {
 System.out.println("acelerando el motor com�n");
 }


 @Override
 public void apagar() {
 System.out.println("Apagando motor com�n");
 }
}

