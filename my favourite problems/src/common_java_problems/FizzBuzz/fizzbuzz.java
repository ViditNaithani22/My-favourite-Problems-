package common_java_problems.FizzBuzz;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class fizzbuzz {

    public static List<String> fizzBuzz(int n) {

        List<String> answer = new ArrayList<String>(n);
        for(int i = 1; i<=n; i++){
            boolean divBy3 = i % 3 == 0;
            boolean divBy5 = i % 5 == 0;
            boolean divBy7 = i % 7 == 0;

            String curStr = "";
            if(divBy3){
                curStr += "Fizz";
            }
            if(divBy5){
                curStr += "Buzz";
            }
            if(divBy7){
                curStr += "Jazz";
            }
            if(curStr.isEmpty()){
                curStr += String.valueOf(i);
            }
            answer.add(curStr);
        }


        return answer;
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("enter the length of the list");
        int length = scan.nextInt();
        List<String> ans = fizzBuzz(length);
        System.out.println(ans.toString());
    }
}
