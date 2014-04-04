package com.starbaby.diyBook.cache;

import java.util.ArrayList;

import android.content.Context;
import android.database.Cursor;

import com.starbaby.diyBook.utils.JavaBean;
import com.starbaby.diyBook.utils.Utils;

/**
 * 各个分类下书本的缓存1(首页各个分类)
 * @author Administrator
 *
 */
public class GetCoverCache {
	String section;
	Context mContext;
	JavaBean mJavaBean;
	public GetCoverCache(Context mContext,String section,JavaBean mJavaBean){
		this.section = section;
		this.mContext = mContext;
		this.mJavaBean = mJavaBean;
	}
	public boolean getData(){
		Cursor mCursor = Utils.mDBCacheHelper.getbookCache(section);
		mJavaBean.bookCoverList = new ArrayList<String>();
		mJavaBean.bookNameList = new ArrayList<String>();
		mJavaBean.bookIdList = new ArrayList<String>();
		mJavaBean.bookUpdateTime = new ArrayList<String>();
		if(mCursor.getCount() != 0){
			for (int i = 0; i < mCursor.getCount(); i++) {
				mJavaBean.bookCoverList.add(mCursor.getString(mCursor.getColumnIndex("COVER")));
				mJavaBean.bookNameList.add(mCursor.getString(mCursor.getColumnIndex("NAME")));
				mJavaBean.bookIdList.add(mCursor.getString(mCursor.getColumnIndex("ID")));
				mJavaBean.bookUpdateTime.add(mCursor.getString(mCursor.getColumnIndex("TIME")));
				mCursor.moveToNext();
			}
			return true;
		}
		return false;
	}
	
}
