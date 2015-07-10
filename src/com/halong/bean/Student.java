package com.halong.bean;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.widget.ImageView;

public class Student {
	// ѧ��id
	public String id;
//	ѧ���ֻ����
	public String phone;
	// ѧ������
	public String password;
	// ΢��
	public String wechat;
	// QQ��
	public String QQ;
	// ѧУ
	public String school;
	// ����
	public String grade;
	// �ǳ�
	public String nickName;
	// ͷ���ַ
	public String headUri;
	// ͷ�񱾵ص�ַ
	public String headFild;
	// ���
	public String points;
	// ��ע��ʦId
	public List<String> attentionId;
	// ���˼��
	public String profile;

	public static Student JsonObjecttoActivityInfo(JSONObject obj) {
		if (obj == null) {
			return null;
		}
		Student activityInfo = new Student();
		if (!obj.isNull("id")) {
			activityInfo.id = obj.optString("id");
		}
		if (!obj.isNull("phone")) {
			activityInfo.phone = obj.optString("phone");
		}
		if (!obj.isNull("password")) {
			activityInfo.password = obj.optString("password");
		}
		if (!obj.isNull("wechat")) {
			activityInfo.wechat = obj.optString("wechat");
		}
		if (!obj.isNull("QQ")) {
			activityInfo.QQ = obj.optString("QQ");
		}
		if (!obj.isNull("school")) {
			activityInfo.school = obj.optString("school");
		}
		if (!obj.isNull("grade")) {
			activityInfo.grade = obj.optString("grade");
		}
		if (!obj.isNull("nickName")) {
			activityInfo.nickName = obj.optString("nickName");
		}
		if (!obj.isNull("headUri")) {
			activityInfo.headUri = obj.optString("headUri");
		}
		if (!obj.isNull("headFild")) {
			activityInfo.headFild = obj.optString("headFild");
		}
		if (!obj.isNull("points")) {
			activityInfo.points = obj.optString("points");
		}
		if (!obj.isNull("attentionId")) {
			// Student.getList(obj.optString("Id"),
			// obj.optString("attentionId"));
			try {
				
				JSONArray jsonArray = new JSONArray("attentionId");
				for (int i = 0; i < jsonArray.length(); i++) {
					String msg = jsonArray.optString(i);					
					activityInfo.attentionId.add(msg);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		if (!obj.isNull("profile")) {
			activityInfo.profile = obj.optString("profile");
		}

		return activityInfo;
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
