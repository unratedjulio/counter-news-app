package com.example.counternews.ui.news;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;
import androidx.lifecycle.ViewModel;

import java.util.ArrayList;

public class NewsViewModel extends ViewModel {

    private final MutableLiveData<List<News>> news;

    public NewsViewModel() {
        news = new MutableLiveData<>();

        List<News> news = new ArrayList<>();
        news.add(new News(title "Ferroviaria tem desfalque importante", description ""));
        news.add(new News(title "Ferrinha joga sábado", description ""));
        news.add(new News(title "Copa do Mundo Ferminina inicia", description ""));
    }

    public LiveData<List<News>> getNews() {
        return news;
    }
}