package feedback.helpers;

import feedback.helpers.FeedbackRequest;
import feedback.helpers.Feedback;
import feedback.helpers.FeedbackRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class FeedbackService {

    @Autowired
    private FeedbackRepository repository;

    public Feedback saveFeedback(FeedbackRequest request) {
        Feedback feedback = new Feedback();
        feedback.setName(request.getName());
        feedback.setEmail(request.getEmail());
        feedback.setMessage(request.getMessage());
        return repository.save(feedback);
    }

    public List<Feedback> getAllFeedback() {
        return repository.findAll();
    }
}
