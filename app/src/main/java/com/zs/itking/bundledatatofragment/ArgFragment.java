package com.zs.itking.bundledatatofragment;


import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

import androidx.fragment.app.Fragment;

/**
 * created by on 2021/11/3
 * 描述：
 *
 * @author ZSAndroid
 * @create 2021-11-03-14:44
 */
public class ArgFragment extends Fragment {

    private TextView text;
    private Button btn_put_other;

    public ArgFragment() {
    }

    public static ArgFragment getInstance(String key, String value) {
        ArgFragment fragment = new ArgFragment();
        Bundle args = new Bundle();
        args.putString(key, value);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_arg, container, false);
        initView(view);
        initData();
        setListener();
        return view;
    }

    /**
     * 初始化控件
     *
     * @param view
     */
    private void initView(View view) {
        text = view.findViewById(R.id.text);
        btn_put_other = view.findViewById(R.id.btn_put_other);
    }

    /**
     * 初始化数据
     */
    private void initData() {
        //设置MainActivity传来的数据
        if (getArguments() != null) {
            text.setText(getArguments().getString("data"));
        }
    }

    private void setListener() {
        btn_put_other.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                ((MainActivity) getActivity()).setData("我是ArgFragment传递的数据");
                getActivity().getSupportFragmentManager().beginTransaction().replace(R.id.layout_fragment, OtherFragment.getInstance()).commit();
            }
        });
    }
}
