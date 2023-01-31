import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner imp = new Scanner(System.in);
        System.out.print("Sayı Giriniz: ");
        int n= imp.nextInt();
        int n1 = n;
        int toplam=0;
        //mukemmel sayı = 28 = 1 +2 +4 +7+ 14

        for(int i =1; i<n; i++){
            if(n%i==0){
                toplam+=i;
            }

        }
        if(toplam == n){
            System.out.print(n +" mükemmel bir sayıdır");
        }else{
            System.out.println(n +" mükemmel sayı değildir");
        }
    }
}