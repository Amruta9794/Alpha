import java.util.Scanner;

public class PalindromeString {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter A String");
        String str=sc.next();

        Palindrome(str);
    }
        public static void Palindrome(String str){
            int flag=0;
            for(int i=0;i<str.length()/2;i++){

                if(str.charAt(i)!=str.charAt(str.length()-i-1)){
                    flag=1;
                }

            }
            if(flag==0){
                System.out.println(str+" is a Palindrome");
            }else{
                System.out.println(str+" is not a palindrome");
            }
        }
    }
    

