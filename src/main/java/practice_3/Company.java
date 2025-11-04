package practice_3;

public class Company {

    static String companyName = "T-Bank";
    final int employeeID;
    String employeeName;

    Company(int employeeID, String employeeName){
        this.employeeID = employeeID;
        this.employeeName = employeeName;
    }

    public static void printCompanyName(){
        System.out.println("Название компании: " + companyName);
    }

    String getEmployeeName(){
        return employeeName;
    }

    public void setEmployeeName(String newEmployeeName){
        if (newEmployeeName == null){
            throw new IllegalArgumentException("Имя сотрудника не задано!");
        }

        this.employeeName = newEmployeeName;
    }


    public static void main(String[] args) {



        Company employee1 = new Company(1,"Alex");
        Company employee2 = new Company(2,"Petya");

        Company.companyName = "SBER";

        Company.printCompanyName();


        //Попытка изменить final поле - ошибка!
        //employee1.employeeID = 3;



    }


}
