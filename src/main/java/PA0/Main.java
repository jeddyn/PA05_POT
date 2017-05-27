package PA0;


import java.io.IOException;
import java.util.Scanner;

/**
 * Created by Mateusz on 2017-05-20
 */
public class Main {
    public static void main(String[] args) throws IOException {
        int base;
        int index ;
        int c;

        Scanner scanner = new Scanner(System.in);
        c = scanner.nextInt();
        for(int i = 0; i<c; i++)
        {
            base = scanner.nextInt();
            index = scanner.nextInt();
            ModularAlgorithm modularAlgorithm = new ModularAlgorithm();
            System.out.println(String.valueOf(modularAlgorithm.pModular(base,index)));
        }
    }
}
