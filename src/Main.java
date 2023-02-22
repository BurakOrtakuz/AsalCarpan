import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) {
        BigInteger j= new BigInteger("600851475143");
        BigInteger i= new BigInteger("1");
        BigInteger k=new BigInteger("1");
        BigInteger m=new BigInteger("0");
        while(!j.equals(i)){
            if(j.mod(i).equals(m)){
                j=j.divide(i);
                System.out.println(i);
            }
            i= i.add(k);
        }
        if(j.mod(i).equals(m)){
            j=j.divide(i);
            System.out.println(i);
        }
    }
}
