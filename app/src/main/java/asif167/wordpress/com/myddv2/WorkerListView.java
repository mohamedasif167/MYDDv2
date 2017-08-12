package asif167.wordpress.com.myddv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.util.ArrayList;

public class WorkerListView extends AppCompatActivity {

    ListView WorkerLV;
    ArrayList<String> ToDoList=new ArrayList<String>();
    ArrayAdapter<String> aaToDo;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_worker_list_view);

        WorkerLV = (ListView) findViewById(R.id.WorkerLV);

        String item1 = "12/08/2017 09.00 PM 10RM/hr";
        String item2 = "12/08/2017 4.00 PM 9.50RM/hr";
        String item3 = "12/08/2017 11.00 PM 9.50RM/hr";

        ToDoList.add(item1);
        ToDoList.add(item2);
        ToDoList.add(item3);


        aaToDo=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ToDoList);
        WorkerLV.setAdapter(aaToDo);

    }

    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }

    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here.
        int id = item.getItemId();

        if(id == R.id.add){
            Intent intent = new Intent(getBaseContext(),WorkerAddAct.class);
            startActivity(intent);
        }

        return super.onOptionsItemSelected(item);
    }



}
