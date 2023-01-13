package Demos;

import java.util.Random;

/**
 * @author WCL
 */
public class RandomDemo {
    public static void main(String[] args) {
        /*Random i = new Random();
        int random = i.nextInt(100) + 1;
        System.out.println("cai");
        while (true) {
            Scanner scanner = new Scanner(System.in);
            int inPut = scanner.nextInt();
            if (inPut > random)
                System.out.println("da");
            else if (inPut < random) {
                System.out.println("xiao");
            }
            else if (inPut == random) {
                System.out.println("6");
                break;
            }
        }*/

        Random r = new Random();
        while (true) {
            int random = r.nextInt(26) + 97;
            char var = (char) random;
            System.out.println(var);
            if (var == 'a') {
                break;
            }
        }
    }
}
