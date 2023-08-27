package bankSimulation;

import java.util.List;

public class ATM {
    public List<CardHolder> cardHolder;
    public BankBills bankBills;
    public int atmBalance;

    public ATM(List<CardHolder> cardHolder, BankBills bankBills, int balance) {

        this.cardHolder = cardHolder;
        this.bankBills = bankBills;
        this.atmBalance = balance;
    }

//    public void checkUserPinAndGiveMoney() {
//        Scanner scan = new Scanner(System.in);
//        System.out.println("Please enter Password");
//        if (scan.nextInt() == cardHolder.getPassword()) {
//            System.out.println("Summa vydachi");
//            int summaVydachi = scan.nextInt();
//            bankBills.withdrawBills(summaVydachi);
//            System.out.println(bankBills.getBalance());
//        } else {
//            System.out.println("Ne pravilnyi password");
//        }
//    }
}
