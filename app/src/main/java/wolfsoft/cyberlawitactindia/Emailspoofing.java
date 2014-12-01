package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Emailspoofing extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("Email-Spoofing");
        crimedetails.setText("In Email-Spoofing, the attacker masquerades the email address so as to create an impression that they are originating from someone else’s address.");
        sec.setText("Section 66C of ITAA 2008 – up to 3 years imprisonment and fine up to 1 Lakh Rupees. \n \nSection 465 IPC – up to 2 years imprisonment or fine or both.\nSection 468 IPC – up to 7 years imprisonment or fine or both");
    }
}
