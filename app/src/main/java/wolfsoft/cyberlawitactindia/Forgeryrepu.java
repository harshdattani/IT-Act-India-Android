package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Forgeryrepu extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("Forgery for Reputation Harming");
        crimedetails.setText("Committing forgery of the document or Electronic Record that shall harm the reputation of any party is liable for this crime.");
        sec.setText("Section 66D of ITAA 2008 – up to 3 years imprisonment and fine up to 1 lakh Rupees. \n\nSection 469 IPC – up to 3 years imprisonment and fine.");
    }
}
