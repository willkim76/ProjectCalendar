package dependencies;

import activities.AddEventActivity;
import dagger.Component;

import javax.inject.Singleton;

@Singleton
@Component
public interface Services {

    AddEventActivity provideAddEventActivity();
}
