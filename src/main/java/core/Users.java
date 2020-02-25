package core;

import lombok.Getter;

import java.sql.Array;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;


public class Users {
    public int id;
    public String login;
    public String password;

/*
    public List<Users> getListLoginAndPassword() throws ClassNotFoundException, SQLException {
        DataBase dataBase = new DataBase();
        Users users = new Users();
        List<Users> data = new ArrayList<Users>();

        ResultSet query = dataBase.getStatement().executeQuery("select * from facebookusers");
        query.next();
        users.id = query.getInt(1);
        users.login  = query.getString(2);
        users.password = query.getString(3);
        data.add(users);

        return data;
    }

*/

    public String print()
    {
        return this.id + " " + this.login + " " + this.password;
    }




}
