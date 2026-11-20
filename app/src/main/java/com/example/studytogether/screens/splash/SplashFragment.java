package com.example.studytogether.screens.splash;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.studytogether.R;
import com.example.studytogether.core.BaseFragment;

public class SplashFragment extends BaseFragment<SplashViewModel> {



    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_splash, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view ,savedInstanceState);
        viewModel = getViewModel(SplashViewModel.class);
        // TODO: Use the ViewModel
    }

    @NonNull
    @Override
    protected String getTitle() {
        return "";
    }

    @Override
    protected boolean shouldShowBackButton() {
        return false;
    }
}