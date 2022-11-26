package switch_case;

import java.util.Scanner;

public class switch_case_kodlama_io {
    public static void main(String[] args) {

        char grade;


        Scanner keyboard = new Scanner(System.in);

        do {

            System.out.println("Enter the grade\t:");
            grade= keyboard.next().charAt(0);
            switch (grade){
                case 'A':
                    System.out.println("Excellent..");
                    break;
                case 'B':
                    System.out.println("Very Nice");
                    break;
                case 'C':
                    System.out.println("Nice");
                    break;
                case 'D':
                    System.out.println("Enought to succeed lesson");
                    break;
                case 'F':
                    System.out.println("Fail!");
                    break;
                case 'O':
                    break;
                default:
                    if(grade=='O'){
                        System.out.println("The Program has been ended.");
                    }else
                    System.out.println("ERROR!");
            }


        }while(grade!='O');// ENTER 'O' TO STOP PROGRAM

        if(grade=='O'){
            System.out.println("===========================");
            System.out.println("The Program has been ended.");
        }




    }
}