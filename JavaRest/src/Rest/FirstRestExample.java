package Rest;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import java.util.ArrayList;
import java.util.List;

@Path("/example")
public class FirstRestExample {
    @GET
    @Path("/sayHi/{name}")
    public String sayHi(@PathParam("name") String username) {
        return "Labas " + username;
    }


    @GET
    @Path("/getStudent")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudent () {
        return new Student(1, "Andrius", "Baltrunas", "asa@jsjs.lt", " +54555555"
        );
    }
    @GET
    @Path("/getStudents")
    @Produces(MediaType.APPLICATION_JSON)
    public List <Student> getStudents(){
List<Student> students = new ArrayList<>();
students.add(new Student(2, "Paulius", "Pauli", "dhksadka", "+68584985"));
        students.add(new Student(3, "Jonas", "Jonaitis", "dhksadka@shah.lt", "+68588985"));
        students.add(new Student(4, "Petras", "Pauli", "dhksadkas@kk.com", "+6858104985"));
        return students;

    }
    @GET
    @Path("/student/{id}")
    @Produces(MediaType.APPLICATION_JSON)
    public Student getStudentById(@PathParam("id")int id) {
        List<Student> students = getStudents();
        return students.stream().filter(s -> s.getId() == id).findFirst(). get();

    }
    @POST
    @Path("/saveStudent")
    @Produces (MediaType.APPLICATION_JSON)
    @Consumes (MediaType.APPLICATION_JSON)
    public Student saveStudent (Student student){
         student.setId(4);
         student.setName(student.getName() + "changed");
        student.setLastName(student.getLastName() + "changed");
        student.setEmail(student.getEmail() + "changed");
        student.setPhone(student.getPhone() + "changed");
        return student;

    }






}
