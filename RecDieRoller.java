
import java.util.Random;
public class RecDieRoller{
	
	int numberRoll =1;
	
	 public RecDieRoller() {
		 
	 }
	 
	 public int roller() {
		 Random rand = new Random();
		 int num = rand.nextInt(6-1+1) +1;
		 System.out.println(num);
		 	if(num==2) {
		 		return this.numberRoll;
		 	}
		 	else {
		 		this.numberRoll++;
		 		int result = roller();
		 		this.numberRoll = 1;
		 		return result;
		 	}
	 }
}
