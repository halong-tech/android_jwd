package com.halong.bean;

import java.util.ArrayList;
import java.util.List;

import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

import android.widget.ImageView;

public class Answer {
	// �ش�id
	public String id;
//	������ַ
	public String speechUri;
	// ��Ƶ��ַ
	public String videoUri;
	//��ʦid
	public String techerId;
	// ����id
	public String problemId;
	// �ش��˵�����
	public String techerName;
	// �����
	public String see;
	// ������
	public String zan;
	// �Ƿ����
	public boolean isZan;
	// �Ƿ��ղ�
	public boolean isCollection;
	// ͼƬ��ַ����
	public List<String> imgList;
	public static Answer JsonObjecttoActivityInfo(JSONObject obj) {
		if (obj == null) {
			return null;
		}
		Answer answerInfo = new Answer();
		if (!obj.isNull("id")) {
			answerInfo.id = obj.optString("id");
		}
		if (!obj.isNull("speechUri")) {
			answerInfo.speechUri = obj.optString("speechUri");
		}
		if (!obj.isNull("videoUri")) {
			answerInfo.videoUri = obj.optString("videoUri");
		}
		if (!obj.isNull("techerId")) {
			answerInfo.techerId = obj.optString("techerId");
		}
		if (!obj.isNull("problemId")) {
			answerInfo.problemId = obj.optString("problemId");
		}
		if (!obj.isNull("techerName")) {
			answerInfo.techerName = obj.optString("techerName");
		}
		if (!obj.isNull("see")) {
			answerInfo.see = obj.optString("see");
		}
		if (!obj.isNull("zan")) {
			answerInfo.zan = obj.optString("zan");
		}
		if (!obj.isNull("isZan")) {
			answerInfo.isZan = obj.optBoolean("isZan");
		}
		if (!obj.isNull("isCollection")) {
			answerInfo.isCollection = obj.optBoolean("isCollection");
		}
		if (!obj.isNull("imgList")) {
			// Student.getList(obj.optString("Id"),
			// obj.optString("attentionId"));
			try {
				
				JSONArray jsonArray = new JSONArray("imgList");
				for (int i = 0; i < jsonArray.length(); i++) {
					String msg = jsonArray.optString(i);					
					answerInfo.imgList.add(msg);
				}
			} catch (Exception e) {
				// TODO: handle exception
				e.printStackTrace();
			}
		}
		return answerInfo;
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
