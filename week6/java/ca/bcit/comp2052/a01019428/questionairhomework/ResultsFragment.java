package ca.bcit.comp2052.a01019428.questionairhomework;

import android.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

public class ResultsFragment extends Fragment{

        public static float Question1;
        public static float Question2;
        public static float Question3;

        public ResultsFragment() {
        }

        @Override
        public View onCreateView(LayoutInflater inflater, ViewGroup container,
                                 Bundle savedInstanceState) {
                View fragmentView = inflater.inflate(R.layout.results, container, false);
                Button button1 = (Button) fragmentView.findViewById(R.id.button);
                button1.setOnClickListener(new View.OnClickListener() {
                        public void onClick(View v) {
                                float result =
                                        (Question1 + Question2 + Question3) / 3;
                                Toast.makeText(
                                        getActivity(),
                                        "Correct Answers: " + result,
                                        Toast.LENGTH_SHORT).show();
                        }
                });
                return fragmentView;
        }
}
