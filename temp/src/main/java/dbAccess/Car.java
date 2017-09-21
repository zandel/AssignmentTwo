package dbAccess;

public class Car {
private String carRegistration = null;
	
	public String registerCar( String reg ) {
		carRegistration = reg;
		return carRegistration;
	}

}
