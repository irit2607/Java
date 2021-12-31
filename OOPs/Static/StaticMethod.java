
class StudentInfo
{

    int roll; 
    String name;
    static String dept = "Computer Science";    //dept is a static variable. It allocates memory only once

    static void check()
    {
        dept = "IT"; //static method can be invoked without the need of creting the instance of a class
    }
    
    StudentInfo(int r, String n)
    {
      roll = r;
      name = n;
    }

    void display()
    {
       System.out.println(roll + " " +name+ " " +dept);
    }

}    

public class StaticMethod
{

public static void main(String[] args)
{
     StudentInfo.check();
     StudentInfo s1 = new StudentInfo(1, "IK"); 
     s1.display();
    }
}
 
// Output
// 1 IK Computer IT


     
