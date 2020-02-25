package io.facebook;

import core.DataBase;
import core.Users;

import javax.jws.soap.SOAPBinding;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws ClassNotFoundException, SQLException {
        DataBase dataBase = new DataBase();

       /* List<Users> users = new ArrayList<Users>();*/
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
        for (Users temp:dataBase.getListLoginAndPassword()){
            System.out.println(temp.print());
        }






    }



}
