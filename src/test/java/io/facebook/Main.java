package io.facebook;

import core.DataBase;
import core.Users;

import javax.jws.soap.SOAPBinding;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DataBase dataBase = new DataBase();
        Users users = new Users();

     /*   try {
            ResultSet query =  dataBase.getStatement().executeQuery("select * from facebookusers");
            query.next();
            int id = query.getInt(1);
            String login  = query.getString(2);
            String password = query.getString(3);

            System.out.println(id + login + password);
            System.out.println(query.getClass().getName());
        } catch (SQLException e) {
            e.printStackTrace();
        }*/

       System.out.println(dataBase.getListLoginAndPassword(users));
       System.out.println(users.print());

    }



}
