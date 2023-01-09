package isbn;

import java.util.Scanner;

public class ISBN {

    
    public static void main(String[] args) {
        Scanner kb=new Scanner(System.in);
        System.out.print("Enter an ISBN: ");
        System.out.println(isbn13(kb.next()));
    }
    
    public static String isbn13(String ISBNCode){
        
        //check if it should be isbn 13 compliant, and is only numbers
        if (ISBNCode.length()==13 && ISBNCode.matches("[0-9]+")) {
            
        
            int sum=0;
        //Take the sum of products for the code, 10-i allows us to start at index 0 and multiply with the correct value as we iterate through the code.
        for (int i = 0; i < ISBNCode.length(); i++) {
                if (i%2==0) {
                    sum+=Integer.parseInt(ISBNCode.charAt(i)+"")*(1);
                }else{
                    sum+=Integer.parseInt(ISBNCode.charAt(i)+"")*(3);
                }   
            }
        //Check if code is invalid
        if (sum%10!=0) {
            return "Invalid";
        }
        
        return "Valid";
        //if incorrect size, check if isbn10 compliant
        }else if(ISBNCode.length()==10){
        //confirm the string only consists of numbers or the letter X in the final digit
        if(ISBNCode.matches("[0-9]+") || ISBNCode.endsWith("X")){
        int sum=0;
        //Take the sum of products for the code, 10-i allows us to start at index 0 and multiply with the correct value as we iterate through the code.
        for (int i = 0; i < ISBNCode.length()-1; i++) {
            sum+=Integer.parseInt(ISBNCode.charAt(i)+"")*(10-i);
        }
            if (ISBNCode.charAt(9)=='X') {
                sum+=10;
            }else{
                sum+=Integer.parseInt(ISBNCode.charAt(9)+"");
            }
        //Check if code is invalid
        if (sum%11!=0) {
            return "Invalid";
        }else{
            //add the 978 prefix to the code
            String num13="978"+ISBNCode;
            sum=0;
            //find new sum of products to determine check digit.
            for (int i = 0; i < num13.length()-1; i++) {
                if (i%2==0) {
                    sum+=Integer.parseInt(num13.charAt(i)+"")*(1);
                }else{
                    sum+=Integer.parseInt(num13.charAt(i)+"")*(3);
                }   
            }
            String last="X";
            if (num13.charAt(12)=='X') {
                sum+=10;
                last=(((10)+10-(sum%10))%10)+"";
            }else{
                sum+=Integer.parseInt(num13.charAt(12)+"");
                last=((Integer.parseInt(num13.charAt(12)+"")+10-(sum%10))%10)+"";
            }
            //check digit is a combination of the original last digit and the excess needed to make the sum of products divisible by 10 (since the last digit is multiplied by one we can add this missing amount directly)
            
            //Append check digit
            num13=num13.substring(0, 12)+last;
            return num13;
        }
        }
        return "Invalid";
        //if length is neither 10 nor 13 then it is invalid
        }else{
            return "Invalid";
        }
        
        }
}
