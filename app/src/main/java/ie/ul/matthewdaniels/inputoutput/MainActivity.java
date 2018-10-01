package ie.ul.matthewdaniels.inputoutput;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {


    //set up variables...
    // need to have somewhere to put the user input when we ask for it  so (DataType and Variable name)!
    EditText userInput;
    // need to have somewhere to put the output message!
    TextView userOutput;
    // button place
    Button submitButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

// this is a REFFERENCE to the variable that tells the compiler where to look for a user input and then the place to put it.
     userInput = (EditText)  findViewById(R.id.userInput);
     // this is the refference to variable and the id of  the output TextView ellement
     userOutput = (TextView) findViewById(R.id.userOutput);
     // reference to  the button.
     submitButton = (Button) findViewById(R.id.submitButton);


     submitButton.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {

             userOutput.setText(userInput.getText().toString());
         }
     });



    }



}
