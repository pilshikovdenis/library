package com.pilschikov;

public class Main {

    public static void main(String[] args) {
	// write your code here

        Library library = new Library("Библиотека имени Ломоносова");

        library.addNewUser("Morris", "Anderson", 21);
        library.addNewUser("Nick", "Henderson", 32);
        library.addNewUser("Scorpin", "Penny", 22);

        Utilities.printLibraryReport(library);
    }
}
