package main;
import bank.Deposit;
import java.util.ArrayList;
public class MyDeposits {
private ArrayList<Deposit>myDeposits;

    public MyDeposits(ArrayList<Deposit> myDeposits) {
        this.myDeposits = myDeposits;
    }

    public void addDeposit(Deposit deposit){
        this.myDeposits.add(deposit);
    }
}
