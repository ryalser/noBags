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
        if(newOwner == null || newOwner == ""){
            throw new IllegalArgumentException("Не указан владелец счета!");

        }
        this.owner = newOwner;
    }


    //Пополнение + проверка на отрицательное число
    public double deposit(double amountDeposit){
        if (amountDeposit <= 0){
            throw new IllegalArgumentException("Пополнение не может быть <= 0!");
        }
        this.balance = balance + amountDeposit;
        return this.balance;
    }

    //Вывод
    public double withdraw(double amountWithdraw){
        if(amountWithdraw <= 0){
            throw new IllegalArgumentException("Сумма снятия не должна быть <=0!");
        }
        if(balance < amountWithdraw || balance < 0){
            throw new IllegalArgumentException("Баланс не должен быть меньше суммы вывода!");
        }
        this.balance = balance - amountWithdraw;
        return this.balance;
    }


    //Раньше: вывод в консоль:
    void printBalance(){
        System.out.println("Уважаемый " + owner + " , ваш баланс: " + balance);
    }

    //Теперь: метод, возвращающий строку с инфо о балансе:
    public String getInfoBalance(double balance){
        return String.format("Ваш баланс составляет: " + balance);
    }

    //+ отдельно строка с информацией о балансе после операции:
    public String getBalanceAfterOperation(double balance){
        return String.format("Ваш баланс после операции составит: " + balance);
    }


}





