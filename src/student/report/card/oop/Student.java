package student.report.card.oop;

public class Student {

    String markCourse[][] = new String[4][2];
    int studentNumber;
    int average;
    String lastName;
    String firstName;

    public int calulateAverage() {
        int markSum = 0;
        for (int j = 0; j < 4; j++) {
            int markTemp = Integer.parseInt(markCourse[j][1]);
            markSum = markSum + markTemp;
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
