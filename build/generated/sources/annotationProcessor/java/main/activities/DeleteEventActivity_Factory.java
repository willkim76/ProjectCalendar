package activities;

import dagger.internal.Factory;
import dao.EventDao;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DeleteEventActivity_Factory implements Factory<DeleteEventActivity> {
  private final Provider<EventDao> eventDaoProvider;

  public DeleteEventActivity_Factory(Provider<EventDao> eventDaoProvider) {
    this.eventDaoProvider = eventDaoProvider;
  }

  @Override
  public DeleteEventActivity get() {
    return new DeleteEventActivity(eventDaoProvider.get());
  }

  public static DeleteEventActivity_Factory create(Provider<EventDao> eventDaoProvider) {
    return new DeleteEventActivity_Factory(eventDaoProvider);
  }
}
