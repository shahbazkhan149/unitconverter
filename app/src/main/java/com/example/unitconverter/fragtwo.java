package com.example.unitconverter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class fragtwo extends Fragment {

    View view;
    Spinner spinner3,spinner4;
    EditText text3;
    TextView text4;
    Button button2;
    String finalres;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {



        String [] values={"Kgs","grams","pounds"};
        view = inflater.inflate(R.layout.fragment_fragtwo, container, false);
        spinner3= view.findViewById(R.id.spinner3);

        ArrayAdapter<String> adapter3 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item, values);
        adapter3.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner3.setAdapter(adapter3);

        spinner4= view.findViewById(R.id.spinner4);
        ArrayAdapter<String> adapter4 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,values);
        adapter4.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner4.setAdapter(adapter4);

        text3=view.findViewById(R.id.text3);
        text4=view.findViewById(R.id.text4);
        button2=view.findViewById(R.id.button2);

        button2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val3= spinner3.getSelectedItem().toString();
                String val4=spinner4.getSelectedItem().toString();
                Double num1 = 0.0;
                final String myStr = text3.getText().toString();
                if (!myStr.isEmpty())
                {
                    num1 = Double.parseDouble(myStr);
                }
                else
                {
                    Toast.makeText(getActivity(), "Please enter a value", Toast.LENGTH_SHORT).show();
                }
                if(val3.equals("Kgs")&& val4.equals("Kgs")){
                    double n= num1;
                    finalres=Double.valueOf(n).toString();
                    text4.setText(String.valueOf(n));
                }
                if(val3.equals("grams")&& val4.equals("grams")){
                    double n= num1;
                    finalres=Double.valueOf(n).toString();
                    text4.setText(String.valueOf(n));
                }
                if(val3.equals("pounds")&& val4.equals("pounds")){
                    double n= num1;
                    finalres=Double.valueOf(n).toString();
                    text4.setText(String.valueOf(n));
                }
                if(val3.equals("Kgs")&& val4.equals("grams")){
                    double n= num1*1000;
                    finalres=Double.valueOf(n).toString();
                    text4.setText(String.valueOf(n));
                }
                if(val3.equals("grams")&& val4.equals("Kgs")){
                    double n= num1/1000;
                    finalres=Double.valueOf(n).toString();
                    text4.setText(String.valueOf(n));
                }
                if(val3.equals("Kgs")&& val4.equals("pounds")){
                    double n= num1*2.20462;
                    finalres=Double.valueOf(n).toString();
                    text4.setText(String.valueOf(n));
                }
                if(val3.equals("pounds")&& val4.equals("Kgs")){
                    double n= num1/2.20462;
                    finalres=Double.valueOf(n).toString();
                    text4.setText(String.valueOf(n));
                }
                if(val3.equals("pounds")&& val4.equals("grams")){
                    double n= num1*453.592;
                    finalres=Double.valueOf(n).toString();
                    text4.setText(String.valueOf(n));
                }
                if(val3.equals("grams")&& val4.equals("pounds")){
                    double n= num1/453.592;
                    finalres=Double.valueOf(n).toString();
                    text4.setText(String.valueOf(n));
                }



                //Toast.makeText(getActivity(), val, Toast.LENGTH_SHORT).show();

            }
        });



        return view;
    }
}