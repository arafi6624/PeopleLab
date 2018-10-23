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
    public String printClass()
    {
        String temp="";
        for (Student name: students)
        {
            temp+= students.toString()+ " ";
        }
        return teacher + "'s "+getSubject()+"with these students: "+ temp;
    }
}
