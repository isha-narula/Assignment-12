import java.util.Comparator;
import java.util.ArrayList;
import java.util.Collections;

public class Student implements Comparable<Student>{
        int id;
	    String name;
	    int age;

	    public int compareTo(Student s1) {
	        int nameCompare = this.name.compareTo(s1.name == null ? "" : s1.name);
	        if(nameCompare == 0) return Integer.compare(this.age, s1.age);
	        return nameCompare;
	   }

	    
	    public Student(String name,int id,int age) {
	        this.name="";
	        this.id=0;
	        this.age=0;
	    }
	    public int getroll() {
	        return id;
	    }
	    public void setroll(int id) {
	        this.id = id;
	    }
	    public String getName() {
	        return name;
	    }
	    public void setName(String name) {
	        this.name = name;
	    }
	    public int getAge() {
	        return age;
	    }
	    public void setAge(int age) {
	        this.age = age;
	    }

public static void main(String args[]){
	        ArrayList<Student> list=new ArrayList<Student>();
	        Student s1= new Student(null, 0, 0);
	        s1.setName("John");
	        s1.setAge(50);
	        Student s2=new Student(null, 0, 0);
	        s2.setName("Russell");
	        s2.setAge(16);
	        Student s3=new Student(null, 0, 0);
	        s3.setName("Langdon");
	        s3.setAge(30);
	        list.add(s1);
	        list.add(s2);
	        list.add(s3);
	        Collections.sort(list);

	        for(Student a:list){
	            System.out.println(a.getName()+""+a.getAge());
	        }
	    }
	}
