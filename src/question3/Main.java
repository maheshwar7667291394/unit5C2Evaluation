package question3;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Main {
	public static void main(String[] args) {
		List<Student> student=new ArrayList<>();
	  student.add(new Student(12,390,"mahesh"));
	  student.add(new Student(23,200,"santosh"));
	  student.add(new Student(34,340,"ramkuamr"));
	  student.add(new Student(45,100,"dinesh"));
	  
	  Collections.sort(student,(s1,s2)->s1.getMarks()>s2.getMarks()? +1:-1);

	  student
	  .stream()
	  .filter(item->item.getMarks()<250)
	  .forEach(item->{
		  System.out.println(item);
	  });
	}

}
