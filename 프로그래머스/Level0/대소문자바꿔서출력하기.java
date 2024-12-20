package level0;


import java.util.Scanner;

public class 대소문자바꿔서출력하기 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        String a=sc.next();

        //일단 문자하나하니씩 대문자인지 소문자인지 확인한다.
        for(char k:a.toCharArray()){
            if (Character.isUpperCase(k)){
                System.out.print(Character.toLowerCase(k));

            }
            else{
                System.out.print(Character.toUpperCase(k));
            }
        }
    }
}
