package core;

import lombok.Getter;

import javax.jws.soap.SOAPBinding;
import java.sql.*;
import java.sql.DriverManager;
import java.util.ArrayList;
import java.util.List;

@Getter
public class DataBase {
    private  Statement statement;
    private Connection connection;

    public DataBase() throws ClassNotFoundException {
        Class.forName("com.mysql.jdbc.Driver");

        try {
            this.connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/users", "root", "");
            this.statement = connection.createStatement();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public List<Users> getListLoginAndPassword() throws ClassNotFoundException, SQLException {
        DataBase dataBase = new DataBase();
        List<Users> data = new ArrayList<Users>();


        ResultSet query = dataBase.getStatement().executeQuery("select * from facebookusers");
        while (query.next()) {

            Users users = new Users();
            /*query.getInt(1);*/
            users.id = query.getInt(1);
            users.login = query.getString(2);
            users.password = query.getString(3);
            data.add(users);
        }


        return data;
    }


}
