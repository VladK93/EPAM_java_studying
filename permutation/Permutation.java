package permutation;

public class Permutation {
    public static void main(String[] args) {
        Permutation.perm(695);
    }

   static void perm(int n){
        int number = n;
        int a, b, c;
        a = number/100;
        b = (number%100)/10;
        c = (number%100)%10;
    if (a>b && a>c){
        if(b>c){
            System.out.println(a+""+b+""+c);
        }else{
            System.out.println(a+""+c+""+b);
        }
    } else if (b>a&&b>c) {
        if(a>c){
            System.out.println(b+""+a+""+c);
        }else {
            System.out.println(b+""+c+""+a);
        }

    } else if (c>a&&c>b) {
        if (a>b){
            System.out.println(c+""+a+""+b);
        }else {
            System.out.println(c+""+b+""+a);
        }

    }
       System.out.println(a +" ,"+ b  + " ," + c );

    }
}