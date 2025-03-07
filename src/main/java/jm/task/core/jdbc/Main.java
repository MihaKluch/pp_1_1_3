package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

public class Main {
    public static void main(String[] args) {
        UserService userService = new UserServiceImpl(new UserDaoJDBCImpl());

        userService.createUsersTable();

        userService.saveUser("Михаил", "Ключенок", (byte) 43);
        userService.saveUser("Мария", "Осипович", (byte) 39);
        userService.saveUser("Ульяна", "Жуликовна", (byte) 12);
        userService.saveUser("Дарья", "Романова", (byte) 19);

        System.out.println(userService.getAllUsers());
        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
