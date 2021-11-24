import model.Student;

public class main {
    public static void  main(String[] args)
    {
        Student abc = new Student("abc",10,"M",1234);
        System.out.println(abc.getGender());
        System.out.println(abc.getId());
        System.out.println(abc.getAge());
        System.out.println(abc.getName());
    }
}
