public class Main{
    public Integer add (Integer arg1,Integer arg2){
        Integer result = arg1 + arg2;
        return result;
    }
    public static void main(String[] args)
    {
        Main cal = new Main();
        Integer result = cal.add(45,3);
        System.out.println("Result of addition is " +result);
    }
}
