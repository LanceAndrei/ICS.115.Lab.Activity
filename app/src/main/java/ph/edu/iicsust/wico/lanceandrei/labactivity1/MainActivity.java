package ph.edu.iicsust.wico.lanceandrei.labactivity1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button pressMeSenpai = (Button) findViewById(R.id.pressMeSenpai);

        pressMeSenpai.setOnClickListener(new View.OnClickListener(){
            @Override
            public void onClick(View v) {

                EditText inputEditText1 =  (EditText) findViewById(R.id.inputText);
                TextView resultTextView = (TextView) findViewById(R.id.result);

                int firstNum = Integer.parseInt(inputEditText1.getText().toString());
                int p = firstNum;
                int x = 0;

                String DaResult = "";

                //ERROR_AREA_WIP
                while(x != 10){

                    if(p % 2 == 0){

                        DaResult = DaResult + (p + ", ");
                        x++;
                        p++;

                    }//END_OF_IF

                    p++;

                }//END_OF_WHILE

                resultTextView.setText(DaResult + "");

            }
        });

    }


}
