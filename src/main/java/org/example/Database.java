package org.example;

import static java.lang.IO.*;
import java.sql.*;

public class Database {
    private Connection connection;

    public Database() {
        if(!Connect()) {
            println("Connessione non riuscita");
            System.exit(-1);
        }
        println("Connessione riuscita");
    }

    private boolean Connect() {
        try {
            connection = DriverManager.getConnection("jdbc:sqlite:database.db");
        } catch (SQLException e) {
            return false;
        }
        return true;
    }
}
