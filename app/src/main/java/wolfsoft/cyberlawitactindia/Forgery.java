package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Forgery extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("Forgery for Cheating");
        crimedetails.setText("Committing forgery of documents or Electronic Record for the purpose of cheating, shall be considered as the crime.");
        sec.setText("Section 66D of ITAA 2008 – up to 3 years imprisonment and fine up to 1 lakh Rupees. \n\nSection 468 IPC – up to 7 years imprisonment and fine");
    }
}
