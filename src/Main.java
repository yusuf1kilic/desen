import java.util.Scanner;

public class Main {
    static int desen(int x,int y){
        System.out.print(x+" ");

        if (x<=0){
            return desen2(x+5,y);


        }
        return desen(x-5,y);

    }
    static int desen2(int x,int y){
        System.out.print(x+" ");
        if (x==y){
            return x;

        }

        return desen2(x+5,y);
    }





    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("lütfen bir değer giriniz : ");
        int number= input.nextInt();
        System.out.println(desen(number,number));

    }
}
