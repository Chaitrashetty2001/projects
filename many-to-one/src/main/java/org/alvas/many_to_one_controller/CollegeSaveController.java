package org.alvas.many_to_one_controller;

import org.alvas.many_to_one_dao.CollegeDao;
import org.alvas.many_to_one_dto.Building;
import org.alvas.many_to_one_dto.College;

public class CollegeSaveController {

	public static void main(String[] args) {
		
		CollegeDao dao = new CollegeDao();
		College college = new College();
		college.setCollegeName("MITE");
		college.setCollegeAddress("THODAR");
		Building building1  = new Building();
		Building building2 =  new Building();
		
		building1.setBuildingName("CS");
		building1.setBuildingColor("PINK");
		building1.setCollege(college);
		
		
		building2.setBuildingName("ISE");
		building2.setBuildingColor("red1");
		building2.setCollege(college);
		
		dao.saveBuildingCollege(college,building1,building2);
		
		
		
		

	}

}
