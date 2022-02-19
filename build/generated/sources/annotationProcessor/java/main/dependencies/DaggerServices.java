package dependencies;

import javax.annotation.processing.Generated;

@Generated(
  value = "dagger.internal.codegen.ComponentProcessor",
  comments = "https://google.github.io/dagger"
)
public final class DaggerServices implements Services {
  private DaggerServices(Builder builder) {}

  public static Builder builder() {
    return new Builder();
  }

  public static Services create() {
    return new Builder().build();
  }

  public static final class Builder {
    private Builder() {}

    public Services build() {
      return new DaggerServices(this);
    }
  }
}
