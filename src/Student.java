public class Student extends Person {
    private double GPA;
    private int osis;
    private int hsGradeNum;

    public Student (double GPA, int osis, int hsGradeNum, String firstName, String familyName){
        super (firstName, familyName);
        this.GPA = GPA;
        this.osis = osis;
        this.hsGradeNum = hsGradeNum;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getFamilyName()+ " ";
    }
}
