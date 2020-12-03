import java.io.IOException;

class Excp extends Throwable{

    public void m1(){
        try {
            throw new IOException("array not there");


        } catch (IOException e) {
            e.printStackTrace();
        }
        finally{
            System.out.println("Bye");
        }


    }

}
public class demo {
    public static  void main(String [] args){
        Excp m=new Excp();
        m.m1();
    }
}
