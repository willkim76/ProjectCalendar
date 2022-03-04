package dependencies;

import activities.*;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component(modules = {DynamoDBModule.class})
public interface Services {

    AddEventActivity provideAddEventActivity();

    DeleteEventActivity provideDeleteEventActivity();

    GetEventsByDayActivity provideGetEventsByDayActivity();

    GetEventsByWeekActivity providesGetEventsByWeekActivity();

    GetEventsByMonthActivity providesGetEventsByMonthActivity();

    UpdateEventActivity providesUpdateEventActivity();
}
