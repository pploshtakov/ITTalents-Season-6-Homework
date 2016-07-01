package gsmTask;

public class DemoGsm {

	public static void main(String[] args) {
		GSM samsung = new GSM();
		GSM lenovo = new GSM();
		samsung.insertSimCard("0888884361");
		lenovo.insertSimCard("0888888619");
		samsung.call(lenovo, 5);
		samsung.printInfoForTheLastIncomingCall();
		lenovo.printInfoForTheLastIncomingCall();
		samsung.call(samsung, 5);
		GSM lg = new GSM();
		samsung.call(lg, 6);
		
	}

}
