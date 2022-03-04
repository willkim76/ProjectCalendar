package activities;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dao.EventDao;
import data.requests.UpdateEventRequest;
import data.results.UpdateEventResult;

import javax.inject.Inject;

public class UpdateEventActivity implements RequestHandler<UpdateEventRequest, UpdateEventResult> {
    private EventDao eventDao;

    @Inject
    public UpdateEventActivity(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    public UpdateEventResult handleRequest(UpdateEventRequest input, Context context) {
        return null;
    }
}
