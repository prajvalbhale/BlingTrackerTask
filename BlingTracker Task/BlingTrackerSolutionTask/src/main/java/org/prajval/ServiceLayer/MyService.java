package org.prajval.ServiceLayer;

import java.util.List;

import org.prajval.Entityes.MyUser;
import org.prajval.RepositoryLayer.UserRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MyService {

	@Autowired
	UserRepo userrepo;
	
	//THIS WILL INSERT ONLY ONE USER
	public MyUser insert(MyUser u)
	{
		return userrepo.save(u);
	}
	
	//THIS WILL INSERT MULTIPLE USERS AT ONE TIME
	public List<MyUser> insertall(List<MyUser> myuser)
	{
		return userrepo.saveAll(myuser);
	}
	
	//LIST OF ALL USERS
	public List<MyUser> getall()
	{
		return userrepo.findAll();
	}
	
}
