package mytest.bean;

import java.io.Serializable;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

import org.hibernate.annotations.GenericGenerator;

@Entity
public class Student implements Serializable {

	private static final long serialVersionUID = 1L;
	
	private Long id;   
    private String name;   
    private Long age;
   
    public Student(){
        name = null;
    }
   
    public Student(String n, Long a){
        name = n;
        age = a;
    }
   
    public Student(Student s){
        name = s.getName();
    }  
   
    @Id
    @GeneratedValue(generator="increment")
    @GenericGenerator(name="increment", strategy = "increment")
    @Column(name="id")
    public Long getId() {
        return id;
    }
   
    @Column(name="name")
    public String getName(){
        return name;
    }
   
    @Column(name="age")
    public Long getAge(){
        return age;
    }
   
    public void setId(Long i){
        id = i;    
    }
   
    public void setName(String s){
        name = s;
    }  
   
    public void setAge(Long l){
        age = l;
    }

	@Override
	public String toString() {
		return "Student [id=" + id + ", name=" + name + ", age=" + age + "]";
	}   
    
    
    
}
