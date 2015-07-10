package com.halong.bean;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.widget.ImageView;

public class Teacher {
	// ��ʦid
	public String id;
	//��ʦ�ֻ����
	public String phone;
	// ��ʦ����
	public String password;
	// ΢��
	public String wechat;
	// QQ��
	public String QQ;
	// ѧУ
	public String school;
	//��ʦ�����꼶
	public String grade;
	// �ǳ�
	public String nickName;
	// ͷ���ַ
	public String headUri;
	// ͷ�񱾵ص�ַ
	public String headFild;
	// ������
	public String zanNum;
	// ��ע��
	public String attentionNum;
	//�Ƿ��Ѿ���ע
	public boolean isAttention;
	//ѧ��
	public String subject;
	// ���˼��
	public String profile;

	public static Teacher JsonObjecttoActivityInfo(JSONObject obj) {
		if (obj == null) {
			return null;
		}
		Teacher teacherInfo = new Teacher();
		if (!obj.isNull("id")) {
			teacherInfo.id = obj.optString("id");
		}if (!obj.isNull("phone")) {
			teacherInfo.phone = obj.optString("phone");
		}
		if (!obj.isNull("password")) {
			teacherInfo.password = obj.optString("password");
		}
		if (!obj.isNull("wechat")) {
			teacherInfo.wechat = obj.optString("wechat");
		}
		if (!obj.isNull("QQ")) {
			teacherInfo.QQ = obj.optString("QQ");
		}
		if (!obj.isNull("school")) {
			teacherInfo.school = obj.optString("school");
		}
		if (!obj.isNull("grade")) {
			teacherInfo.grade = obj.optString("grade");
		}
		if (!obj.isNull("nickName")) {
			teacherInfo.nickName = obj.optString("nickName");
		}
		if (!obj.isNull("headUri")) {
			teacherInfo.headUri = obj.optString("headUri");
		}
		if (!obj.isNull("headFild")) {
			teacherInfo.headFild = obj.optString("headFild");
		}
		if (!obj.isNull("zanNum")) {
			teacherInfo.zanNum = obj.optString("zanNum");
		}
		if (!obj.isNull("attentionNum")) {
			teacherInfo.attentionNum = obj.optString("attentionNum");
		}
		if (!obj.isNull("profile")) {
			teacherInfo.profile = obj.optString("profile");
		}
		if (!obj.isNull("subject")) {
			teacherInfo.subject = obj.optString("subject");
		}
		if (!obj.isNull("profile")) {
			teacherInfo.profile = obj.optString("profile");
		}
		if (!obj.isNull("isAttention")) {
			teacherInfo.isAttention=obj.optBoolean("isAttention");
		}

		return teacherInfo;
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
