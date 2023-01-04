import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner input= new Scanner(System.in);
        int n1,n2,n3,n4;
        int min,max;
        System.out.print("Lütfen 1. sayıyı giriniz :");
        n1 = input.nextInt();
        System.out.print("Lütfen 2. sayıyı giriniz :");
        n2 = input.nextInt();
        System.out.print("Lütfen 3. sayıyı giriniz :");
        n3 = input.nextInt();
        System.out.print("Lütfen 4. sayıyı giriniz :");
        n4  = input.nextInt();


        if (n1<n2 && n1<n3 && n1<n4 ){
            min = n1;
        }else if (n2<n3 && n2<n1 && n2<n4){
            min = n2;
        } else if (n3<n4 && n3<n1 && n3<n2) {
            min = n3;
        }else min = n4;

        if (n1>n2 && n1>n3 && n1>n4){
            max = n1;
        } else if (n2>n3 && n2>n1 && n2>n4) {
            max = n2;
        }else if (n3>n4 && n3>n1 && n3>n2){
            max = n3;
        }else max = n4;

        System.out.println("En küçük sayı :" + min);
        System.out.print("En büyük sayı :" + max);

    }
}