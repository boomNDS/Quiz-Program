package Final;/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


/**
 *
 * @author cyk
 */
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class MySql {

    public static Connection getCon() {
        Connection connection = null;
        try {
            connection = DriverManager.getConnection("jdbc:mysql://sql12.freemysqlhosting.net/sql12270413", "sql12270413", "hm1PBVUTKg");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return connection;
    }

    /**
     *
     * @param id
     * @param score
     */
    public  void updateScore(int id, int score){

        try {
            String sqlCmd = "UPDATE info SET `score` = " +score + " WHERE id_student = " + id;
            PreparedStatement statement = getCon().prepareStatement(sqlCmd);
            statement.executeUpdate();
            System.out.println("succes");
        } catch (SQLException ex) {
            Logger.getLogger(MySql.class.getName()).log(Level.SEVERE, null, ex);
        }
    }



}
