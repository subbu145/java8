package Collectionsclass;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class CollectionsClassMeth {
	
  public static void main(String[] args) {
	  
	List<Student> list=new ArrayList<Student>();
	
	Student s1=new Student(1, 10000, 24, "yella", "btech");	
	Student s4=new Student(13, 131000, 24, "sri", "btech");	
	Student s8=new Student(17, 17000, 24, "ram", "btech");	
	Student s2=new Student(11, 11000, 24, "sai", "mtech");	
	Student s3=new Student(12, 12000, 24, "subbu", "btech");	
	Student s9=new Student(18, 17000, 24, "yella", "btech");	
	Student s18=new Student(18, 18000, 24, "yella", "btech");	
	Student s7=new Student(16, 16000, 24, "yella", "btech");	
	Student s11=new Student(11, 11000, 24, "sai", "mtech");	
	Student s12=new Student(12, 12000, 24, "subbu", "btech");	

	 Collections.addAll(list,s1,s2,s3,s4,s7,s8,s9,s11,s12,s18);
  // filtering using collections
     for (Iterator iterator = list.iterator(); iterator.hasNext();) {
	Student student = (Student) iterator.next();
	if(student.getSal()>13000) {
	System.out.println(student);
	}
}

      System.out.println("================collections methods=================");
      list=Collections.synchronizedList(list);
      System.out.println("======for immutable if u try throws  (java.lang.UnsupportedOperationException)=======");
      list=Collections.unmodifiableList(list);
      //list.add(s1);
      //list.remove(1);
      System.out.println(list);
      System.out.println("======to remove the data=======");
      list=Collections.emptyList();
      System.out.println(list);
      System.out.println("======to remove the data=======");
       
	
	  Collections.sort(list,Collections.reverseOrder()); 
	  Collections.sort(list); 
	   Collections.binarySearch(list, s1);
	
	 System.out.println("=====swap data=====");
	 Collections.swap(list, 1, 2);
	 System.out.println("=====checked list=====");
	Collections.checkedCollection(list, Student.class);
	List<Student> list1=new ArrayList<>();
	Collections.addAll(list1, s1,s2,s3,s4,s7,s1,s2,s3,s4,s7,s1,s2,s3,s4,s7);
	//the list1 is greater then list 
	Collections.copy(list1, list);
	System.out.println(list1);
	System.out.println("========Disjoint Collection========");
	// if there is no data common in two lists its return false
	System.out.println(Collections.disjoint(list1, list));
	 System.out.println("=====singleton=====");
   Collections.singletonList(list);
  System.out.println(list.add(s12));
  System.out.println(list);
  System.out.println("=====rotate data=====");
  Collections.rotate(list,list.size());
  System.out.println(list);
  
  System.out.println("=====reverse  data=====");
  System.out.println(list1);
  Collections.reverse(list1);
  System.out.println(list1);
  System.out.println("=====replace old value into new value=====");
  Collections.replaceAll(list,s1,s3);
  Collections.replaceAll(list, s3, new Student(55, 55555, 222, "replace", "succ"));
  System.out.println(list);
  System.out.println("=====min value=====");
  Student  min=Collections.min(list);
  System.out.println(min);
  System.out.println("=====max value=====");
  Student  max=Collections.max(list);
  System.out.println(max);
  System.out.println("============fill the new value into list=====================");
  System.out.println(list);
  Collections.fill(list,s1);
  System.out.println(list);
  }
}
