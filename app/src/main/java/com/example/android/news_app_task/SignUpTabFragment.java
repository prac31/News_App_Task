package com.example.android.news_app_task;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.fragment.app.Fragment;

public class SignUpTabFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState ) {
        ViewGroup root = (ViewGroup) inflater.inflate(R.layout.sign_up_tab_fragment, container, false);

        return root;
    }

}
