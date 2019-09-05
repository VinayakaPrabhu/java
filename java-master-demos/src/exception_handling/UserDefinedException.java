package exception_handling;

public class UserDefinedException {

public static void main(String[] args) {
	int age = 45;
	if(age < 21 || age > 58)
	{
		InvalidAgeException exception = new InvalidAgeException();
		try {
			throw exception;
		} catch (InvalidAgeException e) {
			System.out.println(e.getMessage());
		}
	}
	else {
		System.out.println("You are welcome.");
	}
}
}

class InvalidAgeException extends Exception{

	public String getMessage() {
		return "Age should be between 21 and 58";
	}
}
