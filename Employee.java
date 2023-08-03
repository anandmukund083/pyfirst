class Employee{
    class Student{
        static int marks;
        static String name;
        static String department;
        static String stname()
        {
            return name;
        }
        static String depar()
        {
            return department;
        }
        static int stmarks()
        {
            return marks;
        }
    }
    public static void main(String[] args) {
        Student.name="Anand";
        //System.out.println(Student.stname());
    }
}