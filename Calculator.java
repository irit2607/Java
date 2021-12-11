public class Calculator{
    public Integer add (Integer arg1, arg2){
        Integer result = arg1 + arg2;
    }

    public static void main(String[] args)
    {
        Calculator cal = new Calculator();
        Integer result = cal.add(45,3);
        System.out.println("Result of addition is " +result);
    }
}