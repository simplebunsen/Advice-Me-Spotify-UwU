package advisor;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        boolean running = true;
        while (running) {
            String input = scanner.nextLine();
            switch (input) {
                case "featured":
                    outputFeatured();
                    break;
                case "new":
                    outputNew();
                    break;
                case "categories":
                    outputCategories();
                    break;
                case "exit":
                    running = false;
                    System.out.println("---GOODBYE!---");
                    break;
                default:
                    if (input.matches("playlists.*")) {
                        outputPlaylists();
                    }
            }
        }
    }

    private static void outputPlaylists() {
        System.out.println("---MOOD PLAYLISTS---\n" +
                "Walk Like A Badass  \n" +
                "Rage Beats  \n" +
                "Arab Mood Booster  \n" +
                "Sunday Stroll");
    }

    private static void outputCategories() {
        System.out.println("---CATEGORIES---\n" +
                "Top Lists\n" +
                "Pop\n" +
                "Mood\n" +
                "Latin");
    }

    private static void outputNew() {
        System.out.println("---NEW RELEASES---\n" +
                "Mountains [Sia, Diplo, Labrinth]\n" +
                "Runaway [Lil Peep]\n" +
                "The Greatest Show [Panic! At The Disco]\n" +
                "All Out Life [Slipknot]");
    }

    private static void outputFeatured() {
        System.out.println("---FEATURED---\n" +
                "Mellow Morning\n" +
                "Wake Up and Smell the Coffee\n" +
                "Monday Motivation\n" +
                "Songs to Sing in the Shower");
    }
}
