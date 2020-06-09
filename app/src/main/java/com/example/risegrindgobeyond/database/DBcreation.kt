package com.example.risegrindgobeyond.database

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class DBcreation(context: Context?):
    SQLiteOpenHelper(context, DB_NAME, null, DB_VERSION) {

    val challenge_table = "CREATE TABLE ${DatabaseColumns.Table_Name}(${DatabaseColumns})"
    override fun onCreate(db: SQLiteDatabase?) {

    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {
    }
    companion object{
        const val DB_NAME = "challenge.db"
        const val DB_VERSION = 1
    }

}