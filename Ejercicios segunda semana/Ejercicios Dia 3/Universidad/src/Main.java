import java.sql.*;

public class Main {
    public static void main(String[] args) throws SQLException {
        //Establecer conexión con la BD

        String url = "jdbc:mysql://localhost:3307/universidad1";
        Connection connection = DriverManager.getConnection(url, "root", "");

        //Agregar valores a la BD

        String insertSql = "INSERT INTO estudiantes (nombre, edad, calificacion) VALUES (?, ?, ?)";
        //Declarar un Statement
        PreparedStatement statement = connection.prepareStatement(insertSql);
        //Setear los parametros del insert
        statement.setString(1, "Juan Perez");
        statement.setInt(2, 25);
        statement.setDouble(3,8.5);
        statement.execute();
        statement.setString(1, "Pablo Garcia");
        statement.setInt(2, 26);
        statement.setDouble(3,5.2);
        statement.execute();
        statement.setString(1,"Juana Gonzalez");
        statement.setInt(2,28);
        statement.setDouble(3,9.7);
        statement.execute();

        //Ejecutar la sentencia y agrega un registro en la tabla de la BD
        System.out.println("Se agregaron registros en la tabla: clientes!!!");

        //Mostrar por pantalla
        String selectSql = "Select * FROM estudiantes";
        ResultSet resultado = statement.executeQuery(selectSql);

        while (resultado.next()) {
            String nombre = resultado.getString("nombre");
            int id = resultado.getInt("id");
            double calificacion = resultado.getDouble("calificacion");
            System.out.println("ID: " +id +" Nombre: " + nombre + ", Calificación: " + calificacion);
        }

    }
}