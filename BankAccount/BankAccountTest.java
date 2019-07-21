
public class BankAccountTest {
	public static void main(String[] args) {
		BankAccount b1 = new BankAccount(299.87, 4567.09);
		BankAccount b2 = new BankAccount(657.09, 2004.56);
		BankAccount b3 = new BankAccount(1234.56, 32547.65);
        BankAccount b4 = new BankAccount(86.45, 43.09);
        
        b1.getAcctNum();
        b2.getAcctNum();
        b3.getAcctNum();
        b4.getAcctNum();

        b3.withdrawSAcct(3450.00);
        b3.getSBal();

        b1.depCAcct(567.43);
        b1.withdrawCAcct(300.00);
        b1.depSAcct(300.00);
        b1.seeBals();

        b2.depCAcct(50.00);
        b2.getCBal();

        b4.withdrawCAcct(100.00);
        b4.withdrawSAcct(100.00);
        b4.seeBals();
	}
}
