package com.example.mvpexample;

import androidx.appcompat.app.AppCompatActivity;

import android.graphics.Color;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;

import com.example.mvpexample.databinding.ActivityMainBinding;

import presenter.IViewPresenter;
import presenter.Presentador;

public class MainActivity extends AppCompatActivity implements IViewPresenter {

    private Presentador mPresentador;
    private ActivityMainBinding mBinding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        mBinding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(mBinding.getRoot());
        mPresentador = new Presentador (this);
        mBinding.etPassword.addTextChangedListener(new TextWatcher() {
            @Override
            public void beforeTextChanged(CharSequence s, int start, int count, int after) {

            }

            @Override
            public void onTextChanged(CharSequence s, int start, int before, int count) {
                mPresentador.verifcadorPassword(s.toString());

            }

            @Override
            public void afterTextChanged(Editable s) {

            }
        });

    }

    @Override
    public void showPasswordString(String colour, String condition) {

        mBinding.TView.setBackgroundColor(Color.parseColor(colour));
        mBinding.TView.setText(condition);

    }
}