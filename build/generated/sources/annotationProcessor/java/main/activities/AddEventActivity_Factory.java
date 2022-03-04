package activities;

import dagger.internal.Factory;
import dao.EventDao;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class AddEventActivity_Factory implements Factory<AddEventActivity> {
  private final Provider<EventDao> eventDaoProvider;

  public AddEventActivity_Factory(Provider<EventDao> eventDaoProvider) {
    this.eventDaoProvider = eventDaoProvider;
  }

  @Override
  public AddEventActivity get() {
    return new AddEventActivity(eventDaoProvider.get());
  }

  public static AddEventActivity_Factory create(Provider<EventDao> eventDaoProvider) {
    return new AddEventActivity_Factory(eventDaoProvider);
  }
}
