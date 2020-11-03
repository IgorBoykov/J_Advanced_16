package Task;

import java.util.ArrayList;
import java.util.List;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class StudentDAO implements StudentCRUD<Student>{

private List<Student> students = new ArrayList<>();
    

public StudentDAO() {
    	students.add(new Student(1, "Jack", 30));
    	students.add(new Student(2, "Jim", 40));
    }
    
@Bean(name = "student")
	@Override
	public List<Student> getAll() {	
	System.out.println(students);
		return students;
	}

}
