package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class apaSeventh {
    public void a7RUN() {
        System.out.println("Apa7th initialized");
        Scanner myObj2 = new Scanner(System.in);
        System.out.println("Available types: (1) Book, (2) article, (3) webpage ");
        System.out.println("What type of source is this: ");
        String selectedType = myObj2.nextLine();

        if (selectedType.equals("1")) {
            // code for book varlist: authors(list of authors) publishing year(pubYear) title(title) subtitle(subtitle) edition(edition) publisher(publisher)
            // checks how many authors in source
            Scanner authorNumObj = new Scanner(System.in);
            System.out.println("How many authors are there: ");
            String authorNum = authorNumObj.nextLine();
            ArrayList<String> authors = new ArrayList<String>();
            int authorNumInt = Integer.parseInt(authorNum);

            // gets authornames for every author
            for (int i = 0; i < authorNumInt; i++) {
                Scanner authorNameObj = new Scanner(System.in);
                System.out.println("Enter name of author " + (i+1)+ ":");
                String authorName = authorNameObj.nextLine();
                authors.add(authorName);
            }

            // asks for publishing year
            Scanner pubYearObj = new Scanner(System.in);
            System.out.println("When was this book published: ");
            String pubYear = pubYearObj.nextLine();

            // asks for title
            Scanner titleObj = new Scanner(System.in);
            System.out.println("What is the title of the book: ");
            String title = titleObj.nextLine();

            // asks for subtitle
            Scanner subtitleObj = new Scanner(System.in);
            System.out.println("What is the subtitle of the book (if any): ");
            String subtitle = subtitleObj.nextLine();

            // asks for edition
            Scanner editionObj = new Scanner(System.in);
            System.out.println("What edition of the book is this (1 if not specified): ");
            String edition = editionObj.nextLine();

            // asks for publisher
            Scanner publisherObj = new Scanner(System.in);
            System.out.println("What is the name of this books publisher: ");
            String publisher = publisherObj.nextLine();



            String finishedString = new String();
            int countAuth = 0;

            for(String finName : authors) {

                String[] parts = finName.split(" ");
                String part1 = parts[0];
                String part2 = parts[1];
                String firstLetter = part1.substring(0, 1);
                finishedString = finishedString + part2 + " " + firstLetter + ".";
                countAuth++;

                //TODO fix & between next to last and last author, use , between all others
                if (authors.size() > 1 && authors.size() > countAuth) {
                    finishedString = finishedString + ", ";
                }
            }

            String authorString = finishedString;

            finishedString = finishedString + " (" + pubYear + "). " + title;

            if (!subtitle.equals("")) {
                finishedString = finishedString + ": " + subtitle;
            }

            finishedString = finishedString + " (" + edition + ". utg.). " + publisher + ".";

            System.out.println("Source in text: " + "("+ authorString + ", " + pubYear + ", PAGENUMBER)");
            System.out.println("Source in reference list: " + finishedString);
        }
        if (selectedType.equals("2")) {
            // code for article
            Scanner authorNumObj = new Scanner(System.in);
            System.out.println("How many authors are there: ");
            String authorNum = authorNumObj.nextLine();
            ArrayList<String> authors = new ArrayList<String>();
            int authorNumInt = Integer.parseInt(authorNum);

            // gets authornames for every author
            for (int i = 0; i < authorNumInt; i++) {
                Scanner authorNameObj = new Scanner(System.in);
                System.out.println("Enter name of author " + (i+1)+ ":");
                String authorName = authorNameObj.nextLine();
                authors.add(authorName);
            }

            // asks for publishing year
            Scanner pubYearObj = new Scanner(System.in);
            System.out.println("When was this article published (Year, day. month): ");
            String pubYear = pubYearObj.nextLine();

            // asks for title
            Scanner titleObj = new Scanner(System.in);
            System.out.println("What is the title of the article: ");
            String title = titleObj.nextLine();

            // asks for subtitle
            Scanner subtitleObj = new Scanner(System.in);
            System.out.println("What is the subtitle of the article (if any): ");
            String subtitle = subtitleObj.nextLine();

            // asks for papers name
            Scanner publisherObj = new Scanner(System.in);
            System.out.println("What is the name of this articles publisher: ");
            String publisher = publisherObj.nextLine();

            // asks for url
            Scanner urlObj = new Scanner(System.in);
            System.out.println("Paste link to article: ");
            String url = urlObj.nextLine();



            String finishedString = new String();
            int countAuth = 0;

            for(String finName : authors) {

                String[] parts = finName.split(" ");
                String part1 = parts[0];
                String part2 = parts[1];
                String firstLetter = part1.substring(0, 1);
                finishedString = finishedString + part2 + " " + firstLetter + ".";
                countAuth++;

                //TODO fix & between next to last and last author, use , between all others
                if (authors.size() > 1 && authors.size() > countAuth) {
                    finishedString = finishedString + ", ";
                }
            }

            finishedString = finishedString + " (" + pubYear + "). " + title;

            if (!subtitle.equals("")) {
                finishedString = finishedString + ": " + subtitle;
            }

            finishedString = finishedString + " " + publisher + ". " + url;

            System.out.println(finishedString);
        }
        if (selectedType.equals("3")) {
            // code for webpage
            String finishedString = new String();
            Scanner authorExists = new Scanner(System.in);
            System.out.println("Does the website have author(s) 1 if yes, 0 if no: ");
            String authorExists1 = authorExists.nextLine();

            if (authorExists1.equals("1")) {
                Scanner authorNumObj = new Scanner(System.in);
                System.out.println("How many authors are there: ");
                String authorNum = authorNumObj.nextLine();
                ArrayList<String> authors = new ArrayList<String>();
                int authorNumInt = Integer.parseInt(authorNum);

                // gets authornames for every author
                for (int i = 0; i < authorNumInt; i++) {
                    Scanner authorNameObj = new Scanner(System.in);
                    System.out.println("Enter name of author " + (i+1)+ ":");
                    String authorName = authorNameObj.nextLine();
                    authors.add(authorName);
                }
                int countAuth = 0;

                for(String finName : authors) {

                    String[] parts = finName.split(" ");
                    String part1 = parts[0];
                    String part2 = parts[1];
                    String firstLetter = part1.substring(0, 1);
                    finishedString = finishedString + part2 + " " + firstLetter + ".";
                    countAuth++;

                    //TODO fix & between next to last and last author, use , between all others
                    if (authors.size() > 1 && authors.size() > countAuth) {
                        finishedString = finishedString + ", ";
                    }
                }
            }
            else {
                Scanner orgNameObj = new Scanner(System.in);
                System.out.println("Enter the name of the websites organisation: ");
                String orgName = orgNameObj.nextLine();
                finishedString = finishedString + orgName + ".";
            }

            // asks for publishing year
            Scanner pubYearObj = new Scanner(System.in);
            System.out.println("When was this website published (Year, day. month: ");
            String pubYear = pubYearObj.nextLine();

            // asks for title
            Scanner titleObj = new Scanner(System.in);
            System.out.println("What is the title of the website: ");
            String title = titleObj.nextLine();

            // asks for subtitle
            Scanner subtitleObj = new Scanner(System.in);
            System.out.println("What is the subtitle of the website (if any): ");
            String subtitle = subtitleObj.nextLine();

            // asks for publisher
            Scanner publisherObj = new Scanner(System.in);
            System.out.println("What is the name of this books publisher: ");
            String publisher = publisherObj.nextLine();

            // asks for url
            Scanner urlObj = new Scanner(System.in);
            System.out.println("Paste the link to the website: ");
            String url = urlObj.nextLine();


            finishedString = finishedString + " (" + pubYear + "). " + title;

            if (!subtitle.equals("")) {
                finishedString = finishedString + ": " + subtitle;
            }

            finishedString = finishedString + ". " + publisher + ". " + url;

            System.out.println(finishedString);
        }
    }
}
