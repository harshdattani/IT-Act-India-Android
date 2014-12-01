package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Datamodification extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("Data Modification");
        crimedetails.setText("In this crime, the criminal gains entry into the targeted system like financial systems and modifies or changes the data contained in a computer system.");
        sec.setText("Section 66 ITAA 2008 – up to 3 years imprisonment or fine up to 5 Lakh Rupees or both.");
    }
}
