public class TestCoding implements Test {

	public int checkTest1(String a) {
		return 25;
	}
	
	public int checkTest2(String a) {
		if(a.compareTo("function") == 0) {
			return 25;
		}
		else {
			return 0;
		}
	}
	
	public int checkTest3(String a) {
		if(a.compareTo("return") == 0) {
			return 25;
		}
		else {
			return 0;
		}
	}
	
	public int checkTest4(String a) {
		if(a.compareTo("pow") == 0) {
			return 25;
		}
		else {
			return 0;
		}
	}
}
