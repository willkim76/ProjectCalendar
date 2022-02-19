package dao;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBMapper;
import dagger.internal.Factory;
import javax.annotation.processing.Generated;
import javax.inject.Provider;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class EventDao_Factory implements Factory<EventDao> {
  private final Provider<DynamoDBMapper> dynamoDBMapperProvider;

  public EventDao_Factory(Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    this.dynamoDBMapperProvider = dynamoDBMapperProvider;
  }

  @Override
  public EventDao get() {
    return new EventDao(dynamoDBMapperProvider.get());
  }

  public static EventDao_Factory create(Provider<DynamoDBMapper> dynamoDBMapperProvider) {
    return new EventDao_Factory(dynamoDBMapperProvider);
  }
}
