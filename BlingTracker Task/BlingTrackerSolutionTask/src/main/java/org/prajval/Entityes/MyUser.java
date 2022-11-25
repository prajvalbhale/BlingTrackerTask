package org.prajval.Entityes;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Data;

@Data //THIS IS LAMBOK BECAUSE OF THIS FEATURE WE NOT NEED TO 
      //CREATE GETTERS AND SETTERS THIS WILL CREATE AUTOMATICALLY
@Entity
public class MyUser {

	@Id
	private int id;
	private String username;
	private String date;
}
