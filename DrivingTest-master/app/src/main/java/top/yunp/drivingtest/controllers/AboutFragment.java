package top.yunp.drivingtest.controllers;


import android.databinding.ObservableField;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.text.Html;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import top.yunp.drivingtest.databinding.FragmentAboutBinding;


public class AboutFragment extends Fragment {


    private FragmentAboutBinding binding;
    private ObservableField<CharSequence> textContent = new ObservableField<>();

    public AboutFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        binding = FragmentAboutBinding.inflate(inflater);
        binding.setController(this);
        return binding.getRoot();
    }

    @Override
    public void onResume() {
        textContent.set("设置界面");

        super.onResume();
    }

    public ObservableField<CharSequence> getTextContent() {
        return textContent;
    }
}
