//code to check whether the string is a palindrome or not 
import java.util.Scanner;
public class Main{
    public static void main(String[] args){
        Scanner lucky=new Scanner(System.in);
        System.out.println("Enter a string as an input to check");
        String input=lucky.nextLine();
        
        //checking whether palindrome or not
        if(ispalindrome(input)){
            System.out.println(input+ "is a palindrome string");
        }
        else{
            System.out.println(input+ "is not a palindrome string");
        }
    }
    public static boolean ispalindrome(String str){
        int left=0,right=str.length() -1;
        while(left<right){
            if(str.charAt(left) !=str.charAt(right))
            {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }
}
