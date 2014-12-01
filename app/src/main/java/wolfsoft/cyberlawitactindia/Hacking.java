package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Hacking extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("Hacking");
        crimedetails.setText("Hacking in broader term can be said as gaining entry into a computer system without the permission, with an intention to cause loss, steal or destroy the data contained in it.");
        sec.setText("Section 66 ITAA 2008 – up to 3 years imprisonment or fine up to 5 Lakh Rupees or both.");
    }
}
