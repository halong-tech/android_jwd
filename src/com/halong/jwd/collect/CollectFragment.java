package com.halong.jwd.collect;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.halong.jwd.R;

public class CollectFragment extends  Fragment{
	public static View view;
	@Override
	public View onCreateView(LayoutInflater inflater, ViewGroup container,
			Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		view = inflater.inflate(R.layout.fragment_collect, container, false);
		init();
		return view;
	}

	private void init() {
		// TODO Auto-generated method stub
		
	}

}
