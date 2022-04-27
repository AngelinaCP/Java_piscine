package edu.school21.chat.models;

import com.zaxxer.hikari.HikariDataSource;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {

//    private static HikariDataSource ds;
    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASS = "Coldplay";
    static final String PATH_SC = "/Users/angelinabannikova/IdeaProjects/java_picine/src/Day05/ex01/Chat/src/main/resources/schema.sql";
    static final String PATH_DB = "/Users/angelinabannikova/IdeaProjects/java_picine/src/Day05/ex01/Chat/src/main/resources/data.sql";

    public static void main(String[] args) {

        HikariDataSource dataSource = new HikariDataSource();
        Connection connection = null;
        dataSource.setJdbcUrl(DB_URL);
        dataSource.setUsername(USER);
        dataSource.setPassword(PASS);

        try {
            connection = dataSource.getConnection();

            if (connection == null){
                System.err.println("Failed to make connection to database");
            }

        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        Statement statement = null;

        try {
            statement = connection.createStatement();
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        List<String> allLineSchema = null;
        List<String> allLineData = null;

        try {
            allLineSchema = Files.readAllLines(Paths.get(PATH_SC));
            allLineData = Files.readAllLines(Paths.get(PATH_DB));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        if (allLineData  == null || allLineSchema == null){
            System.err.println("Empty file");
            System.exit(-1);
        }

        for (String line : allLineSchema) {

            try {
                statement.execute(line);
            } catch (SQLException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }

        for (String line : allLineData) {

            try {
                statement.execute(line);
            } catch (SQLException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }
    }


//    private DataSource() {}
//
//    public static Connection getConnection() throws SQLException {
//        return ds.getConnection();
//    }

}
