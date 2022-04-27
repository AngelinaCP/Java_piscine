package edu.school21.chat.models;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.List;

public class Main {
    static final String DB_URL = "jdbc:postgresql://localhost:5432/postgres";
    static final String USER = "postgres";
    static final String PASS = "Coldplay";

    public static void main(String[] args){

        Connection connection = getConnection();
        readQueryFiles(connection);

    }

    public static void readQueryFiles(Connection connection) {

        Statement statement = null;

        try {
            statement = connection.createStatement();
        } catch (SQLException e){
            e.printStackTrace();
        }

        List<String> Schema = null;
        List<String> Data = null;

        try {
            Schema = Files.readAllLines((Paths.get("/Users/angelinabannikova/IdeaProjects/java_picine/src/Day05/ex00/Chat/main/resources/schema.sql")));
            Data = Files.readAllLines((Paths.get("/Users/angelinabannikova/IdeaProjects/java_picine/src/Day05/ex00/Chat/main/resources/data.sql")));
        } catch (IOException e) {
            e.printStackTrace();
            System.exit(-1);
        }

        if (Schema == null || Data == null) {
            System.err.println("Files are empty");
        }
        executeQuery(Schema, Data, statement);

    }

    public static void executeQuery(List<String> Schema, List<String> Data, Statement statement) {

        for (String temp : Schema) {
            try {
                statement.execute(temp);
            } catch(SQLException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }

        for (String temp : Data) {
            try {
                statement.execute(temp);
            } catch(SQLException e) {
                e.printStackTrace();
                System.exit(-1);
            }
        }
    }

    public static Connection getConnection() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection(DB_URL, USER, PASS);

            if (connection != null) {
                System.out.println("Connected to the database!");
            } else {
                System.out.println("Failed to make connection!");
            }

        } catch (SQLException e) {
            System.err.format("SQL State: %s\n%s", e.getSQLState(), e.getMessage());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return connection;
    }
}
