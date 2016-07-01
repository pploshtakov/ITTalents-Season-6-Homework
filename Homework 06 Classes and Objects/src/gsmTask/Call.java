package gsmTask;

public class Call {
//	Класът Call да съдържа следните полета:
//		priceForAMinute – статично поле, което показва цената на разговор за
//		минута
	static double priceForAMinute = 0.15;
//		caller - показва телефона, от който е направено повикването
	GSM caller;
//		receiver - показва телефона, към който е направено повикването
	GSM receiver;
//		duration - дължината на разговора (в минути)
	double duration;
	void printCallInfo() {
		System.out.println("Caller is " + this.caller.simMobileNumber);
		System.out.println("Receiver is " + this.receiver.simMobileNumber);
		System.out.println("Call's duration is " + this.duration);
		System.out.println("Call's price is " + (this.duration * Call.priceForAMinute));
	}
}
