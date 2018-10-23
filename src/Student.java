public class Student extends Person {
    private double GPA;
    private int osis;
    private int gradeNum;

    public Student (double GPA, int osis, int gradeNum, String firstName, String familyName){
        super (firstName, familyName);
        this.GPA = GPA;
        this.osis = osis;
        this.gradeNum = gradeNum;
    }

    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getFamilyName();
    }
}
