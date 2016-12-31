package ng.volymat.volymat.custom;

/**
 * Created by Nsikak  Thompson on 12/8/2016.
 */

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;



public class TabsPagerAdapter extends FragmentPagerAdapter {

    public TabsPagerAdapter(FragmentManager fm, Object feed) {
        super(fm);
    }

    @Override
    public Fragment getItem(int index) {

        switch (index) {



        }

        return null;
    }

    @Override
    public int getCount() {
        // get item count - equal to number of tabs
        return 2;
    }

}
