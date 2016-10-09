package psalms.two;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.AutoCompleteTextView;

public class MainActivity extends AppCompatActivity {



    Databasehelper db= new Databasehelper(MainActivity.this);


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AutoCompleteTextView txtview= (AutoCompleteTextView)findViewById(R.id.auct1);

        db.deleteAllItems();

        db.insertData("Hp Printer");
        db.insertData("Amazon computer");
        db.insertData("Accexel databasse");


        String[] strings=db.SelectAllData();



        ArrayAdapter<String> arrayAdapter=new ArrayAdapter<String>(MainActivity.this,R.layout.text_view, strings);

        txtview.setAdapter(arrayAdapter);
        txtview.setThreshold(2);






    }
}
