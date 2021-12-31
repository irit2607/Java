
class StudentInfo
{

    int roll; 
    String name;
    static String dept = "Computer Science";    //dept is a static variable. It allocates memory only once

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

public class StacticKey
{

public static void main(String[] args)
{

     StudentInfo s1 = new StudentInfo(1, "IK"); 
     s1.display();
    }
}
 
// Output
// 1 IK Computer Science


     
