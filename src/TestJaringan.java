public class TestJaringan implements Test{
	
	public int checkTest1(String a) {
		if(a.compareTo("admin") == 0) {
			return 25;
		}
		else {
			return 0;
		}
	}
	
	public int checkTest2(String a) {
		if(a.compareTo("ya") == 0) {
			return 25;
		}
		else {
			return 0;
		}
	}
	
	public int checkTest3(String a) {
		if(a.compareTo("lab") == 0) {
			return 25;
		}
		else {
			return 0;
		}
	}
	
	public int checkTest4(String a) {
		return 25;
	}
}
