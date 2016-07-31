package bankClients;

import bankClients.BankClient.CreditsName;

public interface IClient {
//	Клиента може да извършва следните операции:
//		• Може да открива депозит за определена сума и определен период
	public void makeDeposit(double sizeOfDeposit, int periodOfDeposit);
//		• Може да иска отпускането кредит
	public boolean askForCredit(double sizeOfCredit, int period,CreditsName typeOfCredit);
//		• Може да внася пари по кредити.
	public void payInterestByMonth();
}
