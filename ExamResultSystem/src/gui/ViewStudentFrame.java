package gui;

import javax.swing.*;
import java.sql.*;
import dao.StudentDAO;

public class ViewStudentFrame extends JFrame {

    JTextArea area;

    public ViewStudentFrame() {

        setTitle("View Students");
        setSize(500, 400);

        area = new JTextArea();

        add(new JScrollPane(area));

        try {

            ResultSet rs = StudentDAO.getAllStudents();

            while (rs.next()) {

                area.append(
                        rs.getInt("roll") + " | " +
                        rs.getString("name") + " | " +
                        rs.getDouble("percentage") + "% | " +
                        rs.getString("grade") + " | " +
                        rs.getString("status") + "\n"
                );
            }

        } catch (Exception e) {
            e.printStackTrace();
        }

        setVisible(true);
    }
}