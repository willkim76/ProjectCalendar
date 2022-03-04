package activities;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dao.EventDao;
import data.requests.GetEventsByDayRequest;
import data.results.GetEventsByDayResult;

import javax.inject.Inject;

public class GetEventsByDayActivity implements RequestHandler<GetEventsByDayRequest, GetEventsByDayResult> {
    private EventDao eventDao;

    @Inject
    public GetEventsByDayActivity(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    public GetEventsByDayResult handleRequest(GetEventsByDayRequest input, Context context) {
        return null;
    }
}
