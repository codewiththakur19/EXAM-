package gui;

import javax.swing.*;

public class Dashboard extends JFrame {

    public Dashboard() {

        setTitle("Dashboard");
        setSize(400, 300);
        setLayout(null);

        JButton addStudent = new JButton("Add Student");
        JButton viewStudent = new JButton("View Students");

        addStudent.setBounds(100, 60, 180, 40);
        viewStudent.setBounds(100, 130, 180, 40);

        add(addStudent);
        add(viewStudent);

        addStudent.addActionListener(e -> new AddStudentFrame());
        viewStudent.addActionListener(e -> new ViewStudentFrame());

        setVisible(true);
    }
}