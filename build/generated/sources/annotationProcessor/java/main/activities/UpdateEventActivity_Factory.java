package activities;

import dagger.internal.Factory;
import dao.EventDao;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class UpdateEventActivity_Factory implements Factory<UpdateEventActivity> {
  private final Provider<EventDao> eventDaoProvider;

  public UpdateEventActivity_Factory(Provider<EventDao> eventDaoProvider) {
    this.eventDaoProvider = eventDaoProvider;
  }

  @Override
  public UpdateEventActivity get() {
    return new UpdateEventActivity(eventDaoProvider.get());
  }

  public static UpdateEventActivity_Factory create(Provider<EventDao> eventDaoProvider) {
    return new UpdateEventActivity_Factory(eventDaoProvider);
  }
}
