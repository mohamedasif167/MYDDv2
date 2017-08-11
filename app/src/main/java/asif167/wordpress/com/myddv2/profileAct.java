package asif167.wordpress.com.myddv2;

import android.app.Notification;
import android.app.NotificationManager;
import android.app.PendingIntent;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListView;

import java.util.ArrayList;

public class profileAct extends AppCompatActivity {

    ListView lv;
    ArrayList<String> ToDoList=new ArrayList<String>();
    ArrayAdapter<String> aaToDo;
    Button btnEmploy;
    int requestCode = 123456;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        lv = (ListView) findViewById(R.id.lv);

        String item1 = "McDonalds Cleaner";
        String item2 = "KFC Cleaner";

        ToDoList.add(item1);
        ToDoList.add(item2);

        aaToDo=new ArrayAdapter<String>(this,android.R.layout.simple_list_item_1,ToDoList);

        lv.setAdapter(aaToDo);

        btnEmploy = (Button) findViewById(R.id.btnEmploy);
        btnEmploy.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(profileAct.this,Main2Activity.class);

                PendingIntent pIntent = PendingIntent.getActivity(profileAct.this,requestCode,intent,PendingIntent.FLAG_CANCEL_CURRENT);

                Notification.BigTextStyle bigText = new Notification.BigTextStyle();
                bigText.bigText("Accept");
                bigText.setBigContentTitle("A job near you");
                bigText.setSummaryText("Reflection Journal?");

                //Building Notification
                Notification.Builder builder = new Notification.Builder(profileAct.this);
                builder.setContentTitle("Amazing Offer!");
                builder.setContentText("Subject");
                builder.setSmallIcon(R.mipmap.ic_launcher);
                builder.setStyle(bigText);
                builder.setContentIntent(pIntent);
                builder.setAutoCancel(true);

                Notification n = builder.build();
                NotificationManager notificationManager = (NotificationManager) getSystemService(NOTIFICATION_SERVICE);

                //A good to have ID, in case if i want to cancel it
                // Programatically later on
                notificationManager.notify(123456,n);
                finish();

            }
        });

    }
}
