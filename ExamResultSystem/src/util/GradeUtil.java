package util;

public class GradeUtil {

    public static String grade(double p) {
        if (p >= 90) return "A+";
        else if (p >= 75) return "A";
        else if (p >= 60) return "B";
        else if (p >= 50) return "C";
        else return "F";
    }

    public static String status(double p) {
        return (p >= 40) ? "PASS" : "FAIL";
    }
}