package com.kodilla.good.patterns.FlightFinder;

public class FlightQueryRetriever {
    public FlightQuery retrieveQuery() {
        FlightQuery newQuery = new FlightQuery("WRC", "KRK", "POZ");
        return newQuery;
    }
}
