package activities;

import dagger.internal.Factory;
import dao.EventDao;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class GetEventsByMonthActivity_Factory implements Factory<GetEventsByMonthActivity> {
  private final Provider<EventDao> eventDaoProvider;

  public GetEventsByMonthActivity_Factory(Provider<EventDao> eventDaoProvider) {
    this.eventDaoProvider = eventDaoProvider;
  }

  @Override
  public GetEventsByMonthActivity get() {
    return new GetEventsByMonthActivity(eventDaoProvider.get());
  }

  public static GetEventsByMonthActivity_Factory create(Provider<EventDao> eventDaoProvider) {
    return new GetEventsByMonthActivity_Factory(eventDaoProvider);
  }
}
