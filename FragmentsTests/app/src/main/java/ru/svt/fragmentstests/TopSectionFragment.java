package ru.svt.fragmentstests;

import android.app.Activity;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

public class TopSectionFragment extends Fragment
{

    private static EditText topTextInput;
    private static EditText bottomTextInput;

    TopSectionListener activityCommander;

    public static interface TopSectionListener
    {
        public void createMem(String top, String bottom);
    }

    @Override
    public void onAttach(Activity activity)
    {
        super.onAttach(activity);

        try
        {
            activityCommander = (TopSectionListener)activity;

        }catch (ClassCastException e )
        {
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState)
    {
        View view = inflater.inflate(R.layout.top_fragment,container,false);

        topTextInput = (EditText)view.findViewById(R.id.topTextInputField);
        bottomTextInput = (EditText)view.findViewById(R.id.bottomTextInputField);

        Button button = (Button)view.findViewById(R.id.top_fragment_button);

        button.setOnClickListener(new Button.OnClickListener(){
            @Override
            public void onClick(View v)
            {
                buttonCliecked(v);
            }
        });

        return view;
    }

    public void buttonCliecked(View v )
    {

        activityCommander.createMem(topTextInput.getText().toString(),bottomTextInput.getText().toString());
    }
}
