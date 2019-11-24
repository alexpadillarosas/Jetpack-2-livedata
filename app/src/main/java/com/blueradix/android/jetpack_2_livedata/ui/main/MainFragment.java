package com.blueradix.android.jetpack_2_livedata.ui.main;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import com.blueradix.android.jetpack_2_livedata.R;
import com.google.android.material.textfield.TextInputEditText;

public class MainFragment extends Fragment {

    private MainViewModel mViewModel;

    private TextInputEditText dollarInputEditText;
    private TextView resultTextView;
    private Button convertButton;

    public static MainFragment newInstance() {
        return new MainFragment();
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        return inflater.inflate(R.layout.main_fragment, container, false);
    }

    @Override
    public void onActivityCreated(@Nullable Bundle savedInstanceState) {
        super.onActivityCreated(savedInstanceState);
        mViewModel = ViewModelProviders.of(this).get(MainViewModel.class);
        // TODO: Use the ViewModel

        dollarInputEditText = getView().findViewById(R.id.dollarInputEditText);
        resultTextView = getView().findViewById(R.id.resultTextView);
        convertButton = getView().findViewById(R.id.convertButton);
//        commented out as the observer will set this value, whenever it detects a difference
//        between the UI and the viewModel
//        resultTextView.setText(mViewModel.getResult().toString());

        final Observer<Float> resultObserver = new Observer<Float>() {
            @Override
            public void onChanged(Float result) {
                resultTextView.setText(result.toString());
            }
        };

        mViewModel.getResult().observe(this, resultObserver);

        convertButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(!dollarInputEditText.getText().toString().isEmpty()){
                    mViewModel.setAmount( dollarInputEditText.getText().toString() );
//                    we don't need this as the observer will detect the result change and will set resultTextView's value from the viewModel
//                    resultTextView.setText(mViewModel.getResult().toString());
                }else {
                    resultTextView.setText("No Value");
                }
            }
        });

    }

}
