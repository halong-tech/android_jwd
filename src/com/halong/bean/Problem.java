package com.halong.bean;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.widget.ImageView;

public class Problem {
	//����id
	public String id;
	//	������Id
	public String StudentId;
//	�ش��ʱ��
	public String time;
	// ��������
	public String main;
	// �����
	public String see;
	// ������
	public String zan;
	// �Ƿ��Ѿ����
	public boolean isAnswer;
	// �����
	public String answer;
	//�Ƿ��Ѿ���ע
	public boolean isAttention;
	public static Problem JsonObjecttoActivityInfo(JSONObject obj) {
		if (obj == null) {
			return null;
		}
		Problem problemInfo = new Problem();
		if (!obj.isNull("id")) {
			problemInfo.id = obj.optString("id");
		}
		if (!obj.isNull("StudentId")) {
			problemInfo.StudentId = obj.optString("StudentId");
		}
		if (!obj.isNull("main")) {
			problemInfo.main = obj.optString("main");
		}
		if (!obj.isNull("see")) {
			problemInfo.see = obj.optString("see");
		}
		if (!obj.isNull("zan")) {
			problemInfo.zan = obj.optString("zan");
		}
		if (!obj.isNull("time")) {
			problemInfo.time = obj.optString("time");
		}
		if (!obj.isNull("isAnswer")) {
			problemInfo.isAnswer = obj.optBoolean("isAnswer");
		}
		if (!obj.isNull("answer")) {
			problemInfo.answer = obj.optString("answer");
		}
		if (!obj.isNull("isAttention")) {
			problemInfo.isAttention = obj.optBoolean("isAttention");
		}
		return problemInfo;
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
