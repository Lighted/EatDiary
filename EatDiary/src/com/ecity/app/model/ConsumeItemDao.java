package com.ecity.app.model;

import java.util.ArrayList;
import java.util.List;

import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;

public class ConsumeItemDao {
	// create table if not exists consumeItem
	// (id primary key autoincrement,time text,addtime text,total numberic,mark
	// text)

	private SQLiteDatabase db;

	/**
	 * 创建一个新的实例 ConsumeItemDao.
	 * 
	 * @param db
	 */

	public ConsumeItemDao(SQLiteDatabase db) {
		super();
		this.db = db;
	}

	public void insert(ConsumeItem item) {
		if (null == item) {
			return;

		}
		String time = item.getTime();
		double total = item.getTotal();
		String mark = item.getMark();
		String addTime = item.getAddTime();
		String insertSql = "insert into consumeItem (time,addtime,total,mark) values("
				+ time + "," + addTime + "," + total + "," + mark + ")";
		db.execSQL(insertSql);

	}

	public void delete(ConsumeItem item) {

		if (null == item) {
			return;

		}
		int id = item.getId();
		String deleteSql = "delete from consumeItem where id=" + id;
		db.execSQL(deleteSql);

	}

	public void update(ConsumeItem item) {

		if (null == item) {
			return;

		}
		int id = item.getId();
		String sql = "update consumeItem set time =" + item.getTime()
				+ ",addtime=" + item.getAddTime() + ",total=" + item.getTotal()
				+ ",mark=" + item.getMark() + " where id=" + id;

		db.execSQL(sql);

	}

	public List<ConsumeItem> queryAll(String orderBy, String where) {
		String queryStr = "select * from consumeItem where" + where
				+ "order by " + orderBy;
		Cursor cursor = db.rawQuery(queryStr, null);
		List<ConsumeItem> consumeItems = new ArrayList<ConsumeItem>();
		ConsumeItem item = null;
		while (cursor.moveToNext()) {

			int id = cursor.getInt(cursor.getColumnIndex("id"));
			String time = cursor.getString(cursor.getColumnIndex("time"));
			String addTime = cursor.getString(cursor.getColumnIndex("addtime"));
			double total = cursor.getDouble(cursor.getColumnIndex("addtime"));
			String mark = cursor.getString(cursor.getColumnIndex("mark"));
			item = new ConsumeItem(id, time, addTime, total, mark);
			consumeItems.add(item);
		}
		return consumeItems;

	}

}
