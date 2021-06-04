package java8.streams;

public class Student implements Comparable<Student> {
@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((age == null) ? 0 : age.hashCode());
		result = prime * result + ((id == null) ? 0 : id.hashCode());
		result = prime * result + ((name == null) ? 0 : name.hashCode());
		result = prime * result + ((qual == null) ? 0 : qual.hashCode());
		result = prime * result + ((sal == null) ? 0 : sal.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Student other = (Student) obj;
		if (age == null) {
			if (other.age != null)
				return false;
		} else if (!age.equals(other.age))
			return false;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		if (name == null) {
			if (other.name != null)
				return false;
		} else if (!name.equals(other.name))
			return false;
		if (qual == null) {
			if (other.qual != null)
				return false;
		} else if (!qual.equals(other.qual))
			return false;
		if (sal == null) {
			if (other.sal != null)
				return false;
		} else if (!sal.equals(other.sal))
			return false;
		return true;
	}

private Integer id,sal,age;
private String name,qual;

public Student(Integer id, Integer sal, Integer age, String name, String qual) {
	super();
	this.id = id;
	this.sal = sal;
	this.age = age;
	this.name = name;
	this.qual = qual;
}

@Override
public String toString() {
	return "Student id=" + id + ", sal=" + sal + ", age=" + age + ", name=" + name + ", qual=" + qual ;
}

public Integer getId() {
	return id;
}

public Integer getSal() {
	return sal;
}

public Integer getAge() {
	return age;
}

public String getName() {
	return name;
}

public String getQual() {
	return qual;
}

@Override
public int compareTo(Student o) {
	// TODO Auto-generated method stub
	return id.compareTo(o.id);
}

}
