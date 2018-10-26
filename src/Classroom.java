public class Classroom {
    private Student[] students;
    private Teacher teacher;
    public Classroom (Teacher teacher, Student[]  students)
    {
        this.students= students;
        this.teacher=teacher;
    }
    public String getSubject()
    {
        return this.teacher.getSubject();
    }
    public double classAverage()
    {
        double totalGPA=0;
        for (Student val: students)
      {
         totalGPA+= val.getGPA();
      }
      double Average = totalGPA/students.length;
        return Average;
    }
    public void printClass()
    {
        System.out.println("Teacher: "+teacher);
        System.out.println("Subject: "+getSubject());
        System.out.println("The students in the class are:");
        for (Student name: students)
        {
           System.out.println(name);
        }
    }
}
