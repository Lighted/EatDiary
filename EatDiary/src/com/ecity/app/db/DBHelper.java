package com.ecity.app.db;

import android.content.ContentValues;
import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class DBHelper {
	private Context mContext;
	private SQLiteDatabase db;
	public static final String DB_NAME = "eatDiary.db";

	public DBHelper(Context context) {
		// TODO Auto-generated constructor stub
		super();
		db = createorOpenDataBase(DB_NAME, Context.MODE_PRIVATE);
		initTables();
	}

	public SQLiteDatabase createorOpenDataBase(String dbName, int mode) {
		// 创建数据库
		SQLiteDatabase db = mContext.openOrCreateDatabase(dbName, mode, null);
		return db;

	}

	public void initTables() {
		try {
			// 小消费记录表
			db.execSQL("create table  if not exists consumeItem (id primary key autoincrement,time text,addtime text,total numberic,mark text)");

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			// 创建用户表
			db.execSQL("create table  if not exists users (id primary key autoincrement,name text)");

		} catch (Exception e) {
			// TODO: handle exception
		}

		try {
			// 创建用户吃饭关系表
			db.execSQL("create table  if not exists takeparts (id primary key autoincrement,itemid int,userid int)");

		} catch (Exception e) {
			// TODO: handle exception
		}
	}

	public int update(String table, ContentValues values, String whereClause,
			String[] whereArgs) {
		return db.update(table, values, whereClause, whereArgs);
	}

	public int updateWithOnConflict(String table, ContentValues values,
			String whereClause, String[] whereArgs, int conflictAlgorithm) {
		return db.updateWithOnConflict(table, values, whereClause, whereArgs,
				conflictAlgorithm);

	}

	public void execSQL(String sql, Object[] bindArgs) {
		db.execSQL(sql, bindArgs);
	}

	public void execSQL(String sql) {
		db.execSQL(sql);
	}

	public long insertWithOnConflict(String table, String nullColumnHack,
			ContentValues initialValues, int conflictAlgorithm) {
		return db.insertWithOnConflict(table, nullColumnHack, initialValues,
				conflictAlgorithm);
	}

	public long insert(String table, String nullColumnHack, ContentValues values) {
		return db.insert(table, nullColumnHack, values);
	}

	public Cursor query(String table, String[] columns, String selection,
			String[] selectionArgs, String groupBy, String having,
			String orderBy, String limit) {
		return db.query(table, columns, selection, selectionArgs, groupBy,
				having, orderBy, limit);
	}

	/**
	 * 此方法描述的是： 通用查询
	 * 
	 * @author: wangliu94@163.com
	 * @version: 2015年7月6日 下午10:03:45
	 */

	public Cursor rawQuery(String sql, String[] selectionArgs) {
		return db.rawQuery(sql, selectionArgs);
	}

}
