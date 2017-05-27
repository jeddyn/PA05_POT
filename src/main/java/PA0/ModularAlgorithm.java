package PA0;

import java.util.Scanner;

/**
 * Created by Mateusz on 2017-05-20.
 */
public class ModularAlgorithm {


    public long pModular(int base, int index){
            int i;
            int result = 1;
            final int modulation = 10;
            long x = base%modulation;

            for (i=1; i<=index; i<<=1) {
                x %= modulation;
                if ((index&i) != 0) {
                    result *= x;
                    result %= modulation;
                }
                x *= x;
            }

            return result;
        }

    }


