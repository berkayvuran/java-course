package eCommerceBackend.core.utilities;

public class BusinessRules {
	
	public static boolean run(boolean... logics) {
		for (boolean logic : logics) {
			if(!logic) {
				return false;
			}
		}
		return true;
	}

}
