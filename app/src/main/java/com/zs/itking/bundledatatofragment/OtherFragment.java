package com.zs.itking.bundledatatofragment;

import android.app.Activity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

/**
 * created by on 2021/11/3
 * 描述：
 *
 * @author ZSAndroid
 * @create 2021-11-03-17:46
 */
public class OtherFragment extends Fragment {

    private String str;

    public OtherFragment() {
    }

    public static OtherFragment getInstance() {
        return new OtherFragment();
    }

    @Override
    public void onAttach(@NonNull Activity activity) {
        super.onAttach(activity);
        str = ((MainActivity) getActivity()).getData();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_other, container, false);
        TextView text_other = view.findViewById(R.id.text_other);
        text_other.setText(str);
        return view;
    }
}

