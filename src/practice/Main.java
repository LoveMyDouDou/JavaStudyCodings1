package practice;

import java.util.Scanner;

public class Main {

    public static void main(String [] args){
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int radis=scanner.nextInt();
        System.out.println(Integer.toString(n,radis).toUpperCase());
    }
}
