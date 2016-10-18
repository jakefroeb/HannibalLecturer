package com.theironyard.services;

import com.theironyard.entities.Lecture;
import org.springframework.data.repository.CrudRepository;

/**
 * Created by jakefroeb on 10/14/16.
 */
public interface LectureRepository extends CrudRepository<Lecture,Integer>{
}
