package javaTestersL8;


import java.sql.*;

public class Wfrepository {
    private Statement statement;
    private PreparedStatement preparedStatement;

    public Wfrepository() throws ClassNotFoundException {
        Class.forName("org.sqlite.JDBC");
    }

    public void sendData(String city, String localDate, String weatherDescription, String temperature) throws SQLException{
        try (Connection connection = DriverManager.getConnection("jdbc:sqlite:mydb.db")){
            statement = connection.createStatement();
            statement.executeUpdate(
                    "CREATE TABLE IF NOT EXISTS weather_data " +
                            "(id INTEGER PRIMARY KEY AUTOINCREMENT," +
                            "city String," +
                            "localDate String," +
                            "weatherDescription String," +
                            "temperature String);"
            );
            preparedStatement = connection.prepareStatement(
                    "INSERT INTO weather_data" +
                            "(city, localDate, weatherDescription, temperature)" +
                            "VALUES (?,?,?,?)"
            );

            preparedStatement.setString(1, city);
            preparedStatement.setString(2, localDate);
            preparedStatement.setString(3, weatherDescription);
            preparedStatement.setString(4, temperature);
            preparedStatement.execute();
        }
    }

    public void readData() throws SQLException {
        try(Connection connection = DriverManager.getConnection("jdbc:sqlite:mydb.db")){
            statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("SELECT * FROM weather_data");
            while (resultSet.next()){
                Weather weather = new Weather(
                        resultSet.getString(2),
                        resultSet.getString(3),
                        resultSet.getString(4),
                        resultSet.getString(5)
                );

                System.out.println(weather);
            }
        }
    }

}
