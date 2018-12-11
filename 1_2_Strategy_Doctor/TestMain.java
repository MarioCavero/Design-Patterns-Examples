import java.util.ArrayList;

public class TestMain {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		ArrayList<String> kids=new ArrayList<String>();
		
		kids.add("Paul");
		kids.add("Logan");
		kids.add("Melissa");
		kids.add("Andrea");
		
		Kindergarten rainbows=new Kindergarten(kids);
		//the oculist works only on day 15 and the logopedian on day 28
		
		int day=15;
		if(day==15) {
			rainbows.setDoctor(new Oculista());
			
		}
		else if(day==28) {
			rainbows.setDoctor(new Logopeda());
		}
		for(int i=0;i<kids.size();i++) {
		
			rainbows.doctor.examinePatient(kids.get(i));
			rainbows.doctor.sendBillToParents(kids.get(i));
			rainbows.doctor.sendResultsToParents(kids.get(i));
			System.out.println();
		}
		
	}

}
