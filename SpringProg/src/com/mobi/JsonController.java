package com.mobi;

import java.util.ArrayList;

import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class JsonController {

	/**Its return the student object in json format.
	 * its need the jackson lib.**/
	@ResponseBody
	@RequestMapping(value="/student", produces = MediaType.APPLICATION_JSON_VALUE)
	public ArrayList<Student> retrunStudent()
	{
		Student student = new Student();
		student.setS_nm("abc");
		
		Student student1 = new Student();
		student1.setS_nm("xyz");
		
		Student student2 = new Student();
		student2.setS_nm("pqr");
		
		ArrayList<Student> response = new ArrayList<>();
		response.add(student);
		response.add(student1);
		response.add(student2);
		
		return response;
				
	}
	
	/**To send the response status code along with the msg. to back**/
	@RequestMapping(value="/students/{name}", method=RequestMethod.GET)
	public ResponseEntity<String> data1(@PathVariable("name") String name)
	{
		System.out.println("name is-->>> "+name);
		
		//System.out.println("another name is--->> "+students.getCity());
		 return new ResponseEntity<String>("sucess", HttpStatus.OK);
	}
}
