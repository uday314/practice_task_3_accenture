package services;

import org.springframework.stereotype.Service;

@Service
public class SearchService {
    public String performSearch(String query) {
        // Logic for searching (moved from SearchController)
        return "Search results for: " + query; // Replace with actual search logic
    }
}
