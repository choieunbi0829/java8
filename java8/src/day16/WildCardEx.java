package day16;

import java.util.Arrays;

import Day12.Student;

public class WildCardEx {
	public static void registerCourse(Course<?> course) {
		System.out.println(course.getName() + "수강생 : "
				+ Arrays.toString(course.getStudents()));
	}
	
	public static void registerCourseStudent(Course<? extends Student> course) {
		System.out.println(course.getName() + "수강생: "
				+ Arrays.toString(course.getStudents()));
	}
	public static void registerCourseWorker(Course<? super Worker> course) {
		System.out.println(course.getName() + "수강생: "
				+ Arrays.toString(course.getStudents()));
	}
	public static void main(String[] args) {
		Person person = new Person("일반인");
		Worker worker = new Worker("직장인");
		Student student = new Student();
		HighStudent highStudent = new HighStudent("고등학생");
		
		Course<Person> personCourse = new Course<>("일반인",5);
		personCourse.add(person);
		personCourse.add(worker);
		personCourse.add(highStudent);
		
		registerCourse(personCourse);
//		registerCourseStudent(personCourse);
		registerCourseWorker(personCourse);
		
		Course<Student> studentCourse = new Course<Student>("학생코스", 5);
		studentCourse.add(student);
//		studentCourse.add(person);
//		studentCourse.add(highStudent);

		
		registerCourse(studentCourse);
		registerCourseStudent(studentCourse);
//		registerCourseWorker(studentCourse);
		System.out.println();
		
		Course<Worker> workerCourse = new Course<Worker>("직장인코스",5);
		workerCourse.add(worker);
//		workerCourse.add(person);
		
		registerCourse(workerCourse);
//		registerCourseStudent(workerCourse);
		
	}
}
