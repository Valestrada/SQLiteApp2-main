package com.example.sqliteapp2

import android.content.Context
import android.database.sqlite.SQLiteDatabase
import android.database.sqlite.SQLiteOpenHelper

class AdminSQLite
    (context: Context?,
     name:String?,
     factory:SQLiteDatabase.CursorFactory?,
     version:Int):SQLiteOpenHelper(context,name,factory,version) {
    override fun onCreate(baseDeDatos: SQLiteDatabase?) {
        baseDeDatos?.execSQL("create table articulos" +
                "(codigo int primary key, descripcion text,precio real)")
    }

    override fun onUpgrade(db: SQLiteDatabase?, oldVersion: Int, newVersion: Int) {

    }

}