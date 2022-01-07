class Thread2 implements Runnable {                       
// runnable is another way of thread. It is used when we want to extend parent class and thread class as well so on that time it won't extends the thread so we used runnable. Ex: class Thread2 extends Student implements Runnable
    @Override
    public void run(){
        try {
            System.out.println("Thread2 is running");
        } catch(Exception e) {
            System.out.println("Exception raised" +e);
        } 
    }
}
