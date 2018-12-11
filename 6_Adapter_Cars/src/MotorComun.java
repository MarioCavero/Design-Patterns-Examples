public class MotorComun extends Motor {

 public MotorComun(){
 super();
 System.out.println("Creando el motor común");
 }

 @Override
 public void encender() {
 System.out.println("encendiendo motor común");
 }

 @Override
 public void acelerar() {
 System.out.println("acelerando el motor común");
 }


 @Override
 public void apagar() {
 System.out.println("Apagando motor común");
 }
}

