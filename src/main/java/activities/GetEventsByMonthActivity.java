package activities;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import dao.EventDao;
import data.requests.GetEventsByMonthRequest;
import data.results.GetEventsByMonthResult;

import javax.inject.Inject;

public class GetEventsByMonthActivity implements RequestHandler<GetEventsByMonthRequest, GetEventsByMonthResult> {
    private EventDao eventDao;

    @Inject
    public GetEventsByMonthActivity(EventDao eventDao) {
        this.eventDao = eventDao;
    }

    @Override
    public GetEventsByMonthResult handleRequest(GetEventsByMonthRequest input, Context context) {
        return null;
    }
}
