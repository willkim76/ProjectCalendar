package activities;

import dagger.internal.Factory;
import dao.EventDao;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetEventsByDayActivity_Factory implements Factory<GetEventsByDayActivity> {
  private final Provider<EventDao> eventDaoProvider;

  public GetEventsByDayActivity_Factory(Provider<EventDao> eventDaoProvider) {
    this.eventDaoProvider = eventDaoProvider;
  }

  @Override
  public GetEventsByDayActivity get() {
    return new GetEventsByDayActivity(eventDaoProvider.get());
  }

  public static GetEventsByDayActivity_Factory create(Provider<EventDao> eventDaoProvider) {
    return new GetEventsByDayActivity_Factory(eventDaoProvider);
  }
}
