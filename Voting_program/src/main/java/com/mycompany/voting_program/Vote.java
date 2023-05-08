/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.voting_program;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


/**
 *
 * @author user
 */
public class Vote {

    public static void main(String[] args) {
        Voting obj = new Voting();
        obj.main_();
    }
}

class Voting {

    List<String> chizzy_poll = new ArrayList<>();
    List<String> Alicia_poll = new ArrayList<>();
    List<String> Isaiah_poll = new ArrayList<>();
    List<String> Muiz_poll = new ArrayList<>();
    List<String> Amara_poll = new ArrayList<>();
    List<String> Emma_boostrap_poll = new ArrayList<>();
    List<String> Favour_poll = new ArrayList<>();
    List<String> Emma_poll = new ArrayList<>();
    List<String> Taiwo_poll = new ArrayList<>();
    List<String> Abraham_poll = new ArrayList<>();
    List<String> Olaolu_poll = new ArrayList<>();
    String select;
    String candidate_1;
    String candidate_2;
    String candidate_3;
    String candidate_4;
    String candidate_5;
    String candidate_6;
    String candidate_7;
    String candidate_8;
    String candidate_9;
    String candidate_10;
    String candidate_11;

    public void main_() {
        System.out.println("Candidates");
        String[] candidates = {"1. Chizzy", "2. Alicia", "3. Isaiah", "4. Muiz", "5. Amara", "6. Emma_boostrap", "7. Favour", "8. Emma", "9. Taiwo", "10. Abraham", "11. Olaolu", "12. vote result\n"};
        for (String i : candidates) {
            System.out.println(i);
        }
        Scanner scanner_obj1 = new Scanner(System.in);
        select = scanner_obj1.nextLine();
        vote();

    }

    public void vote() {
        switch (select) {
            case "1":
                System.out.println("Enter the candidate's name to vote\n");
                Scanner scanner_obj2 = new Scanner(System.in);
                candidate_1 = scanner_obj2.nextLine();
                chizzy_poll.add(candidate_1);
                System.out.println("\nyou have sucesfully casted your vote for chizzy\n");
                main_();
                break;

            case "2":
                System.out.println("Enter the candidate's name to vote\n");
                Scanner scanner_obj3 = new Scanner(System.in);
                candidate_2 = scanner_obj3.nextLine();
                Alicia_poll.add(candidate_2);
                System.out.println("\nyou have sucesfully casted your vote for Alicia\n");
                main_();
                break;

            case "3":
                System.out.println("Enter the candidate's name to vote\n");
                Scanner scanner_obj4 = new Scanner(System.in);
                candidate_3 = scanner_obj4.nextLine();
                Isaiah_poll.add(candidate_3);
                System.out.println("\nyou have sucesfully casted your vote for Isaiah\n");
                main_();
                break;

            case "4":
                System.out.println("Enter the candidate's name to vote\n");
                Scanner scanner_obj5 = new Scanner(System.in);
                candidate_4 = scanner_obj5.nextLine();
                Muiz_poll.add(candidate_4);
                System.out.println("\nyou have sucesfully casted your vote for Muiz\n");
                main_();
                break;

            case "5":
                System.out.println("Enter the candidate's name to vote\n");
                Scanner scanner_obj6 = new Scanner(System.in);
                candidate_5 = scanner_obj6.nextLine();
                Amara_poll.add(candidate_5);
                System.out.println("\nyou have sucesfully casted your vote for Amara\n");
                main_();
                break;

            case "6":
                System.out.println("Enter the candidate's name to vote\n");
                Scanner scanner_obj7 = new Scanner(System.in);
                candidate_6 = scanner_obj7.nextLine();
                Emma_boostrap_poll.add(candidate_6);
                System.out.println("\nyou have sucesfully casted your vote for Emma_boostrap\n");
                main_();
                break;

            case "7":
                System.out.println("Enter the candidate's name to vote\n");
                Scanner scanner_obj8 = new Scanner(System.in);
                candidate_7 = scanner_obj8.nextLine();
                Favour_poll.add(candidate_7);
                System.out.println("\nyou have sucesfully casted your vote for Favour\n");
                main_();
                break;

            case "8":
                System.out.println("Enter the candidate's name to vote\n");
                Scanner scanner_obj9 = new Scanner(System.in);
                candidate_8 = scanner_obj9.nextLine();
                Emma_poll.add(candidate_8);
                System.out.println("\nyou have sucesfully casted your vote for Emma\n");
                main_();
                break;
                
             case "9":
                System.out.println("Enter the candidate's name to vote\n");
                Scanner scanner_obj10 = new Scanner(System.in);
                candidate_9 = scanner_obj10.nextLine();
                Taiwo_poll.add(candidate_9);
                System.out.println("\nyou have sucesfully casted your vote for Taiwo\n");
                main_();
                break;
               
             case "10":
                System.out.println("Enter the candidate's name to vote\n");
                Scanner scanner_obj11 = new Scanner(System.in);
                candidate_10 = scanner_obj11.nextLine();
                Abraham_poll.add(candidate_10);
                System.out.println("\nyou have sucesfully casted your vote for Abraham\n");
                main_();
                break;
               
             case "11":
                System.out.println("Enter the candidate's name to vote\n");
                Scanner scanner_obj12 = new Scanner(System.in);
                candidate_11 = scanner_obj12.nextLine();
                Olaolu_poll.add(candidate_11);
                System.out.println("\nyou have sucesfully casted your vote for Olaolu\n");
                main_();
                break;

            case "12":
                display();
                break;

            default:
                System.out.println("please input");
                break;
        }
    }

    public void display() {
        System.out.println("Chizzy has " + chizzy_poll.size() + " votes");
        System.out.println("Alicia has " + Alicia_poll.size() + " votes");
        System.out.println("Isaiah has " + Isaiah_poll.size() + " votes");
        System.out.println("Muiz has " + Muiz_poll.size() + " votes");
        System.out.println("Amara has " + Amara_poll.size() + " votes");
        System.out.println("Emma_boostrap has " + Emma_boostrap_poll.size() + " votes");
        System.out.println("Favour has " + Favour_poll.size() + " votes");
        System.out.println("Emma has " + Emma_poll.size() + " votes");
        System.out.println("Taiwo has " + Taiwo_poll.size() + " votes");
        System.out.println("Abraham has " + Abraham_poll.size() + " votes");
        System.out.println("Olaolu has " + Olaolu_poll.size() + " votes");
    }

}
