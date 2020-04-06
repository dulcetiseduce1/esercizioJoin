public class classemain {
    public static void main(String[] args) throws InterruptedException
    {


        classethread esempio = new classethread();
        classethread esempio1 = new classethread();
        classethread esempio2 = new classethread();


        esempio.start();
        esempio.join();
        esempio1.start();
        esempio1.join();
        esempio2.start();
    }
}