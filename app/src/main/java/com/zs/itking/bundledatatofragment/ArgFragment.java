package com.zs.itking.bundledatatofragment;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

/**
 * created by on 2021/11/3
 * 描述：
 *
 * @author ZSAndroid
 * @create 2021-11-03-14:44
 */
public class ArgFragment extends Fragment {

    private TextView text;

    public ArgFragment() {
    }

    public static ArgFragment getInstance(String key,String value) {
        ArgFragment fragment = new ArgFragment();
        Bundle args = new Bundle();
        args.putString(key, value);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_arg, container, false);
        text = (TextView) view.findViewById(R.id.text);
        if (getArguments()!=null){
            text.setText(getArguments().getString("data"));
        }
        return view;
    }
}
