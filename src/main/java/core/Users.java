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

    public Users(String string) {

    }

    public Users() {

    }

    public Users(int anInt) {

    }


    public String print()
    {
        return this.id + " " + this.login + " " + this.password;
    }




}
