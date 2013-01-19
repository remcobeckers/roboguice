package roboguice.content;

import roboguice.RoboGuice;

import android.content.Context;

/**
 * Provides injection to loaders.
 * 
 * @author cherrydev
 */
public abstract class RoboLoader<D> extends android.content.Loader<D> {

    public RoboLoader(Context context) {
        super(context);
        RoboGuice.injectMembers(context, this);
    }

}
