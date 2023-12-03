package in.crud.service;

import in.crud.dto.Student;

public interface IStudentService {
	
	// operations to be implemented
	public String addStudent(String sname, Integer sage, String saddress);

	public Student searchStudent(Integer sid);

	public String updateStudent(Student student);

	public String deleteStudent(Integer sid);

}
