package com.company;

import javax.swing.*;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        
        Spill.Start();

    }
}



class Spill {


    public static void Start() {


        //  String spiller1 = JOptionPane.showInputDialog("Spiller1");
        int spiller1AntallSeier = 0;

        //   String spiller2 = JOptionPane.showInputDialog("Spiller2");
        int spiller2AntallSeier = 0;


        boolean spillKjører = true;

        Scanner scanner = new Scanner(System.in);

        JOptionPane.showMessageDialog(null, "First player to 5 wins!");

        while (spillKjører == true) {


            System.out.println("Player1 type rock, paper or scissors");

            String spiller1 = scanner.nextLine();

            System.out.println("Player2 type rock, paper or scissors");
            String spiller2 = scanner.nextLine();


            if (spiller1.equalsIgnoreCase("Rock") && spiller2.equalsIgnoreCase("Rock")) {
                System.out.println("Draw");
            } else if (spiller1.equalsIgnoreCase("Draw") && spiller2.equalsIgnoreCase("Draw")) {
                System.out.println("Draw");
            } else if (spiller1.equalsIgnoreCase("Draw") && spiller2.equalsIgnoreCase("Draw")) {
                System.out.println("Draw");
            }

            //De som er like (over)


            //Forskjellige kombinasjoner

            else if (spiller1.equalsIgnoreCase("Rock") && spiller2.equalsIgnoreCase("Scissors")) {
                System.out.println("Player1 wins");
                spiller1AntallSeier++;
                System.out.println("Score: " + spiller1AntallSeier);


            } else if (spiller1.equalsIgnoreCase("Saks") && spiller2.equalsIgnoreCase("Stein")) {
                System.out.println("Player2 wins");
                spiller2AntallSeier++;
                System.out.println("Score: " + spiller2AntallSeier);

            } else if (spiller1.equalsIgnoreCase("Stein") && spiller2.equalsIgnoreCase("Papir")) {
                System.out.println("Player2 wins");
                spiller2AntallSeier++;
                System.out.println("Score: " + spiller2AntallSeier);

            } else if (spiller1.equalsIgnoreCase("Papir") && spiller2.equalsIgnoreCase("Stein")) {
                System.out.println("Player1 wins");
                spiller1AntallSeier++;
                System.out.println("Score: " + spiller1AntallSeier);

            } else if (spiller1.equalsIgnoreCase("Saks") && spiller2.equalsIgnoreCase("Papir")) {
                System.out.println("Player1 wins");
                spiller1AntallSeier++;
                System.out.println("Score: " + spiller1AntallSeier);
            } else if (spiller1.equalsIgnoreCase("Papir") && spiller2.equalsIgnoreCase("Saks")) {
                System.out.println("Player2 wins");
                spiller2AntallSeier++;
                System.out.println("Score: " + spiller2AntallSeier);

            }


            //Når en av dem når 5 først
            if (spiller1AntallSeier == 5) {
                JOptionPane.showMessageDialog(null, "Player1 wins the game!");

                System.out.println("New game? (Yes/No)");
                String FortsettEllerAvsluttSpill = scanner.nextLine();

                if (FortsettEllerAvsluttSpill.equalsIgnoreCase("No")) {
                    spillKjører = false;
                } else {
                    spiller1AntallSeier=0;
                    spillKjører = true;

                }
            }

            if (spiller2AntallSeier == 5) {
                JOptionPane.showMessageDialog(null, "Player2 wins the game!");

                System.out.println("New game? (Yes/No)");

                String FortsettEllerAvsluttSpill = scanner.nextLine();

                if (FortsettEllerAvsluttSpill.equalsIgnoreCase("No")) {
                    spillKjører = false;}

                else {
                    spiller2AntallSeier=0;
                    spillKjører = true;
                }


            }

        }
            scanner.close();
        }


    }

