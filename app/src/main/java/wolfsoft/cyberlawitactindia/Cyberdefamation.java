package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Cyberdefamation extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("Cyber Defamation");
        crimedetails.setText("Cyber Defamation occurs when defamation takes place with the help of computers and / or the Internet.");
        sec.setText("Section 66A of ITAA 2008 – up to 3 years imprisonment and fine. \n\nSection 500 IPC – up to 2 years imprisonment or fine or both\nSection 509 IPC – up to 1 year imprisonment or with a fine or both");
    }
}
