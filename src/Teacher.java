public class Teacher extends Person {
    private String Subject;
    private String Title;

    /**
     *
     * @param Subject- the subject that the teacher teaches
     * @param Title - the title of the teacher
     * @param firstName - The first name of the teacher
     * @param familyName - The family name of the teacher
     */
    public Teacher(String Subject,String Title, String firstName, String familyName)
    {
        super(firstName, familyName);
        this.Subject=Subject;
        this.Title=Title;
    }

    /**
     *
     * @return - the subject that the teacher teaches
     */
    public String getSubject()
    {
        return Subject;
    }
    @Override
    public String toString()
    {
        return Title+". "+ getFamilyName();
    }
}
