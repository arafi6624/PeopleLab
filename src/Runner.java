public class Runner {
    private static String[] firstName= {"John", "David", "Peter", "Jim", "Jimmy", "Daniel", "Chris", "Chin", "Robert"};
    private static String[] familyName = {"Chan", "Wu", "Patel", "Rafi", "Rafael", "Smith", "Ramsey", "Levin", "Pratt"};
    public static void main (String[] args)
    {
        Teacher teacher = new Teacher ("Computer Science", "Mr", ""+firstName[(int)Math.random()*9],"" + familyName[(int)Math.random()*9] );
        for (int i=0; i<=34; i++)
        {
            Student student = new Student(Math.random()*4+100000)
        }
}

}
