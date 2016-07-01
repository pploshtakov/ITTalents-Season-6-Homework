package gsmTask;

public class GSM {
	//	Класът GSM да съдържа полетата:
	//		model – модел на телефона
	String model;
	//		hasSimCard – дали в телефона е заредена SIM карта
	boolean hasSimCard;
	//		simMobileNumber – номер на SIM картата(телефонен номер), ако е
	//		заредена такава.
	String simMobileNumber;
	//		outgoingCallsDuration – общото време (в минути) на изходящите
	//		повиквания
	double outgoingCallDuration;
	//		lastIncomingCall – последното входящо повикване
	Call lastIncomingCall;
	//		lastOutgoingCall – последното изходящо повикване
	Call lastOutgoingCall;
	
	
	//	Да се напишат следните методи за класа GSM:
	//		- insertSimCard(simMobileNumber) – метода задава номер(сим карта)
	//		на телефона. Да се провери дали подаденият номер е валиден
	//		(започва с 08 и се състои от 10 цифри). Ако номерът е валиден, го
	//		задава на телефона и задава стойност true на полето hasSimCard
	void insertSimCard(String simMobileNumber) {
		if (simMobileNumber.charAt(0) == '0' && simMobileNumber.charAt(1) == '8' && simMobileNumber.length() == 10) {
			hasSimCard = true;
			this.simMobileNumber = simMobileNumber;
		} else {
			System.out.println("Invalid number!");
		}
	}
	//		- removeSimCard() - премахва сим картата от телефона (задава false
	//		на полето hasSimCard)
	void removeSimCard() {
		this.hasSimCard = false;
		this.simMobileNumber = null;
	}
	//		- call( receiver, duration) – В тялото му да се направят проверки за:
	void call(GSM receiver, double duration) {
		//		• дали въведената дължина на разговора е валидна
		if (duration < 0.1) {
			System.out.println("Duration must be bigger then 0!");
		}
		//		• дали двата телефона (този за който се извиква метода и
		//		този към който се прави обаждането) не са един и същ телефон
		else if (this == receiver) {
			System.out.println("Caller and receiver must be diferent!");
		}
		//		• дали и двата телефона имат сим карта
		else if (!this.hasSimCard || !receiver.hasSimCard) {
			System.out.println("Caller or receiver don't have a SIM card!");
		}
		//		Ако всички проверки преминат успешно, метода прави обаждане с
		//		продължителност duration към телефона, подаден като параметър.
		//		Задава това обаждане като последно изходящо повикване на
		//		телефона от който се прави повикването (телефона за който се
		//		извиква метода) и задава същото обаждане като последно входящо за
		//		телефона към който се прави обаждането.
		else {
			Call call = new Call();
			call.caller = this;
			call.receiver = receiver;
			call.duration = duration;
			this.lastOutgoingCall = call;
			receiver.lastIncomingCall = call;
			//			Осен това увеличава стойността на outgoingCallsDuration със
			//			дължината на разговора за телефона от който се прави обаждането.
			this.outgoingCallDuration += duration;
		}
	}
	//	Да се направи и метод getSumForCall(), който връща сумата,
	//	начислена за изходящите повиквания на телефона (общото време на
	//	изходящите повиквания по цената за минута - priceForAMinute).
	double getSumForCall() {
		double sumForCalls = 0;
		if (this.outgoingCallDuration > 0) {
			sumForCalls = this.outgoingCallDuration * Call.priceForAMinute;
		} else {
			System.out.println("Don't have outgoing calls!");
		}
		return sumForCalls;
	}
	//	Да се направят два метода
	//	printInfoForTheLastOutgoingCall() и
	//	printInfoForTheLastIncomingCall()
	//	които извеждат информация за последното изходящо/входящо
	//	повиквана на телефона (ако има такова)
	void printInfoForTheLastOutgoingCall() {
		if (this.lastOutgoingCall != null) {
			this.lastOutgoingCall.printCallInfo();
		} else {
			System.out.println("Don't have outgoing calls!");
		}
	}
	void printInfoForTheLastIncomingCall() {
		if (this.lastIncomingCall != null) {
			this.lastIncomingCall.printCallInfo();
		} else {
			System.out.println("Don't have incoming calls!");
		}
	}
}
