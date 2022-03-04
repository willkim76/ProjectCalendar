package dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBScanExpression;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapperConfig;
import com.amazonaws.services.dynamodbv2.datamodeling.PaginatedScanList;
import types.Event;

import javax.inject.Inject;
import java.util.ArrayList;
import java.util.List;

public class EventDao {
    private DynamoDBMapper dynamoDBMapper;

    @Inject
    public EventDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public void saveEvent(Event event) {
        this.dynamoDBMapper.save(event);
    }

    public Event getEvent(Event event) {
        return this.dynamoDBMapper.load(Event.class, event.getEventId(), event.getStartDateTime());
    }

    public List<Event> getEventsByDay(String day) {
        List<Event> eventsByDay = new ArrayList<>();
        for (Event event : this.findAllEvents()) {

        }
        return eventsByDay;
    }

    public List<Event> getEventsByWeek(String date) {
        List<Event> eventsByDay = new ArrayList<>();
        for (Event event : this.findAllEvents()) {

        }
        return eventsByDay;
    }

    public List<Event> getEventsByMonth(String month) {
        List<Event> eventsByDay = new ArrayList<>();
        for (Event event : this.findAllEvents()) {

        }
        return eventsByDay;
    }

    public void updateEvent(Event event) {
        Event eventToUpdate = this.getEvent(event);


        this.dynamoDBMapper.save(eventToUpdate);
    }

    public boolean deleteEvent() {
        this.dynamoDBMapper.delete(null);
        return false;
    }

    private List<Event> findAllEvents() {
        DynamoDBScanExpression dynamoDBScanExpression = new DynamoDBScanExpression();
        DynamoDBMapperConfig config =
                new DynamoDBMapperConfig(DynamoDBMapperConfig.PaginationLoadingStrategy.EAGER_LOADING);
        PaginatedScanList<Event> paginatedScanList =
                this.dynamoDBMapper.scan(Event.class, dynamoDBScanExpression, config);
        paginatedScanList.loadAllResults();

        return new ArrayList<>(paginatedScanList);
    }
}
