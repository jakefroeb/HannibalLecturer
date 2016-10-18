package com.theironyard;

import com.theironyard.entities.Lecture;
import com.theironyard.entities.Review;
import com.theironyard.services.LectureRepository;
import com.theironyard.services.ReviewRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import java.util.List;


@RestController
public class HannibalLecturerController {
    @Autowired
    LectureRepository lecturers;

    @Autowired
    ReviewRepository reviews;

    @RequestMapping(path = "/lecturers", method = RequestMethod.GET)
    public List<Lecture> getLecturers(){
        return (List<Lecture>) lecturers.findAll();
    }

    @RequestMapping(path = "/lecturers", method = RequestMethod.POST)
    public void createLecturer( String name, String topic, String image) {
        Lecture lecture = new Lecture(name, topic, image);
        lecturers.save(lecture);
    }

    @RequestMapping(path = "/reviews", method = RequestMethod.GET)
    public List<Review> getReviews(){
        return (List<Review>) reviews.findAll();
    }

    @RequestMapping(path = "/reviews", method = RequestMethod.POST)
    public void createReview(String author, String text, int lecturerId, boolean isGood) {
        Review review = new Review(author, text,  isGood,lecturerId);
        reviews.save(review);
    }

}