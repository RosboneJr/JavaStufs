import java.util.Scanner;
public class LoopsDemo {
    public static void main(String[] args) {

        int ye = 5;
        int ey = 20;
        evenOrOdd2();
    }
    public static void evenOrOdd2(){
        Scanner input = new Scanner(System.in);
        int i = 0;
        while(i != -99){
            System.out.println("enter a num that isn't negative --> ");
            i = input.nextInt();
            if(i >=0){
                if(i % 2 == 0){
                    System.out.println("Even Number");
                }else{
                    System.out.println("odd number");
                }
            }else if(i == -99){
                System.out.println("ok your done now");
            }else{
                System.out.println("You done gon an dond it rong");
            }
        }


    }
    public static void countingNum(int ye){
        int i = ye;
        int j = 0;
        while(j <= i){
            System.out.println(j);
            j++;
        }
    }
    public static void multication(int ye){
        int i = ye;
        int j = 1;
        double sum;
        while(j <= 10){
            sum = i * j;
            System.out.println(i +"*"+ j +"="+sum);
            j++;
        }
    }
    public static void stars(int ye){
        int i = ye;
        char star = '*';
        String starstring = "";
        if(ye > 0){
            while(i > 0){
                starstring = starstring + star;
                System.out.println(starstring);
                i--;
            }
        }else{
            System.out.println("You done gon an dond it rong");
        }
    }
    public static void countToNumForLoop(int aNum){
        System.out.println("Counting to " + aNum);
        for(int i = 0; i <=aNum; i++){
            System.out.println(i);
        }
    }
    public static void whileLessThanaNumCountEmAll(int aNum){
        int i = aNum;
        while(i < 20){
            System.out.println(i);

            for(int j = 1; j < i; j++){
                System.out.print(j + " ");
            }
            i++;
            System.out.println();
        }
    }
    public static void evenOrOdd(int num){
        System.out.println("im gonna check out this hot num!");
        if(num % 2 == 1 || num == 420){
            System.out.println("its odd!");
        }else if(40 % num == 0 && num < 20){
            System.out.println("its super awesome and even! :)");
        }else{
        System.out.println("its even! :/");
    }
    }
}
