package menu;
import bank.BankList;
import bank.Deposit;
import main.MyDeposits;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public interface Command {
    void execute();
}
class WithdrawMoney implements Command{
    MyDeposits deposits;
    double amount;
    @Override
    public void execute() {

        System.out.println("Money has withdrawed");
    }
}
class Replenishment implements Command{
    MyDeposits deposits;
    double amount;
    @Override
    public void execute() {

        System.out.println("You added money to your deposit");
    }
}
class ChooseDesiredDeposit implements Command{
    private ArrayList<Deposit> deposits;
    private ArrayList<Deposit> myDeposits;
    public void ChooseDesiredDeposits(ArrayList<Deposit> deposits,ArrayList<Deposit> myDeposits){
        this.deposits = deposits;
        this.myDeposits = myDeposits;
    }
    public void execute() {


    }
    public ArrayList<Deposit> myDeposits(){

        return myDeposits;
    }

}
class ShowDepositList implements Command{

    private ArrayList<Deposit> deposits;
    public ShowDepositList(ArrayList<Deposit> deposits){
        this.deposits = deposits;
    }
    public void execute() {
        howToSortList();
        System.out.println(deposits);
    }
    public  void howToSortList(){
        Scanner sc = new Scanner(System.in);

        System.out.println("Sort by:\n 1.Interest rate(asc)\n2.By minimal period(asc)\n3.By maximal period");
        int choose = sc.nextInt();
        switch(choose){
            case 1:
                Collections.sort(deposits,Comparator.comparingDouble(d->d.getInterestRate()));
                break;
            case 2:
                Collections.sort(deposits,Comparator.comparingDouble(d->d.getMinPeriod()));
                break;
            case 3:
                Collections.sort(deposits,Comparator.comparingDouble(d->d.getMaxPeriod()));
                break;
        }
    }

}
class CalculateIncome implements Command{
    private CalculateIncome calc;
    @Override
    public void execute() {

        System.out.println("Calc");
    }
}
class ShowMyDeposit implements Command{

    @Override
    public void execute() {
        System.out.println("show");
    }
}