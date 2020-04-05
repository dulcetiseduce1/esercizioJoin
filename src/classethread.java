public class classethread extends Thread {
    public void run() {


        //contatore
        for ( int i = 1; i <= 10; i++ )
        {
            System.out.println("thread numero: " + i);
        }


    }
}