package mytest.bean;

import java.util.Collection;

public interface StudentDAO {
	
	Student get(Long id);

    Student save(Student stud);

    Collection<Student> find(String text);

}
