package com.morihacky.android.rxjava.rxbus;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import butterknife.ButterKnife;
import com.morihacky.android.rxjava.app.R;

public class RxBusDemoFragment
    extends Fragment {

  @Override
  public View onCreateView(LayoutInflater inflater,
                           @Nullable ViewGroup container,
                           @Nullable Bundle savedInstanceState) {
    View layout = inflater.inflate(R.layout.fragment_rxbus_demo, container, false);
    ButterKnife.inject(this, layout);
    return layout;
  }

  @Override
  public void onActivityCreated(@Nullable Bundle savedInstanceState) {
    super.onActivityCreated(savedInstanceState);

    getActivity().getSupportFragmentManager()
        .beginTransaction()
        .replace(R.id.demo_rxbus_frag_1, new RxBusDemo_TopFragment())
        .replace(R.id.demo_rxbus_frag_2, new RxBusDemo_BottomFragment())
        //.replace(R.id.demo_rxbus_frag_2, new RxBusDemo_BottomFANCYFragment())
        .commit();
  }

  public static class TapEvent {}
}
