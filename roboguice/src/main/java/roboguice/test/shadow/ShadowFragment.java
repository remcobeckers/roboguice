package roboguice.test.shadow;

import com.xtremelabs.robolectric.internal.Implementation;
import com.xtremelabs.robolectric.internal.Implements;

import android.app.Activity;
import android.app.Fragment;
import android.os.Bundle;
import android.view.View;

@Implements(Fragment.class)
public class ShadowFragment {
    protected Activity activity;
    protected View view;

    @Implementation
    public Activity getActivity() {
        return activity;
    }

    @Implementation
    public View getView() {
        return view;
    }

    @Implementation
    public void onViewCreated(View v, Bundle savedInstanceState) {
        view = v;
    }

    @Implementation
    public void onAttach(Activity a) {
        activity = (Activity) a;
    }
}
