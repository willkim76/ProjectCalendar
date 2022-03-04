package activities;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dao.EventDao;
import data.requests.GetEventsByWeekRequest;
import data.results.GetEventsByWeekResult;

import javax.inject.Inject;

public class GetEventsByWeekActivity implements RequestHandler<GetEventsByWeekRequest, GetEventsByWeekResult> {
    private EventDao eventDao;

    @Inject
    public GetEventsByWeekActivity(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    public GetEventsByWeekResult handleRequest(GetEventsByWeekRequest input, Context context) {
        return null;
    }
}
