package com.volvo.room;

import android.app.Application;
import android.os.AsyncTask;

import java.util.List;

import androidx.lifecycle.LiveData;

public class WordRepository {

  private WordDao mWordDao;
  private LiveData<List<Word>> mAllWords;

  WordRepository(Application application) {
    WordRoomDatabase db = WordRoomDatabase.getDatabase(application);
    mWordDao = db.wordDao();
    mAllWords = mWordDao.getAllWords();
  }

  LiveData<List<Word>> getmAllWords() {
    return mAllWords;
  }

  public void insert(Word word) {

    new insertAsyncTask(mWordDao).execute(word);
  }

  private static class insertAsyncTask extends AsyncTask<Word, Void, Void> {


    private WordDao mAsynTaskDao;

    public insertAsyncTask(WordDao mAsynTaskDao) {
      this.mAsynTaskDao = mAsynTaskDao;
    }

    @Override
    protected Void doInBackground(Word... words) {
      mAsynTaskDao.insert(words[0]);
      return null;
    }
  }


}
