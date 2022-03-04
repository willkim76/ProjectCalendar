package activities;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.LambdaLogger;
import com.amazonaws.services.lambda.runtime.RequestHandler;

import dao.EventDao;

import data.requests.AddEventRequest;
import data.results.AddEventResult;

import javax.inject.Inject;

public class AddEventActivity implements RequestHandler<AddEventRequest, AddEventResult> {
    private EventDao eventDao;

    @Inject
    public AddEventActivity(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    public AddEventResult handleRequest(AddEventRequest request, Context context) {
        LambdaLogger logger = context.getLogger();
        return null;
    }
}
