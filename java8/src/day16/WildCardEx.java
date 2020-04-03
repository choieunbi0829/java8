package day16;

import java.util.Arrays;

import Day12.Student;

public class WildCardEx {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "������ : "
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "������: "
				+ Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "������: "
				+ Arrays.toString(course.getStudents()));
	}
	public static void main(String[] args) {
		Person person = new Person("�Ϲ���");
		Worker worker = new Worker("������");
		Student student = new Student();
		HighStudent highStudent = new HighStudent("����л�");
		
		Course<Person> personCourse = new Course<>("�Ϲ���",5);
		personCourse.add(person);
		personCourse.add(worker);
		personCourse.add(highStudent);
		
		registerCourse(personCourse);
//		registerCourseStudent(personCourse);
		registerCourseWorker(personCourse);
		
		Course<Student> studentCourse = new Course<Student>("�л��ڽ�", 5);
		studentCourse.add(student);
//		studentCourse.add(person);
//		studentCourse.add(highStudent);

		
		registerCourse(studentCourse);
		registerCourseStudent(studentCourse);
//		registerCourseWorker(studentCourse);
		System.out.println();
		
		Course<Worker> workerCourse = new Course<Worker>("�������ڽ�",5);
		workerCourse.add(worker);
//		workerCourse.add(person);
		
		registerCourse(workerCourse);
//		registerCourseStudent(workerCourse);
		
	}
}
