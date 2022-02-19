package activities;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dao.EventDao;
import data.AddEventRequest;
import data.results.AddEventResult;
import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;

import javax.inject.Inject;

public class AddEventActivity implements RequestHandler<AddEventRequest, AddEventResult> {
    Logger log = LogManager.getFormatterLogger();
    private EventDao eventDao;

    @Inject
    public AddEventActivity(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    public AddEventResult handleRequest(AddEventRequest request, Context context) {
        return null;
    }
}
