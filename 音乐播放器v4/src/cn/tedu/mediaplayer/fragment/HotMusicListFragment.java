package cn.tedu.mediaplayer.fragment;

import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import cn.tedu.mediaplayer.R;

/**
 * 描述热歌榜列表界面  Fragment
 */
public class HotMusicListFragment extends Fragment{
	/**
	 * 该生命周期方法由容器自动调用
	 * 当viewpager需要获取Fragment的view对象时
	 */
	public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
		View view = inflater.inflate(R.layout.fragment_music_list, null);
		return view;
	}
}






