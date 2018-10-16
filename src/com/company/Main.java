package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        ArrayList<Book> allBooks = new ArrayList<>();
        ArrayList<Author> allAuthors = new ArrayList<>();


        //created authour
     /*   Author aAuthor = new Author("Stephne", "King", "setephn@gmail.com", "613123");
        allAuthors.add(aAuthor);


        aAuthor = new Author("Jeff", "Kinney", "jeff@gmail.com", "571223");
        allAuthors.add(aAuthor);*/

      /*  //created books
        Book abook = new Book("OverComer", "1245");
        allBooks.add(abook);

        abook = new Book("Fear", "1245");
        allBooks.add(abook);
*/

        //Author author = findAuthorByName("Stephne", allAuthors);
        // System.out.println(author);

        int menu = 0;


        Scanner input = new Scanner(System.in);
        String choice;
        String look;
        Author author = new Author();
        do {
            System.out.println("1.Create a book\n2.Create an author\n3.List of Books\n4.List of Authors\n5.Quit");
            menu = input.nextInt();
            input.nextLine();
            switch (menu) {
                case 1:

                    System.out.println("Create a new Book");
                    String title, isbn;
                    String search = "";
                    System.out.println("Enter Tile");
                    title = input.nextLine();
                    System.out.println("Enter ISBN");
                    isbn = input.nextLine();
                    System.out.println("Do you want to assign an author? yes or no");
                    String option = input.nextLine();
                    if(option.equalsIgnoreCase("yes")) {
                        System.out.println("Search for Author By name");
                        System.out.println("Enter first name:");
                        search = input.nextLine();
                        author = findAuthorByName(search, allAuthors);
                    }
                        Book book1 = new Book(title, isbn, author);
                        allBooks.add(book1);

                    break;
                case 2:
                    String yes;

                    System.out.println("Create new Author");
                    String firstName, lastName, emailAddress, phoneNumber;
                    System.out.println("Enter First name:");
                    firstName = input.nextLine();
                    System.out.println("Enter Last name:");
                    lastName = input.nextLine();
                    System.out.println("Enter Email:");
                    emailAddress = input.nextLine();
                    System.out.println("Enter phone number:");
                    phoneNumber = input.nextLine();
                    // System.out.println("Add book");
                    do {
                        System.out.println("Add book");
                        Book book = new Book();
                        System.out.println("Enter title of the book");
                        String bookTitle = input.nextLine();
                        System.out.println("Enter ISBN");
                        String isbnNumber = input.nextLine();
                        book.setTitle(bookTitle);
                        book.setIsbn(isbnNumber);
                        allBooks.add(book);

                        author.addBooks(book);
                        System.out.println("Do you want to add more book?");
                        yes = input.nextLine();
                    } while (yes.equalsIgnoreCase("yes"));

                    author = new Author(firstName, lastName, emailAddress, phoneNumber, allBooks);
                    allAuthors.add(author);


                    break;
                case 3:
                    System.out.println("List of Books");
                    for (Book bookList : allBooks) {
                        System.out.println("Title:" + bookList.getTitle() + "\nISBN: " + bookList.getIsbn() + "\nAuthor: " + bookList.getAuthor() + "\n");
                    }
                    break;
                case 4:
                    System.out.println("List of Authors");
                    for (Author eachAuthor : allAuthors) {
                        System.out.println("FirstName: " + eachAuthor.getFirstName()
                                + "\nLastName: " + eachAuthor.getLastName() + "\nEmailAddress: " + eachAuthor.getEmailAddress()
                                + "\nPhoneNumber: " + eachAuthor.getPhoneNumber() + "\nList of books:\n");
                        for (Book listOfBooks : eachAuthor.getAbook()) {
                            System.out.println("Title:" + listOfBooks.getTitle() + "\nISBN: " + listOfBooks.getIsbn());
                        }

                    }
                    break;
                case 5:
                    System.out.println("Quit");
                    break;

                default:
                    System.out.println("Invalid Choice");
                    break;

            }
        } while (menu != 5);


    }

    public static Author findAuthorByName(String firstName, ArrayList<Author> searchHere) {

        Author foundAuthor = null;
        for (Author eachAuthor : searchHere) {
            if (firstName.equalsIgnoreCase(eachAuthor.getFirstName())) {
                foundAuthor = eachAuthor;
            }
        }
        return foundAuthor;
    }
}
