import java.util.*;
import java.io.*;

public class Main {


    public static long fact(long Num) {
        if(Num == 0 || Num == 1) {
            return 1;
        }
        return fact(Num - 1) * Num;



    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int Num = sc.nextInt();

        System.out.print(fact(Num));
    }


}