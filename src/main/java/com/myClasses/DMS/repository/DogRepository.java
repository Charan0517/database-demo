package com.myClasses.DMS.repository;

import org.springframework.data.repository.CrudRepository;

import com.myClasses.DMS.Models.Dog;

//import antlr.collections.List;
import java.util.List;



/**
 * @author Sri Charan Vattikonda
 */

public interface DogRepository extends CrudRepository<Dog, Integer> {
	
	List<Dog> findByName(String name);
}
