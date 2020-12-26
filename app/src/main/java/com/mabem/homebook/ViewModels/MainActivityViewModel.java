package com.mabem.homebook.ViewModels;

import android.app.Application;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import com.mabem.homebook.Database.Database;
import com.mabem.homebook.Model.Member;
import com.mabem.homebook.Model.User;

public class MainActivityViewModel extends AndroidViewModel {
    private final Database database;
    private final MutableLiveData<Member> currentMember;

    public MainActivityViewModel(@NonNull Application application) {
        super(application);
        database = Database.getInstance(application);
        currentMember = database.getCurrentMember();
    }

    public LiveData<Member> getCurrentMember(){
        return currentMember;
    }

    public void signOut(){
        database.signOut();
    }

    public void updateCurrentUser(){
        database.updateCurrentUser();
    }


}