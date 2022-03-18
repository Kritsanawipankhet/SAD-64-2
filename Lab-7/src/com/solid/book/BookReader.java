package com.solid.book;


import java.util.List;

public class BookReader implements IReader{
    public static void main(String[] args) {

        BookReader bookReader = new BookReader();
        bookReader.printToScreen();
    }

    @Override
    public void printToScreen() {
        Book book = new Book("Tyland", List.of("I", "moved", "here", "recently", "too"));
        do {
            System.out.println(book.getCurrentPage());
        } while (book.turnToNextPage());
    }
}
