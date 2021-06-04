package Collectionsclass;

public class Student implements Comparable<Student> {
	private Integer id, sal, age;
	private String name, qual;

	@Override
	public String toString() {
		return "Student id=" + id + ", sal=" + sal + ", age=" + age + ", name=" + name + ", qual=" + qual+ "\n";
	}

	public Student(Integer id, Integer sal, Integer age, String name, String qual) {
		super();
		this.id = id;
		this.sal = sal;
		this.age = age;
		this.name = name;
		this.qual = qual;
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public Integer getSal() {
		return sal;
	}

	public void setSal(Integer sal) {
		this.sal = sal;
	}

	public Integer getAge() {
		return age;
	}

	public void setAge(Integer age) {
		this.age = age;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getQual() {
		return qual;
	}

	public void setQual(String qual) {
		this.qual = qual;
	}

	@Override
	public int compareTo(Student o) { // TODO Auto-generated method
		return this.id.compareTo(o.id);
	}

}
