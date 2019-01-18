package com.volvo.room;


import java.util.List;

import androidx.lifecycle.LiveData;
import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

@Dao
public interface WordDao {

  @Insert
  void insert(Word word);

  @Query("DELETE FROM word_table")
  void deleteAll();

  @Query("SELECT * from word_table ORDER BY word ASC")
  List<Word> getAllWord();

  @Query("SELECT * from word_table ORDER BY word ASC")
  LiveData<List<Word>> getAllWords();


}
