package com.halong.jwd.mytopic;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.halong.jwd.R;

public class TopicFragment extends  Fragment{
	public static View view;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.fragment_topic, container, false);
		init();
		return view;
	}

	private void init() {
		// TODO Auto-generated method stub
		
	}

}
