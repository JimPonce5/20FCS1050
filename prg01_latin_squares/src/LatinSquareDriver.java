/*
 * CS1050 - Computer Science I - Fall 2020
 * Instructor: Thyago Mota
 * Description: Prg01 - LatinSquare
 * Student(s) Name(s):Jim Ponce
 */

import java.util.Scanner;

public class LatinSquareDriver {

    static final int MIN_ORDER = 3;
    static final int MAX_ORDER = 99;

    public static void main(String[] args) {

        // safe checking whether MIN_ORDER < MAX_ORDER and MAX_ORDER < 99
        if (MIN_ORDER >= MAX_ORDER || MAX_ORDER > 99) {
            System.out.println("MIN_ORDER must be < MAX_ORDER!");
            System.out.println("MIN_ORDER = " + MIN_ORDER);
            System.out.println("MAX_ORDER = " + MAX_ORDER);
            System.exit(1); // program exits with an error code
        }

        // TODO: ask the user for the order of the square;
        // the number entered  must be in [MIN_ORDER..MAX_ORDER];
        // the program should continuously ask the user for the
        // order of the square, until a valid number is entered.
        Scanner sc =new Scanner(System.in);
        boolean flag=false; int order = 0;int n=0;
        boolean flag1=false;
        while(flag==false){
            System.out.println("Enter your first number in order: ");
            order = sc.nextInt():
            if(order>=MIN_ORDER && order<=MAX_ORDER)
                flag= true;
        // TODO: ask the user for the first number of the square;
        // the number entered must be in [1..order];
        // the program should continuously ask the user for the
        // first number of the square, until a valid number is entered.
            while(flag1=false){
                System.out.println("Enter your first number: ");
                n = sc.nextInt();
                if(n>=1 && n <=order)
                    flag1=true;
            }
            int m=n;
            for(int i=0;i<order;j++){
                System.out.print(m+" ");
                m++;
                if (m>order)
                    m=1;
            }
            System.out.println();
            if(n>=order){
                m=1;
                n=1;
            }
            else{
                m=n+1;
                n++;
            }
        // TODO: generate the latin square;
        // after you run your code, the output must be saved in a file named latin_square_A_B.txt,
        // where A should be replaced by the order and B by the first number; for example,
        // if order is 5 and the first number is 2, the file should be named latin_square_5_2.txt
    }
}
