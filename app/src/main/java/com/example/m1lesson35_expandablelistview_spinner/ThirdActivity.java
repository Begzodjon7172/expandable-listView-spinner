package com.example.m1lesson35_expandablelistview_spinner;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.m1lesson35_expandablelistview_spinner.databinding.ActivityThirdBinding;

public class ThirdActivity extends AppCompatActivity {
    private ActivityThirdBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityThirdBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());
    }
}