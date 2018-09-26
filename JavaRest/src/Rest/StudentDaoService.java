package Rest;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class StudentDaoService {

    private Connection connection;


    StudentDaoService(){
      connection = DbConnection.createConnection();
      if (connection == null){
          throw new IllegalArgumentException("Ei, nera connection");
      }
    }
    protected List<Student>getStudents(){
List<Student> students = new ArrayList<>();
        try {
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select * from students");
            while (resultSet.next()){
                students.add(selectStudentData(resultSet));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
return students;

    }
    protected Student getStudent(int id) {
        Student student = null;
        try {
            PreparedStatement preparedStatement = connection.prepareStatement("select * from students where id = ?");
            preparedStatement.setInt(1, id);
            ResultSet resultSet = preparedStatement.executeQuery();
            resultSet.next();
            student = selectStudentData(resultSet);
        } catch (SQLException e) {
            e.printStackTrace();
        }
        return student;
    }


    private Student selectStudentData(ResultSet resultSet){
        Student student = null;
        try {
            int id = resultSet.getInt("id");
            String name =resultSet.getString("name");
            String Surname = resultSet.getString("Surname");
            String email = resultSet.getString("email");
            String phone = resultSet.getString("phone");
            student = new Student(id, name,Surname,email, phone);
        } catch (SQLException e) {
            e.printStackTrace();
        }

return student;
    }

    public void createStudent(Student student) {
        try {
            String sql = "insert into students(name,Surname, phone, email)values(?,?,?,?)";
            PreparedStatement preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, student.getName());
            preparedStatement.setString(2, student.getLastName());
            preparedStatement.setString(3, student.getEmail());
            preparedStatement.setString(4, student.getPhone());
            preparedStatement.execute();
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}
