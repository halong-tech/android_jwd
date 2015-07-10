package com.halong.bean;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.widget.ImageView;

public class Comment {
	// ѧ��id
	public String id;
	// �����ش�Id
	public String AnswerId;
	// ����ʱ��
	public String time;
	// ���۵�����
	public String main;
	public static Comment JsonObjecttoActivityInfo(JSONObject obj) {
		if (obj == null) {
			return null;
		}
		Comment commentInfo = new Comment();
		if (!obj.isNull("id")) {
			commentInfo.id = obj.optString("id");
		}
		if (!obj.isNull("AnswerId")) {
			commentInfo.AnswerId = obj.optString("AnswerId");
		}
		if (!obj.isNull("time")) {
			commentInfo.time = obj.optString("time");
		}
		if (!obj.isNull("main")) {
			commentInfo.main = obj.optString("main");
		}
		return commentInfo;
	}
/*
	public static List<String> getList(String key, String jsonString) {
		List<String> list = new ArrayList<String>();
		try {
			JSONObject jsonObject = new JSONObject(jsonString);
			JSONArray jsonArray = jsonObject.getJSONArray(key);
			for (int i = 0; i < jsonArray.length(); i++) {
				String msg = jsonArray.getString(i);
				list.add(msg);
			}
		} catch (JSONException e) {
			e.printStackTrace();
		}
		return list;
	}
	*/
}
