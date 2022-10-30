package com.example.unitconverter;

import android.os.Bundle;

import androidx.fragment.app.Fragment;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.TextView;
import android.widget.Toast;


public class fragone extends Fragment {

    View view;
    Button button;
    Spinner spinner,spinner2;
    EditText text1;
    TextView text2;
    String finalres;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {

        String [] values={"kms","m","cm","mm","ft","inch"};
        view = inflater.inflate(R.layout.fragment_fragone, container, false);

        spinner= view.findViewById(R.id.spinner);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,values);
        adapter.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner.setAdapter(adapter);

        spinner2= view.findViewById(R.id.spinner2);
        ArrayAdapter<String> adapter2 = new ArrayAdapter<String>(getActivity(), android.R.layout.simple_spinner_item,values);
        adapter2.setDropDownViewResource(android.R.layout.simple_dropdown_item_1line);
        spinner2.setAdapter(adapter2);

        text1=view.findViewById(R.id.text1);
        text2=view.findViewById(R.id.text2);
        button=view.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String val= spinner.getSelectedItem().toString();
                String val2=spinner2.getSelectedItem().toString();

                Double num1 = 0.0;
                final String myStr = text1.getText().toString();
                if (!myStr.isEmpty())
                {
                    num1 = Double.parseDouble(myStr);
                }
                else
                {
                    Toast.makeText(getActivity(), "Please enter a value", Toast.LENGTH_SHORT).show();
                }
                if(val.equals("kms")&& val2.equals("kms")){

                    double n= num1;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("m")&& val2.equals("m")){
                    double n= num1;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("mm")&& val2.equals("mm")){
                    double n= num1;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("ft")&& val2.equals("ft")){
                    double n= num1;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("inch")&& val2.equals("inch")){
                    double n= num1;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("cm")&& val2.equals("cm")){
                    double n= num1;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("kms")&& val2.equals("m")){
                    double n= num1*1000;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("m")&& val2.equals("kms")){
                    double n= num1/1000;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("kms")&& val2.equals("cm")){
                    double n= num1*100000;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("cm")&& val2.equals("kms")){
                    double n= num1/100000;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("kms")&& val2.equals("mm")){
                    double n= num1*1000000;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("mm")&& val2.equals("kms")){
                    double n= num1/1000000;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("kms")&& val2.equals("ft")){
                    double n= num1*3280.84;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("ft")&& val2.equals("kms")){
                    double n= num1/3280.84;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }

                if(val.equals("kms")&& val2.equals("inch")){
                    double n= num1*39370.1;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("inch")&& val2.equals("kms")){
                    double n= num1/39370.1;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("m")&& val2.equals("cm")){
                    double n= num1*100;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("cm")&& val2.equals("m")){
                    double n= num1/100;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("m")&& val2.equals("mm")){
                    double n= num1*1000;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("mm")&& val2.equals("m")){
                    double n= num1/1000;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("m")&& val2.equals("ft")){
                    double n= num1*3.2808;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("ft")&& val2.equals("m")){
                    double n= num1/3.2808;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("m")&& val2.equals("inch")){
                    double n= num1*39.3701;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("inch")&& val2.equals("m")){
                    double n= num1/39.3701;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("cm")&& val2.equals("mm")){
                    double n= num1*10;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("mm")&& val2.equals("cm")){
                    double n= num1/10;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("cm")&& val2.equals("ft")){
                    double n= num1*0.0328;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("ft")&& val2.equals("cm")){
                    double n= num1/0.0328;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("cm")&& val2.equals("inch")){
                    double n= num1*0.3937;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("inch")&& val2.equals("cm")){
                    double n= num1/0.3937;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("mm")&& val2.equals("ft")){
                    double n= num1*0.00328;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("ft")&& val2.equals("mm")){
                    double n= num1/0.00328;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("mm")&& val2.equals("inch")){
                    double n= num1*0.0393;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("inch")&& val2.equals("mm")){
                    double n= num1/0.0393;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("ft")&& val2.equals("inch")){
                    double n= num1*12;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }
                if(val.equals("inch")&& val2.equals("ft")){
                    double n= num1/12;
                    finalres=Double.valueOf(n).toString();
                    text2.setText(String.valueOf(n));
                }


                //Toast.makeText(getActivity(), val, Toast.LENGTH_SHORT).show();

            }
        });

        return view;

    }
}