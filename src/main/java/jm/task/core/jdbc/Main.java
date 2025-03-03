package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.util.Util;

import java.sql.Connection;

public class Main {
    public static void main(String[] args) {
//        Util.getConnection();
        UserDao userDao = new UserDaoJDBCImpl();

        userDao.createUsersTable();

        userDao.saveUser("Михаил", "Ключенок", (byte) 43);
        userDao.saveUser("Мария", "Осипович", (byte) 39);
        userDao.saveUser("Ульяна", "Жуликовна", (byte) 12);
        userDao.saveUser("Дарья", "Романова", (byte) 19);


        System.out.println(userDao.getAllUsers());
        userDao.removeUserById(1);
        userDao.getAllUsers();
        userDao.cleanUsersTable();
        userDao.dropUsersTable();
//            try (Connection connection = Util.getConnection()) {
//                System.out.println("Соединение установлено!");
//            } catch (Exception e) {
//                System.out.println("Ошибка: " + e.getMessage());
//            }
    }
}
