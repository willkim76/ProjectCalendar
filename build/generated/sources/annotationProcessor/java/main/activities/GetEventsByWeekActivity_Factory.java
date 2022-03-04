package activities;

import dagger.internal.Factory;
import dao.EventDao;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetEventsByWeekActivity_Factory implements Factory<GetEventsByWeekActivity> {
  private final Provider<EventDao> eventDaoProvider;

  public GetEventsByWeekActivity_Factory(Provider<EventDao> eventDaoProvider) {
    this.eventDaoProvider = eventDaoProvider;
  }

  @Override
  public GetEventsByWeekActivity get() {
    return new GetEventsByWeekActivity(eventDaoProvider.get());
  }

  public static GetEventsByWeekActivity_Factory create(Provider<EventDao> eventDaoProvider) {
    return new GetEventsByWeekActivity_Factory(eventDaoProvider);
  }
}
