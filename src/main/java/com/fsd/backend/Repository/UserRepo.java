package com.fsd.backend.Repository;

import org.springframework.data.repository.CrudRepository;

import com.fsd.backend.Entity.User;

/**
 * The Interface UserRepo.
 */
/**
 * @author Sasidhar
 *
 */
public interface UserRepo extends CrudRepository<User, Long>{

}
