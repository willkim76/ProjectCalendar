package activities;

import dao.EventDao;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mockito.Mock;

import static org.mockito.MockitoAnnotations.initMocks;

public class AddEventActivityTest {
    private AddEventActivity addEventActivity;

    @Mock
    private EventDao eventDao;

    @BeforeEach
    void setup() {
        initMocks(this);
        addEventActivity = new AddEventActivity(eventDao);
    }

    @AfterEach
    void teardown() {

    }

    @Test
    void handleRequest_withValidRequest_returnsAddEventResult() {

    }
}
