package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Digitalsignature extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("Digital Signature Misuse");
        crimedetails.setText("A digital signature is basically a way to ensure that an electronic document (e-mail, spreadsheet, text file, etc.) is authentic. Misuse of digital signature for fraudulent purpose is considered as crime.");
        sec.setText("Section 66C of ITAA 2008 – up to 3 years imprisonment and fine up to 1 Lakh Rupees.");
    }
}
