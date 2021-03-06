package com.example.awesomefat.csc548_spring2018_numberconverter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity
{
    //made a change
    
    private TextView bitsTV;
    private TextView KbitsTV;
    private TextView MbitsTV;
    private TextView GbitsTV;
    private TextView TbitsTV;
    private TextView bytesTV;
    private TextView KbytesTV;
    private TextView MbytesTV;
    private TextView GbytesTV;
    private TextView TbytesTV;
    private EditText mbET;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        this.setContentView(R.layout.activity_main);

        this.bitsTV = (TextView)this.findViewById(R.id.bitsTV);
        this.KbitsTV = (TextView)this.findViewById(R.id.KbitsTV);
        this.MbitsTV = (TextView)this.findViewById(R.id.MbitsTV);
        this.GbitsTV = (TextView)this.findViewById(R.id.GbitsTV);
        this.TbitsTV = (TextView)this.findViewById(R.id.TbitsTV);
        this.bytesTV = (TextView)this.findViewById(R.id.bytesTV);
        this.KbytesTV = (TextView)this.findViewById(R.id.KbytesTV);
        this.MbytesTV = (TextView)this.findViewById(R.id.MbytesTV);
        this.GbytesTV = (TextView)this.findViewById(R.id.GbytesTV);
        this.TbytesTV = (TextView)this.findViewById(R.id.TbytesTV);
        this.mbET = (EditText)this.findViewById(R.id.mbET);
    }

    public void clickMeButtonPressed(View v)
    {
        String sValue = this.mbET.getText().toString();
        double iValue = Double.parseDouble(sValue);
        this.bitsTV.setText("Bits = " + (iValue * 8388608));
        this.KbitsTV.setText("Kilobits = " + (iValue * 8192));
        this.MbitsTV.setText("Megabits = " + (iValue * 8));
        this.GbitsTV.setText("Gigabits = " + (iValue * 0.0078125));
        this.TbitsTV.setText("Terabits = " + (iValue * 0.00000762939));
        this.bytesTV.setText("Bytes = " + (iValue * 1048576));
        this.KbytesTV.setText("Kilobytes = " + (iValue * 1024));
        this.MbytesTV.setText("Megabytes = " + (iValue));
        this.GbytesTV.setText("Gigabytes = " + (iValue * 0.0009765625));
        this.TbytesTV.setText("Terabytes = " + (iValue * 9.53674316E-7));

    }

}
