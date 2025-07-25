package feedback.helpers;

import feedback.helpers.FeedbackRequest;
import feedback.helpers.Feedback;
import feedback.helpers.FeedbackService;
import jakarta.validation.Valid;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/feedback")
public class FeedbackController {

    @Autowired
    private FeedbackService service;

    @PostMapping
    public Feedback submitFeedback(@Valid @RequestBody FeedbackRequest request) {
        return service.saveFeedback(request);
    }

    @GetMapping
    public List<Feedback> getAllFeedback() {
        return service.getAllFeedback();
    }
}
