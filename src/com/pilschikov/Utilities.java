package com.pilschikov;

public  class Utilities {
    public static void  printLibraryReport(Library library) {
        System.out.println("Title of Library: " + library.getTitle());
        System.out.println("Count of users in this library: " + library.getCountOfPeople());

        if (library.getCountOfPeople() == 0) return;
        System.out.println("USERS LIST");

        for (User user : library.getUsersList()) {
            printUserInfo(user);
        }
    }

    public static void printUserInfo(User user) {
        System.out.printf("Name : %s\n" +
                "Surname: %s\n" +
                "Age: %d\n" +
                "Id: %d\n\n",
                user.getName(), user.getSurname(), user.getAge(), user.getId());
    }
}
