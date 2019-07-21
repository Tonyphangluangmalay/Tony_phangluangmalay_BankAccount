import java.util.Random;

public class BankAccount {
	private String acctNumber; 
    private double checkingBal;
    private double savingsBal;
    private static int numAccts = 0;
    private static double totalMoney = 0;
    public BankAccount(double cBal, double sBal) {
        setAcctNum();
        checkingBal = cBal;
        savingsBal = sBal;
        numAccts ++;
        totalMoney += checkingBal;
        totalMoney += savingsBal;
    }
    private String setAcctNum() {
        Random rand = new Random();
        String nums = "1234567890";
        this.acctNumber = "";
        while(acctNumber.length() < 10) {
            int x = rand.nextInt(nums.length());
            char singleNum = nums.charAt(x);
            acctNumber += singleNum;
        }
        return acctNumber;
    }
    public void getAcctNum() {
        System.out.println(acctNumber);
    }
    public void getCBal() {
        System.out.println(checkingBal);
    }
    public void getSBal() {
        System.out.println(savingsBal);
    }
    public void depCAcct(double deposit) {
        checkingBal += deposit;
    }
    public void depSAcct(double deposit) {
        savingsBal += deposit;
    }
    public void withdrawCAcct(double withdrawal) {
        if(checkingBal<withdrawal) {
            System.out.print("You have insufficient funds to make this withdrawal. Your account balance is $"+checkingBal+".");
        }
        else {
            checkingBal -= withdrawal;
        }
    }
    public void withdrawSAcct(double withdrawal) {
        if(savingsBal<withdrawal) {
            System.out.print("You have insufficient funds to make this withdrawal. Your account balance is $"+savingsBal+".");
        }
        else {
            savingsBal -= withdrawal;
        }
    }
    public void seeBals() {
        System.out.println("Checking Account Balance: $"+checkingBal);
        System.out.println("Savings Account Balance: $"+savingsBal);
    }
    public void String() {
        System.out.println("The bank has "+numAccts+" accounts open.");
        System.out.println("The bank has a total of $"+totalMoney+" stored.");
    }
}
