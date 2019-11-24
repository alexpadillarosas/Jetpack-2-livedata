package com.blueradix.android.jetpack_2_livedata.ui.main;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class MainViewModel extends ViewModel {
    // TODO: Implement the ViewModel

    private static final Float usd_to_au_rate = 0.5F;
    private String dollarText = "";
//    commented out as we are going to use now the MutableLiveData class
//    private Float result = 0F;
    private MutableLiveData<Float> result = new MutableLiveData<>();

    public void setAmount(String value){
        this.dollarText = value;
//        result = Float.valueOf(dollarText)*usd_to_au_rate;
        result.setValue(Float.valueOf(dollarText)*usd_to_au_rate);
    }
//     change the return value to MutableLiveData
    public MutableLiveData<Float> getResult(){
        return result;
    }

}
