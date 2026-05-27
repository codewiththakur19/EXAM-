package gui;

import javax.swing.*;
import dao.StudentDAO;
import model.Student;

public class AddStudentFrame extends JFrame {

    JTextField roll, name, m1, m2, m3;

    public AddStudentFrame() {

        setTitle("Add Student");
        setSize(350, 400);
        setLayout(null);

        roll = new JTextField();
        name = new JTextField();
        m1 = new JTextField();
        m2 = new JTextField();
        m3 = new JTextField();

        JButton save = new JButton("Save");

        roll.setBounds(80, 30, 180, 30);
        name.setBounds(80, 80, 180, 30);
        m1.setBounds(80, 130, 180, 30);
        m2.setBounds(80, 180, 180, 30);
        m3.setBounds(80, 230, 180, 30);
        save.setBounds(110, 290, 100, 35);

        add(roll);
        add(name);
        add(m1);
        add(m2);
        add(m3);
        add(save);

        save.addActionListener(e -> {

            Student s = new Student(
                    Integer.parseInt(roll.getText()),
                    name.getText(),
                    Integer.parseInt(m1.getText()),
                    Integer.parseInt(m2.getText()),
                    Integer.parseInt(m3.getText())
            );

            StudentDAO.addStudent(s);

            JOptionPane.showMessageDialog(this, "Student Saved Successfully");
        });

        setVisible(true);
    }
}