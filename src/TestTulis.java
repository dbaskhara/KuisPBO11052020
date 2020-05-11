public class TestTulis implements Test {
	
	public int checkTest1(String a) {
		return 25;
	}
	
	public int checkTest2(String a) {
		if(a.compareTo("susah tidur") == 0) {
			return 25;
		}
		else {
			return 0;
		}
	}
	
	public int checkTest3(String a) {
		if(a.compareTo("pendek") == 0) {
			return 25;
		}
		else {
			return 0;
		}
	}
	
	public int checkTest4(String a) {
		if(a.compareTo("sepatu") == 0) {
			return 25;
		}
		else {
			return 0;
		}
	}
}
