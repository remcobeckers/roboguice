package roboguice.content;

import roboguice.RoboGuice;

import android.content.AsyncTaskLoader;
import android.content.Context;

/**
 * Provides injection to async task loaders.
 * 
 * @author cherrydev
 */
public abstract class RoboAsyncTaskLoader<D> extends AsyncTaskLoader<D> {

    public RoboAsyncTaskLoader(Context context) {
        super(context);
        RoboGuice.injectMembers(context, this);
    }

}
