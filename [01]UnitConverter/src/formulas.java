
public class formulas extends mainProg {

	public static double CtoF (double celsius) {
		double F = 0;
		
		F = (celsius * 9 / 5) + 32;
		
		return F;
	}
	
	public static double FtoC (double fahrenheit) {
		double C = 0;
		
		C = (fahrenheit - 32) * 5 / 9; 
		
		return C;
	}
	
	public static double MtoLB (double mass) {
		double LB = 0;
		
		LB = mass * 2.204622621849; 
		
		return LB;
	}
	
	public static double LBtoM (double weight) {
		double M = 0;
		
		M = weight / 2.204622621849; 
		
		return M;
	}

}
