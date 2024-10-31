package Service;

import com.TravelCompanyEshopJava.domain.Itinerary;

public interface ItineraryService {
    void add(Itinerary itinerary);
    Itinerary get(Long id);
}
