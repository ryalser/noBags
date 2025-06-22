package practice_3;

public class University {

    static String universityName = "МГИМО";
    final int studentId;
    String studentName;

    University(int studentId, String studentName){
        this.studentId = studentId;
        this.studentName = studentName;
    }



    public static String changeUniversityName(String newName){
        if(newName == null){
            throw new IllegalArgumentException("Название университета не выбрано!");
        }

        universityName = newName;
        return universityName;
    }

    String getStudentName(){
        return studentName;
    }


    public String printStudentInfo(){
        return String.format("ID: " + studentId + ", Имя: " + studentName + ", Университет: " + universityName);
    }


    public static void main(String[] args) {

        University student1 = new University(1, "Alex");
        University student2 = new University(2, "Petya");
        University student3 = new University(3, "Ivan");


        University.universityName = "МГУ";

        System.out.println(student2.printStudentInfo());



    }





}
