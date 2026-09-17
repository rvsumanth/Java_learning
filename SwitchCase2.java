import java.util.Scanner;

public class SwitchCase2{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int day = sc.nextInt();

        String result = switch (day){
            case 1: yield "Monday";
            case 2: yield "Tuesday";
            case 3: yield "Wednesday";
            case 4: yield "Thrusday";
            case 5: yield "Friday";
            case 6: yield "Saturday";
            case 7: yield "Sunday";
            default : yield "Invalid Number";
        };

        System.out.println(result);
    }
  }