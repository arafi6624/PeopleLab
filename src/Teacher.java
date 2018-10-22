public class Teacher extends Person {
    private String Subject;
    private String Title;
    public Teacher(String Subject,String Title);
    {
        super("");
        this.Subject=Subject;
        this.Title=Title
    }
    @Override
    public String getSubject() {
        return Subject;
    }
    @Override
    public String getTitle() {
        return Title;
    }
}
