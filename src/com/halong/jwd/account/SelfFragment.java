package com.halong.jwd.account;


import com.halong.jwd.R;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

/**
 * 个人中心界面
 * @author Administrator
 * 
 */
public class SelfFragment extends Fragment{
	public static View view;
		@Override
		public View onCreateView(LayoutInflater inflater, ViewGroup container,
				Bundle savedInstanceState) {
			// TODO Auto-generated method stub
			view = inflater.inflate(R.layout.fragment_self, container, false);
			init();
			return view;
		}

		private void init() {
			// TODO Auto-generated method stub
			
		}
}
