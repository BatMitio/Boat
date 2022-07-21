package com.dnero.bgps.ui.global;

import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

public class GlobalViewModel extends ViewModel {
    private final MutableLiveData<Integer> data = new MutableLiveData<>();

    public GlobalViewModel() {
        data.setValue(0);
    }

    public Integer getData() {
        return data.getValue();
    }

    public GlobalViewModel setData(Integer value) {
        data.setValue(value);
        return this;
    }
}
