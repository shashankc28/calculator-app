package com.shashankchamoli.calculator;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    //int num[]=new int[20];
    //String opp[] = new String[10];
   // int oppn=0,numn=0;
    String userinp="";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void claculate(View v)
    {

        switch (v.getId()) {
            case R.id.button1:
               userinp+="1";
                break;
            case R.id.button2:
                userinp+="2";
                break;
            case R.id.button3:
                userinp+="3";
                break;
            case R.id.button4:
                userinp+="4";
                break;
            case R.id.button5:
                userinp+="5";
                break;
            case R.id.button6:
                userinp+="6";
                break;
            case R.id.button7:
                userinp+="7";
                break;
            case R.id.button8:
                userinp+="8";
                break;
            case R.id.button9:
                userinp+="9";
                break;
            case R.id.button0:
                userinp+="0";
                break;
            case R.id.buttonDelete: {
                if(userinp=="")
                Toast.makeText(getApplicationContext(), "Please enter a number first", Toast.LENGTH_SHORT).show();
                else
                   userinp=userinp.substring(0,userinp.length()-1);
            }
                break;
            case R.id.buttonDivide:
            {
                char c=userinp.charAt(userinp.length()-1);
                int x=Integer.parseInt(""+c);
                if(!(x>=0&& x<=9)) {
                    Toast.makeText(this, "Please enter a number first", Toast.LENGTH_SHORT).show();
                }
                else
                    userinp+="/";
            }
                break;
            case R.id.buttonDot:
            {
                char c=userinp.charAt(userinp.length()-1);
                int x=Integer.parseInt(""+c);
                if(!(x>=0&& x<=9)) {
                    Toast.makeText(getApplicationContext(), "Please enter a number first", Toast.LENGTH_SHORT).show();
                }
                else
                    userinp+=".";
            }
                break;
            case R.id.buttonMod:
            {
                char c=userinp.charAt(userinp.length()-1);
                int x=Integer.parseInt(""+c);
                if(!(x>=0&& x<=9)) {
                    Toast.makeText(getApplicationContext(), "Please enter a number first", Toast.LENGTH_SHORT).show();
                }
                else
                    userinp+="%";
            }
                break;
            case R.id.buttonMultiply:
            {
                char c=userinp.charAt(userinp.length()-1);
                int x=Integer.parseInt(""+c);
                if(!(x>=0&& x<=9)) {
                    Toast.makeText(getApplicationContext(), "Please enter a number first", Toast.LENGTH_SHORT).show();
                }
                else
                    userinp+="*";
            }
                break;
            case R.id.buttonAC:
                userinp="";
                break;
            case R.id.buttonAdd:
            {
                char c=userinp.charAt(userinp.length()-1);
                int x=Integer.parseInt(""+c);
                if(!(x>=0&& x<=9)) {
                    Toast.makeText(getApplicationContext(), "Please enter a number first", Toast.LENGTH_SHORT).show();
                }
                else
                    userinp+="+";
            }
                break;
            case R.id.buttonSub:
            {

                char c=userinp.charAt(userinp.length()-1);

                if((x>=0 && x<9)) {
                    Toast.makeText(getApplicationContext(), "Please enter a number first", Toast.LENGTH_SHORT).show();
                }
                else
                    userinp+="-";
            }
                break;
            case R.id.buttonEquals:
            {
                char c=userinp.charAt(userinp.length()-1);
                int x=Integer.parseInt(""+c);
                if(!(x>=0&& x<=9)) {
                    Toast.makeText(getApplicationContext(), "Please enter a number first", Toast.LENGTH_SHORT).show();
                }
                else
                    userinp+="/";
            }
                break;

        }
        TextView t=(TextView) findViewById(R.id.textView);
        t.setText(userinp);
    }
}
