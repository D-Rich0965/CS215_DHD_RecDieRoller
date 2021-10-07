
public class dieRollerMain {

	public static void main(String[] args) {
		RecDieRoller dieRoll = new RecDieRoller();
		int[] numberRoll = new int[1001];
		for (int i=1; i<=1000; i++) {
			numberRoll[i] = dieRoll.roller();
			System.out.println("Roll Number for this run = "+ numberRoll[i]);
			System.out.println("Current run= "+i);
		}
		
		int sum=0;
		for (int i=0; i<numberRoll.length; i++) {
			sum = sum +numberRoll[i];
		}
		
		int avg = sum /1000;
		System.out.println("Mean number of rolls = " + avg);
	}
}
