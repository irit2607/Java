//The default constructor is used to provide the default values to the object like 0, NULL depending on type

class StudentInfo{

    int roll; 
    String name;

void display() {

    System.out.println(roll + " " +name);
    }
}    

public class Main{

public static void main(String[] args) {

     StudentInfo s1 = new StudentInfo(); 
     StudentInfo s2 = new StudentInfo();
     
     s1.display();
     s2.display();
     
    }
}
     
/* Output 
0 null
0 null
*/
