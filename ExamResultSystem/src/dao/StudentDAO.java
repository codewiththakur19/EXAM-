package dao;

import java.sql.*;
import model.Student;
import util.GradeUtil;

public class StudentDAO {

    public static void addStudent(Student s) {

        try {
            Connection con = DBConnection.getConnection();

            int total = s.getM1() + s.getM2() + s.getM3();
            double per = total / 3.0;

            String grade = GradeUtil.grade(per);
            String status = GradeUtil.status(per);

            String query = "INSERT INTO students VALUES (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            PreparedStatement ps = con.prepareStatement(query);

            ps.setInt(1, s.getRoll());
            ps.setString(2, s.getName());
            ps.setInt(3, s.getM1());
            ps.setInt(4, s.getM2());
            ps.setInt(5, s.getM3());
            ps.setInt(6, total);
            ps.setDouble(7, per);
            ps.setString(8, grade);
            ps.setString(9, status);

            ps.executeUpdate();

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static ResultSet getAllStudents() {

        try {
            Connection con = DBConnection.getConnection();
            return con.createStatement().executeQuery("SELECT * FROM students");

        } catch (Exception e) {
            e.printStackTrace();
            return null;
        }
    }
}