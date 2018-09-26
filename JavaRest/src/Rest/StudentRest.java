package Rest;


import com.sun.media.jfxmediaimpl.MediaDisposer;

import javax.ws.rs.*;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import java.util.ArrayList;
import java.util.List;

@Path("/student")
public class StudentRest {


    @GET
    @Path("/all")
    @Produces(MediaType.APPLICATION_JSON)
    public List<Student>getAllStudents(){
        StudentDaoService studentDaoService = new StudentDaoService();
        List<Student> students = studentDaoService.getStudents();
        return students;
    }
    @GET
    @Path("/{id}")
    @Produces(MediaType.APPLICATION_JSON)

    public Student returnStudent (@PathParam("id")int id){
        StudentDaoService sds= new StudentDaoService();
Student student = sds.getStudent(id);
return student;
    }
    @POST
    @Path("/save")
    @Consumes(MediaType.APPLICATION_JSON)
    public Response saveStudent(Student student){
        StudentDaoService studentDaoService = new StudentDaoService();
        studentDaoService.createStudent(student);
        return Response.status(Response.Status.CREATED).build();
    }

}
