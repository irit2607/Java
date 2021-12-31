//The parameterized constructor is used to provide the diff values to obj

class StudentInfo{

    int roll; 
    String name;

StudentInfo(int r, String n)
{
    roll = r;
    name = n;
}

void display() {

    System.out.println(roll + " " +name);
    }
}    

public class Parameterized{

public static void main(String[] args) {

     StudentInfo s1 = new StudentInfo(1, "IK"); 
     StudentInfo s2 = new StudentInfo(2, "SK");
     
     s1.display();
     s2.display();
     
    }
}
     
