package dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import types.Event;

import javax.inject.Inject;

public class EventDao {
    private DynamoDBMapper dynamoDBMapper;

    @Inject
    public EventDao(DynamoDBMapper dynamoDBMapper) {
        this.dynamoDBMapper = dynamoDBMapper;
    }

    public void save(Event event) {
        this.dynamoDBMapper.save(event);
    }

    public Event get(Event event) {
        return this.dynamoDBMapper.load(Event.class, event.getEventId(), event.getDateTime());
    }
}
