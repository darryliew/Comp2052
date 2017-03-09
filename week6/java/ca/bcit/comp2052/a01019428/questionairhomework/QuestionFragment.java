package ca.bcit.comp2052.a01019428.questionairhomework;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

public class QuestionFragment extends Fragment {

    public QuestionFragment() {
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        View fragmentView = inflater.inflate(R.layout.questions, container, false);
        final int fragmentNumber = getArguments().getInt("position");

//        RadioGroup radioGroup = (RadioGroup) fragmentView(R.id.ra);
//        RadioButton checkedButton = ((RadioButton)findViewById(radioGroup.getCheckedRadioButtonId() ))

        return fragmentView;
    }
}
