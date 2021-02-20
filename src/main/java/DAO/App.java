package DAO;

public class App {
    public static void main(String[] args) {
        Student_DAO dao = new Student_DAO();
        Student s =  dao.getStudentBy_ID(18043);
        System.out.println(s);
    }
}
