package com.theironyard.services;

import com.theironyard.entities.Review;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jakefroeb on 10/14/16.
 */
public interface ReviewRepository extends CrudRepository<Review,Integer>{
}
