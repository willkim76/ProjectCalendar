package dependencies;

import activities.AddEventActivity;
import activities.DeleteEventActivity;
import activities.GetEventsByDayActivity;
import activities.GetEventsByMonthActivity;
import activities.GetEventsByWeekActivity;
import activities.UpdateEventActivity;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.DoubleCheck;
import dagger.internal.Preconditions;
import dao.EventDao;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerServices implements Services {
  private Provider<DynamoDBMapper> dynamoDBMapperProvider;

  private DaggerServices(Builder builder) {
    initialize(builder);
  }

  public static Builder builder() {
    return new Builder();
  }

  public static Services create() {
    return new Builder().build();
  }

  private EventDao getEventDao() {
    return new EventDao(dynamoDBMapperProvider.get());
  }

  @SuppressWarnings("unchecked")
  private void initialize(final Builder builder) {
    this.dynamoDBMapperProvider =
        DoubleCheck.provider(
            DynamoDBModule_DynamoDBMapperProviderFactory.create(builder.dynamoDBModule));
  }

  @Override
  public AddEventActivity provideAddEventActivity() {
    return new AddEventActivity(getEventDao());
  }

  @Override
  public DeleteEventActivity provideDeleteEventActivity() {
    return new DeleteEventActivity(getEventDao());
  }

  @Override
  public GetEventsByDayActivity provideGetEventsByDayActivity() {
    return new GetEventsByDayActivity(getEventDao());
  }

  @Override
  public GetEventsByWeekActivity providesGetEventsByWeekActivity() {
    return new GetEventsByWeekActivity(getEventDao());
  }

  @Override
  public GetEventsByMonthActivity providesGetEventsByMonthActivity() {
    return new GetEventsByMonthActivity(getEventDao());
  }

  @Override
  public UpdateEventActivity providesUpdateEventActivity() {
    return new UpdateEventActivity(getEventDao());
  }

  public static final class Builder {
    private DynamoDBModule dynamoDBModule;

    private Builder() {}

    public Services build() {
      if (dynamoDBModule == null) {
        this.dynamoDBModule = new DynamoDBModule();
      }
      return new DaggerServices(this);
    }

    public Builder dynamoDBModule(DynamoDBModule dynamoDBModule) {
      this.dynamoDBModule = Preconditions.checkNotNull(dynamoDBModule);
      return this;
    }
  }
}
