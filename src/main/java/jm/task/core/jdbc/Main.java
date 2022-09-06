package jm.task.core.jdbc;

import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;


public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();

        userService.createUsersTable();

        String name = "Garik";
        String lastname = "Martirosyan";
        byte age = (byte) 48;
        userService.saveUser(name, lastname, age);
        System.out.format("User с именем %s добавлен в базу данных.\n", name);

        name = "Sergey";
        lastname = "Svetlakov";
        age = (byte) 44;
        userService.saveUser(name, lastname, age);
        System.out.format("User с именем %s добавлен в базу данных.\n", name);

        name = "Ivan";
        lastname = "Urgant";
        age = (byte) 44;
        userService.saveUser(name, lastname, age);
        System.out.format("User с именем %s добавлен в базу данных.\n", name);

        name = "Alexander";
        lastname = "Cekalo";
        age = (byte) 61;
        userService.saveUser(name, lastname, age);
        System.out.format("User с именем %s добавлен в базу данных.\n", name);

        userService.getAllUsers();


        userService.cleanUsersTable();

        userService.dropUsersTable();

    }
}
