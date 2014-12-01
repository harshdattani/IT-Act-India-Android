package wolfsoft.cyberlawitactindia;

import android.content.Intent;
import android.support.v7.app.ActionBarActivity;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;


public class MainActivity extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button regstr = (Button) this.findViewById(R.id.cybercrime);
        Button glossary = (Button) findViewById(R.id.glossary);
        Button about = (Button) findViewById(R.id.about);
        regstr.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, Cybercrime.class);
                startActivity(intent);

            }

        });
        glossary.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, Definations.class);
                startActivity(intent);

            }

        });
        about.setOnClickListener(new View.OnClickListener() {


            public void onClick(View arg0) {
                Intent intent = new Intent(MainActivity.this, About.class);
                startActivity(intent);

            }

        });
    }



}
