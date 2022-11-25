package org.prajval.RepositoryLayer;

import org.prajval.Entityes.MyUser;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepo extends JpaRepository<MyUser, Integer>{

}
