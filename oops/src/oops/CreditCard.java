package oops;
import java.lang.Object;
//Defining a class
public class CreditCard extends Object{
//Defining member variables
public String cardNo;
public String cardHolderName;
public boolean active;
public String cardType = "Visa";
@Override
public String toString() {
	return cardNo + "\n" + cardHolderName + "\n"+ active  + "\n" + cardType;
}
}
