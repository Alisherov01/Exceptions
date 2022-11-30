import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        try {
            int a = sc.nextInt();
            int b = sc.nextInt();
            double c = a/b;
            System.out.println(c);
        } catch (ArithmeticException a) {
            System.out.println("На ноль делить тнельзя!");
        }
    }
}


//    int[] m = new int[2];
//        try{
//            m[8] = 5;
//        }catch(ArrayIndexOutOfBoundsException e){
//            System.out.println("Ошибка!");
//        }
//    }


//        try{
//            String s = null;
//            String m = s.toLowerCase(Locale.ROOT);
//        }catch(NullPointerException e){
//            System.out.println("Ошибка!");
//        }