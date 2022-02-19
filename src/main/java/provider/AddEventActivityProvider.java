package provider;

import com.amazonaws.services.lambda.runtime.Context;
import com.amazonaws.services.lambda.runtime.RequestHandler;
import data.AddEventRequest;
import data.results.AddEventResult;
import dependencies.Services;
import dependencies.DaggerServices;

public class AddEventActivityProvider implements RequestHandler<AddEventRequest, AddEventResult> {
    private Services services;

    @Override
    public AddEventResult handleRequest(AddEventRequest addEventRequest, Context context) {
        return getServices().provideAddEventActivity().handleRequest(addEventRequest, null);
    }

    private Services getServices() {
        if (services == null) {
            services = DaggerServices.create();
        }
        return services;
    }
}
