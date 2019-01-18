package com.volvo.room;

import androidx.annotation.NonNull;
import androidx.room.ColumnInfo;
import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity(tableName = "word_table")
public class Word {

  @PrimaryKey
  @NonNull
  @ColumnInfo(name = "word")
  private String mWord;

  public String getmWord() {
    return mWord;
  }

  public void setmWord(String mWord) {
    this.mWord = mWord;
  }

}
