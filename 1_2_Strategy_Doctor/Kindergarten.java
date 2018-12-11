import java.util.ArrayList;

public class Kindergarten {

	Doctor doctor;
	ArrayList<String> kids;
	
	public Kindergarten(ArrayList<String> kids) {
		this.kids=kids;
	}
	
	public void setDoctor(Doctor doctor) {
		this.doctor=doctor;
	}
	public ArrayList<String> getKids(){
		return this.kids;
	}
}
