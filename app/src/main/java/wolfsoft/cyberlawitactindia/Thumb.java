package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Thumb extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("Computer Hardware Theft");
        crimedetails.setText("Thumb Impression is used to authenticate anyone using biometric technology. Misuse of Biometric Thumb impression for any fraudulent purpose is considered as a crime in IT Act.");
        sec.setText("Section 66C of ITAA 2008 – up to 3 years imprisonment and fine up to 1 Lakh Rupees.");
    }
}
