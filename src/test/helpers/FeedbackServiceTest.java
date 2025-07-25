package feedback.helpers;

import feedback.helpers.FeedbackRequest;
import feedback.helpers.entity.Feedback;
import feedback.helpers.FeedbackRepository;
import org.junit.jupiter.api.Test;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;

import java.util.Collections;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;
import static org.mockito.Mockito.*;

public class FeedbackServiceTest {

    @Mock
    private FeedbackRepository repository;

    @InjectMocks
    private FeedbackService service;

    public FeedbackServiceTest() {
        MockitoAnnotations.openMocks(this);
    }

    @Test
    void testSaveFeedback() {
        FeedbackRequest request = new FeedbackRequest();
        request.setName("John Doe");
        request.setEmail("john@example.com");
        request.setMessage("This is a test message.");

        Feedback savedFeedback = new Feedback();
        savedFeedback.setId(1L);
        savedFeedback.setName(request.getName());
        savedFeedback.setEmail(request.getEmail());
        savedFeedback.setMessage(request.getMessage());

        when(repository.save(any(Feedback.class))).thenReturn(savedFeedback);

        Feedback result = service.saveFeedback(request);

        assertEquals("John Doe", result.getName());
        verify(repository, times(1)).save(any(Feedback.class));
    }

    @Test
    void testGetAllFeedback() {
        when(repository.findAll()).thenReturn(Collections.emptyList());
        List<Feedback> result = service.getAllFeedback();
        assertTrue(result.isEmpty());
    }
}
