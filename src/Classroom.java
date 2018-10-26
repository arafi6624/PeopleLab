public class Classroom {
    private Student[] students;
    private Teacher teacher;

    /**
     *
     * @param teacher- Data of the subject teacher
     * @param students- Array of all the student's info
     */
    public Classroom (Teacher teacher, Student[]  students)
    {
        this.students= students;
        this.teacher=teacher;
    }

    /**
     *
     * @return - the subject that the teacher teaches
     */
    public String getSubject()
    {
        return this.teacher.getSubject();
    }

    /**
     *
     * @return - the class GPA average
     */
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

    /**
     * Prints the class Teacher, then the subject, then all the names of the students in the class
     */
    public void printClass()
    {
        System.out.println("Teacher: "+teacher);
        System.out.println("Subject: "+getSubject());
        System.out.println("The students in the class are:");
        for (Student name: students)
        {
           System.out.println(name+ "Student Info: GPA: "+name.getGPA()+" Student Osis: "+name.getOsis()+ " High School grade level: "+name.getHsGradeNum());
        }
    }
}
