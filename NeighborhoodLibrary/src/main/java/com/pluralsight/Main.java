package com.pluralsight;

import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
           boolean ck = true;

        Book[] books = new Book[20];
        for (int i = 0; i < books.length; i++){
            if(ck){
                ck =false;
            } else if (!ck) {
                ck = true;
            }
            books[i] = new Book(i + 1, "123984198 - " + (i +1), "Book" + (i + 1), ck, "");
        }

        boolean run = true;
        while(run){

            System.out.println("--------------------\n1. Show Aviable");
            System.out.println("2. Show checked Out");
            System.out.println("3. Exit");
            System.out.print("Your choice: ");
            int choise = sc.nextInt();
            sc.nextLine();
            if (choise == 1){
                System.out.println("Aviable books: ");
                for (int i = 0; i < books.length; i++){
                    if (books[i].getIsCheckedOut()){
                        System.out.println(books[i].userOutput());
                    }
                }
                System.out.println("Do you want to search book?\n1. Yes\n2. No");
                int input = sc.nextInt();
                sc.nextLine();
                boolean run2 = true;
                 while (run2) {
                     if (input == 1) {
                         System.out.print("Enter book name: ");
                         String bookName = sc.nextLine();
                         for (int i = 0; i < books.length; i++) {
                             if (books[i].getTitle().equals(bookName)) {
                                 System.out.println(books[i].userOutput());
                                 break;
                             }
                         }
                         run2 = false;
                     }
                     else if (input == 2) {
                         run2 = false;
                     }
                     else {
                         System.out.println("Wrong option!");
                         run2 = false;
                     }
                 }

            }
            else if(choise == 2){
                System.out.println("Checked out books:");
                for (int i = 0; i < books.length; i++){
                    if(!books[i].getIsCheckedOut()){
                        System.out.println(books[i].userOutput());
                    }
                }
                System.out.println("Choose an option:\nC - Check in a book\nX - Return to home screen");
                char option = sc.nextLine().trim().toUpperCase().charAt(0);
                boolean run3 = true;
                while (run3) {
                    if (option == 'C') {
                        System.out.print("Enter book ID to check in: ");
                        int bookId = sc.nextInt();
                        sc.nextLine();
                        for (int i = 0; i < books.length; i++) {
                            if (books[i].getId() == bookId/* && books[i].getIsCheckedOut()*/) {
                                System.out.println(books[i].userOutput());
                                break;
                            }
                        }
                        run3 = false;
                    } else if (option == 'X') {
                        run3 = false;
                    } else {
                        System.out.println("Wrong option!");
                        run3 = false;
                    }
                }
            }
            else if (choise == 3) {
                run = false;
            }
            else {
                System.out.println("Wrong choise!");
            }
        }

    }
}
