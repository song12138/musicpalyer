package cn.tedu.mediaplayer.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cn.tedu.mediaplayer.R;

/**
 * �����ȸ���б����  Fragment
 */
public class HotMusicListFragment extends Fragment{
	/**
	 * ���������ڷ����������Զ�����
	 * ��viewpager��Ҫ��ȡFragment��view����ʱ
	 */
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_music_list, null);
		return view;
	}
}






