package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Identitytheft extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("Identity theft");
        crimedetails.setText("It is  the theft of sensitive identity information such as date of birth, name, PAN numbers, passport numbers, credit card numbers, e-mail accounts etc., for fraudulent purposes. The user may obtain information using phishing, social engineering, key-loggers or similar methods.");
        sec.setText("Section 66C of ITAA 2008 – up to 3 years imprisonment and fine up to 1 Lakh Rupees. \nSection 66D of ITAA 2008 – up to 3 years imprisonment and fine up to 1 lakh Rupees \n \nSection 417A IPC – up to 3 years imprisonment and a fine up to 1 lakh Rupees. \nSection 419A IPC – up to 5 years imprisonment and a fine.");
    }
}
