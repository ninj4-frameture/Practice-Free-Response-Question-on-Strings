import java.util.Scanner;
public class Main{
    public static void main(String[] args) {
        Scanner user_input= new Scanner(System.in);
        System.out.println("Enter a word:");
        String a=user_input.nextLine();
        String b="";
        for(int c=a.length()-1; c >= 0; c--){
            char d=a.charAt(c);
            b+=d;
            }
        System.out.println(a);
        System.out.println(b);
        user_input.close();

    }
}