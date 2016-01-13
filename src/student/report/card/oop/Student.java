package student.report.card.oop;

public class Student {

    String course[] = new String[4];
    int mark[] = new int[4];
    int studentNumber;
    int average;
    String lastName;
    String firstName;

    public int calulateAverage() {
        int markSum = 0;
        for (int j = 0; j < 4; j++) {
            markSum = markSum + mark[j];
        }
        average = markSum / 4;
        return average;
    }
    public String lastName(String lName){
        lastName=lName;
        return lastName;
    }
    public String firstName(String fName){
        firstName=fName;
        return firstName;
    }
    public int studentNumber(int sNumber){
        studentNumber=sNumber;
        return studentNumber;
    }
    
}
//hello
