//Constructor are diffrentiated by no. of parameters in the list and their datatypes

class StudentInfo{

    int roll; 
    String name;
    String dept;

StudentInfo(int r, String n)
{
    roll = r;
    name = n;
    dept = "CST";
    System.out.println(roll + " " +name+ " " +dept);
}

StudentInfo(int r, String n, String d)
{
    roll = r;
    name = n;
    dept = d;
    System.out.println(roll + " " +name+ " " +dept);
}

}    

public class ConstructorOverloading{

public static void main(String[] args) {

     StudentInfo s1 = new StudentInfo(1, "IK"); 
     StudentInfo s2 = new StudentInfo(2, "SK", "IT");

    }
}
 
// Output
// 1 IK CST
// 2 SK IT

     
