package net.ekhtar.finaltabs.adaptor;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import net.ekhtar.finaltabs.fragment.AllOrderFragment;
import net.ekhtar.finaltabs.fragment.WaitingOrderFragment;

/**
 * Created by Ahmed.a.elfattah on 21/10/2017.
 */

public class CustomFragmentPageAdapter extends FragmentPagerAdapter {

    private static final String TAG = CustomFragmentPageAdapter.class.getSimpleName();

    private static final int FRAGMENT_COUNT = 2;

    public CustomFragmentPageAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {
        switch (position){
            case 0:
                return new AllOrderFragment();
            case 1:
                return new WaitingOrderFragment();
            /*case 1:
                return new PlaylistFragment();
            case 2:
                return new AlbumFragment();
            case 3:
                return new ArtistFragment();*/
        }
        return null;
    }

    @Override
    public int getCount() {
        return FRAGMENT_COUNT;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position){
            case 0:
                return "All Orders";
            case 1:
                return "Waiting Orders";
        }
        return null;
    }
}