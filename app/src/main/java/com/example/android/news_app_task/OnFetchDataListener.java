package com.example.android.news_app_task;

import java.util.List;

public interface OnFetchDataListener<NewsApiResponse> {
void onFetchData(List<NewsHeadlines> list, String message);
void onError(String message);
}
