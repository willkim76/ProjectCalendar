package activities;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dao.EventDao;
import data.requests.DeleteEventRequest;
import data.results.DeleteEventResult;

import javax.inject.Inject;

public class DeleteEventActivity implements RequestHandler<DeleteEventRequest, DeleteEventResult> {
    private EventDao eventDao;

    @Inject
    public DeleteEventActivity(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    public DeleteEventResult handleRequest(DeleteEventRequest request, Context context) {
        return null;
    }
}
