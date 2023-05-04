import java.util.Scanner;

public class CharAtS {

    public static void main(String[] args) {
       System.out.println("Enter your name");
       Scanner sc= new Scanner(System.in);
       String Fullname= sc.nextLine();
        PrintLetters(Fullname); 
        print(Fullname);
    }

    public static void PrintLetters(String str){
        for(int i=0;i<str.length();i++){
            System.out.print(str.charAt(i)+ " ");
        }
        System.out.println();
    }

    public static void print(String str){
       for(int i=0;i<str.length();i++){
        if(str.charAt(i)=='A'||str.charAt(i)==' '){
            continue;
        }else {
            System.out.print(str.charAt(i)+" ");
        }
        }
    }    
}
