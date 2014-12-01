package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Emailthreatening extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("E-mail threatening");
        crimedetails.setText("E-mail threatening means sending threatening messages by E-mail. Threatening aims to cause someone feel vulnerable or at risk.");
        sec.setText("Section 66A of ITAA 2008 – up to 3 years imprisonment and fine. \n \nSection 504 IPC – up to 2 years or fine or both.");
    }
}
