package practice_3;

public class Person {


    private String firstName;
    private String lastName;
    private final String ssn;


    Person(String firstName, String lastName, String ssn){
        this.firstName = firstName;
        this.lastName = lastName;
        this.ssn = ssn;
    }


    public String getFirstName(){
        return firstName;
    }

    public void setFirstName(String newFirsName){
        if (newFirsName == null){
            throw new IllegalArgumentException("Не указаны данные!");
        }

        firstName = newFirsName;
    }



    public String getLastName(){
        return lastName;
    }


    public void setLastName(String newLastName){
        if (newLastName == null){
            throw new IllegalArgumentException("Не указаны данные!");
        }
        lastName = newLastName;
    }


    public String getSsn(){
        return ssn;
    }


    public String printPersonInfo(){
        return String.format("Имя: " +  firstName + ", Фамилия: " + lastName +  ", SSN: " + ssn);
    }




    public static void main(String[] args) {
        Person ivan = new Person("Иванов", "Иван", "51-09-990");
        Person petya = new Person("Петр", "Петров", "28-98-444");

        petya.setFirstName("Виктор");

        System.out.println(ivan.printPersonInfo());
        System.out.println(petya.printPersonInfo());


    }




}
