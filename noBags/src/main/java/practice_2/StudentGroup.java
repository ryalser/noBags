package practice_2;

public class StudentGroup {


    String groupName;
    int studentCount;

    public StudentGroup(String groupName, int studentCount){
        this.groupName = groupName;
        this.studentCount = studentCount;
    }

    String getGroupName(){
        return this.groupName;
    }

    int getStudentCount(){
        return this.studentCount;
    }

    void setGroupName(String newGroupName){
        this.groupName = newGroupName;
    }


    void setStudentCount(int newStudentCount){
        this.studentCount = newStudentCount;
    }


    public void printInfo (){
        System.out.println("Название группы: " + groupName + ", кол-во студентов: " + studentCount);
    }

}
