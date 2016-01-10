package ru.svt.fragmentstests;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

public class BottomPictureFragment extends Fragment
{

    public static TextView topView;
    public static TextView bottomView;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.buttom_picture_fragment,container,false);
        topView = (TextView)view.findViewById(R.id.TopTextView);
        bottomView = (TextView)view.findViewById(R.id.BottomTextView);

        return view;
    }

    public void setMemText(String top,String bottom)
    {
        topView.setText(top);
        bottomView.setText(bottom);
    }
}
