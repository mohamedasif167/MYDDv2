package asif167.wordpress.com.myddv2;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class AcceptAct extends AppCompatActivity {

    Button btnReject, btnAccept;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_accept);

        btnAccept = (Button) findViewById(R.id.btnAccept);
        btnReject = (Button) findViewById(R.id.btnReject);

        btnAccept.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getBaseContext(),WorkerListView.class);
                Toast.makeText(AcceptAct.this, "You have successfully accepted the job", Toast.LENGTH_SHORT).show();
                startActivity(intent);
            }
        });

        btnReject.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Toast.makeText(AcceptAct.this, "You have successfully rejected the job", Toast.LENGTH_SHORT).show();
                finish();
            }
        });

    }
}
