package interfaces;

public interface IElectronicDevice {
	//	start() - стартира устройството
	void start();
	//	stop() - спира устройството
	void stop();
	//	isStarted – проверява дали устройството е пуснато
	boolean isStarted();
}
