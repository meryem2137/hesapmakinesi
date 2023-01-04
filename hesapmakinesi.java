import java.util.Scanner;

public class hesapmakinesi {


    public static void main(String[] args) {
        int a, b, select;
        Scanner input = new Scanner(System.in);
        System.out.print("enter to first number: ");
        a = input.nextInt();
        System.out.print("enter to second number: ");
        b = input.nextInt();
        System.out.print("1-addition\n2-extraction process\n3-multiplication\n4-division\n");
        System.out.print("make your choose: ");
        select=input.nextInt();
         switch(select){
             case 1:
                 System.out.print("addition: "+(a+b));
                 break;
             case 2:
                 System.out.print("extraction: "+(a-b));
                 break;
             case 3:
                 System.out.print("multiplication: "+(a*b));
                 break;
             case 4:
                 if(b !=0){
                     System.out.print("division: "+(a/b));
                 }else{
                     System.out.print("A number cannot be divided by zero2");
             }

                 break;
             default:
                 System.out.print("yanlış seçim yaptınız ");




         }



        }

    }
