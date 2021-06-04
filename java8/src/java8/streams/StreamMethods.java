package java8.streams;

import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Set;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.stream.Collectors;

public class StreamMethods {
	public static void main(String[] args) {

		List<Student> list = new ArrayList<>();
		Set<Student> set = new HashSet<>();
		Set<Student> tset = new TreeSet<>();
		Map<Student, Integer> map = new HashMap<>();
		Map<Student, Integer> tmap = new TreeMap<>();
		Queue<Student> que = new PriorityQueue<>();

		Student s1 = new Student(1, 10000, 24, "yella", "btech");
		Student s4 = new Student(13, 131000, 24, "sri", "btech");
		Student s8 = new Student(17, 17000, 24, "ram", "btech");
		Student s2 = new Student(11, 11000, 24, "sai", "mtech");
		Student s3 = new Student(12, 12000, 24, "subbu", "btech");
		Student s9 = new Student(18, 17000, 24, "yella", "btech");
		Student s18 = new Student(18, 18000, 24, "yella", "btech");
		Student s7 = new Student(16, 16000, 24, "yella", "btech");
		Student s11 = new Student(11, 11000, 24, "sai", "mtech");
		Student s12 = new Student(12, 12000, 24, "subbu", "btech");

// list=Arrays.asList(s1,s2,s3,s4,s7,s8,s9,s11,s12,s18);
		// list=new ArrayList<>(list);
		Collections.addAll(list, s1, s2, s3, s4, s7, s8, s9, s11, s12, s18);
		// set=(Set<Student>) Arrays.asList(s1,s2,s3,s4,s7,s8,s9,s11,s12,s18);

		// Filtering using Stream
		list.stream().filter(s -> s.getId() > 15).forEach(fs -> System.out.println(fs));
		System.out.println("======================filter======================================");
		// Filtering using Stream and save to list

		List<Student> s = (List<Student>) list.stream().filter(f1 -> f1.getId() > 15).collect(Collectors.toList());
		System.out.println(s);
		System.out.println(
				"======================filter(predicate) and map(function) and collect  list======================================");
		List<Integer> sal = (List<Integer>) list.stream().filter(f1 -> f1.getSal() > 10000).map(f1 -> f1.getSal())
				.collect(Collectors.toList());
		System.out.println(sal);
		System.out.println(
				"======================filter(predicate) and map(function) and collectlist wityh methoref==============");
		list.stream().filter(p -> p.getSal() > 15000).map(Student::getSal).forEach(c -> System.out.println(c));

		System.out.println(
				"======================increase sal using map(functinon (i))======================================");
		list.stream().map(f -> f.getSal() + 10000).forEach(sl -> System.out.println(sl));
		System.out.println("======================reduce() sum the total sal======================================");
		Integer il = list.stream().map(f -> f.getSal()).reduce(0, Integer::sum);
		System.out.println(il);
		int a = list.stream().map(f -> f.getSal()).reduce(0, (sum, sla) -> sum + sla);
		System.out.println(a);
		System.out.println("============sum by sal using collectors methods() =====================");
		double d = list.stream().collect(Collectors.summingDouble(stu -> stu.getSal()));
		System.out.println(d);
		System.out.println("============find max sal And min sal =====================");
		Student maxs = list.stream().max((i1, i2) -> i1.getSal().compareTo(i2.getSal())).get();
		System.out.println(maxs);
		Student mins = list.stream().min((i1, i2) -> i1.getSal().compareTo(i2.getSal())).get();
		System.out.println(mins);
		System.out.println("============count () =====================");
		long count = list.stream().count();
		System.out.println(count);

		System.out.println("===========convert list into set=====================");
		Set<Student> sset = list.stream().collect(Collectors.toSet());
		long counts = sset.stream().count();
		System.out.println(sset);
		System.out.println(counts);
		System.out.println("============convert list into map=====================");

		Map<Integer, String> mmap = sset.stream().collect(Collectors.toMap(p -> p.hashCode(), p -> p.getName()));
		System.out.println(mmap);
		System.out.println("============count with collectors=====================");
		Long c = list.stream().collect(Collectors.counting());
		System.out.println(c);

	}
}