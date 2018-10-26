public class Student extends Person {
    private double GPA;
    private int osis;
    private int hsGradeNum;
    /**
     *
     * @param GPA- GPA of the student
     * @param osis- student Osis of the student
     * @param hsGradeNum- High Grade Level
     * @param firstName- First name of student
     * @param familyName- Family name of student
     */
    public Student (double GPA, int osis, int hsGradeNum, String firstName, String familyName){
        super (firstName, familyName);
        this.GPA = GPA;
        this.osis = osis;
        this.hsGradeNum = hsGradeNum;
    }

    /**
     *
     * @return - Osis of student
     */
    public int getOsis() {return osis;}

    /**
     *
     * @return - High School grade level of student
     */
    public int getHsGradeNum() {return hsGradeNum;}

    /**
     *
     * @return - GPA of student
     */
    public double getGPA() {
        return GPA;
    }

    @Override
    public String toString() {
        return getFirstName() + " " + getFamilyName()+ " ";
    }
}
