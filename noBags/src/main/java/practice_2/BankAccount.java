package practice_2;

public class BankAccount {

    String owner;
    double balance;


    public BankAccount(String owner,double balance){
        this.owner = owner;
        this.balance = balance;
    }

    String getOwner(){
        return this.owner;
    }

    double getBalance(){
        return this.balance;
    }


    void setOwner(String newOwner){
        this.owner = newOwner;
    }


    //Пополнение
    public void deposit(double amountDeposit){
        this.balance = balance + amountDeposit;
    }

    //Вывод
    public void withdraw(double amountWithdraw){
        this.balance = balance - amountWithdraw;
    }


    void printBalance(){
        System.out.println("Уважаемый " + owner + " , ваш баланс: " + balance);
    }






}





