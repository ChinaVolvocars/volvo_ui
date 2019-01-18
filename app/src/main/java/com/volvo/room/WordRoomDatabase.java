package com.volvo.room;

import android.content.Context;
import android.util.Log;

import androidx.annotation.NonNull;
import androidx.room.Database;
import androidx.room.DatabaseConfiguration;
import androidx.room.InvalidationTracker;
import androidx.room.Room;
import androidx.room.RoomDatabase;
import androidx.sqlite.db.SupportSQLiteDatabase;
import androidx.sqlite.db.SupportSQLiteOpenHelper;

@Database(entities = Word.class, version = 1)
public abstract class WordRoomDatabase extends RoomDatabase {


  private final static String TAG_LOG = WordRoomDatabase.class.getSimpleName();

  public abstract WordDao wordDao();


  private static volatile WordRoomDatabase INSTANCE;

  public WordRoomDatabase() {
    super();
    Log.w(TAG_LOG, "->MovieDatabase constructor is called.");
  }


  static WordRoomDatabase getDatabase(final Context context) {
    if (INSTANCE == null) {
      synchronized (WordRoomDatabase.class) {
        if (INSTANCE == null) {
          INSTANCE = Room.databaseBuilder(context, WordRoomDatabase.class, "word_database").build();
        }
      }
    }
    return INSTANCE;
  }


  @Override
  public void init(@NonNull DatabaseConfiguration configuration) {
    super.init(configuration);
    Log.w(TAG_LOG, "->init is called.");
  }

  @NonNull
  @Override
  public SupportSQLiteOpenHelper getOpenHelper() {
    Log.w(TAG_LOG, "->init is called.");
    return super.getOpenHelper();
  }

  @NonNull
  @Override
  protected SupportSQLiteOpenHelper createOpenHelper(DatabaseConfiguration config) {
    Log.w(TAG_LOG, "->createOpenHelper is called.");
    Log.d(TAG_LOG, "->createOpenHelper->config.name:" + config.name);
    Log.d(TAG_LOG, "->createOpenHelper->config.callbacks:" + config.callbacks);
    Log.d(TAG_LOG, "->createOpenHelper->config.requireMigration:" + config.requireMigration);
    return null;
  }

  @NonNull
  @Override
  protected InvalidationTracker createInvalidationTracker() {
    Log.w(TAG_LOG, "->createInvalidationTracker is called.");
    return null;
  }

  @Override
  public void clearAllTables() {
    Log.w(TAG_LOG, "->clearAllTables is called.");
  }


  class WordSupportSQLiteOpenHelper implements SupportSQLiteOpenHelper {

    @Override
    public String getDatabaseName() {
      return null;
    }

    @Override
    public void setWriteAheadLoggingEnabled(boolean enabled) {

    }

    @Override
    public SupportSQLiteDatabase getWritableDatabase() {
      return null;
    }

    @Override
    public SupportSQLiteDatabase getReadableDatabase() {
      return null;
    }

    @Override
    public void close() {

    }
  }

}
