package sequence;
import java.util.Scanner;
import java.math.BigInteger;
/**
 *
 * @author Emelyanov Konstantin
 * @version 1.0
 * @since   2016-10-14
 */
public class Sequence {
    static String sequenceA; 
    static String s ="1";
    static int result = -1;
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int intA = in.nextInt();
        sequenceA =Integer.toString(intA);
        BigInteger i = BigInteger.ONE;
        while(result == -1){
            result = s.indexOf(sequenceA);
            i = i.add(BigInteger.ONE);
            s = s.concat(i.toString());
        }
        result =result+1;
        System.out.println(""+result);
    }    
}
