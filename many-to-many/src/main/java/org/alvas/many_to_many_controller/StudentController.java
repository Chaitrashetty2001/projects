package org.alvas.many_to_many_controller;

import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

import org.alvas.many_to_many_dao.StudentDao;
import org.alvas.many_to_many_dto.Student;
import org.alvas.many_to_many_dto.Subjects;

public class StudentController {

	public static void main(String[] args) {
		StudentDao dao = new StudentDao();
		Subjects subject1 = new Subjects();
		Subjects subject2 = new Subjects();

		Student student1 = new Student();
		Student student2 = new Student();

		Scanner sc = new Scanner(System.in);
		System.out.println("1: Save Student\n2: Delete Student");
		int choice = sc.nextInt();
		switch(choice)
		{
		case 1:
		subject1.setSbname("CO");
		subject1.setSbauthor("fade");


		subject2.setSbname("CN");
		subject2.setSbauthor("Neon");

		List<Subjects> subjects = Arrays.asList(subject1,subject2);

		student1.setSname("Lol");
		student1.setSphone(698532447);
		student1.setSubjects(subjects);

		student2.setSname("Pop");
		student2.setSphone(897563246);
		student2.setSubjects(subjects);

		dao.savestudent(student1, student2, subjects);
		break;



	}

}
}
