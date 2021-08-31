package com.example.sping_portfolio;

import java.util.Scanner;

public class random {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        double[] grades = {90, 91, 92, 93, 94};

        double sum=0;
        for(int i=0; i<5; i++){
            System.out.println("Grade #" + (i+1) + " is " + grades[i]);
            sum += grades[i];
        }

        double grad1 = (grades[0]+grades[1])/2.0;
        System.out.println("Grading Period 1 " + grad1);
        double grad2 = (grades[2]+grades[3])/2.0;
        System.out.println("Grading Period 2 " + grad2);
        double grad3 = grades[4];
        System.out.println("Grading Period 3 " + grad3);


        double finalAvg = sum/5.0;
        System.out.println("the final average is " + finalAvg);

    }
}
