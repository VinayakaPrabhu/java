package inheritance;


class TC3{
	final String creatorString; 
	TC3(){
		creatorString = "GOD";
	}
	void disp() {
		//creatorString = "Devil";
	}
}
class TC4{
	
}
final class TC1 extends TC4{
	
	final public void test() {

	}

	public void test1() {

	}
}

class TC2 extends TC1 {
//	public void test() {
//
//	}

	@Override
	public void test1() {

	}
}