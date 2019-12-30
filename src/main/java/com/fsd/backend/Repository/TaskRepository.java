package com.fsd.backend.Repository;

import org.springframework.data.repository.CrudRepository;

import com.fsd.backend.Entity.Task;

/**
 * The Interface TaskRepository.
 */
/**
 * @author Sasidhar
 *
 */
public interface TaskRepository extends CrudRepository<Task, Long>{

}
