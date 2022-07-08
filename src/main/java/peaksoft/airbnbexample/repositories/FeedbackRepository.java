package peaksoft.airbnbexample.repositories;

import org.springframework.data.jpa.repository.JpaRepository;
import peaksoft.airbnbexample.models.Feedback;

public interface FeedbackRepository extends JpaRepository<Feedback, Long> {
}