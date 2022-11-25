package org.prajval.RestControllers;

import java.util.List;

import org.prajval.Entityes.MyUser;
import org.prajval.ServiceLayer.MyService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCtrl {

	@Autowired
	MyService myService;
	
	@PostMapping("/add-one-user") /*THIS METHOD WILL ADD ONE RECORD AT A TIME*/
	public MyUser insert( @RequestBody MyUser u)
	{
		return myService.insert(u);
	}
	
	@PostMapping("/insert-many-user")/*THIS METHOD WILL ADD MORE THAN ONE RECORD AT A TIME*/
	public List<MyUser> insertall(@RequestBody List<MyUser> u){
		return myService.insertall(u);
	}
	
	@GetMapping("/get-all")/*THIS METHOD WILL GET ALL RECORD'S PRESENT IN DB*/
	public List<MyUser> getall(){
		return myService.getall();
	}
}
