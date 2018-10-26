import javax.swing.plaf.basic.BasicInternalFrameTitlePane;

public class Runner {
    private static String[] firstName= {"John", "David", "Peter", "Jim", "Jimmy", "Daniel", "Chris", "Chin", "Robert"};
    private static String[] familyName = {"Chan", "Wu", "Patel", "Rafi", "Rafael", "Smith", "Ramsey", "Levin", "Pratt"};

    public static void main (String[] args)
    {
        //Declare and initialize the teacher
        Teacher teacher = new Teacher ("Computer Science", "Mr", firstName[(int)(Math.random()*firstName.length)], familyName[(int)(Math.random()*familyName.length)] );
        //Declare and initialize the students
        Student[] studentArr= new Student[34];
        for (int i=0; i<34; i++)
        {
            Student student = new Student(Math.random()*5, (int)(Math.random()*899999999+100000001),(int)(Math.random()*3+9), firstName[(int)(Math.random()*firstName.length)], familyName[(int)(Math.random()*familyName.length)]);
            studentArr[i]= student;
        }
        //Declare and initialize the classroom
        Classroom classroom= new Classroom(teacher, studentArr);

        classroom.printClass();
        System.out.println("The students average GPA is a: "+classroom.classAverage());
}

}
