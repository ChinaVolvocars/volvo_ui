package com.volvo.room;

import android.app.Application;

import java.util.List;

import androidx.annotation.NonNull;
import androidx.lifecycle.AndroidViewModel;
import androidx.lifecycle.LiveData;

public class WordViewModel extends AndroidViewModel {

  private WordRepository mWordRepository;
  private LiveData<List<Word>> getAllWords;

  public WordViewModel(@NonNull Application application) {
    super(application);
    mWordRepository = new WordRepository(application);
    getAllWords = mWordRepository.getmAllWords();
  }

  public LiveData<List<Word>> getAllWords() {
    return getAllWords;
  }

  public void insertWord(Word word) {
    mWordRepository.insert(word);
  }

}
