import javax.swing.*;
import java.sql.*;
import java.util.ArrayList;
import java.util.Scanner;

public class Links {
    String body;
    String alternative1;
    int target1;
    String alternative2;
    int target2;
    int currentRoom;


    public Links() {
        currentRoom = 1;
        Scanner tgb = new Scanner(System.in);

        String strSelect = "select body from story where id = " + currentRoom;

        ResultSet rset = null;
        try {
            rset = DBlogin.getStmt().executeQuery(strSelect);

        // Loop through the result set and print
        while (rset.next()) {
            body = rset.getString("body");
        }
        } catch (SQLException e) {
            e.printStackTrace();
        }

        strSelect = "select description, target_Id from links where story_Id = " + currentRoom;

        try {
            rset = DBlogin.getStmt().executeQuery(strSelect);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // First description
        try {
            if (rset.next()){
                alternative1 = rset.getString("description");
                target1 = rset.getInt("target_Id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
        // Second description
        try {
            if (rset.next()){
                alternative2 = rset.getString("description");
                target2 = rset.getInt("target_Id");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

 }


