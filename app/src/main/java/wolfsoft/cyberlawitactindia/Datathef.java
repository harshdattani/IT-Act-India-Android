package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Datathef extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("Data Theft");
        crimedetails.setText("Data theft is copying the data without the permission of the owner of the computer/computer system/computer network.");
        sec.setText("Section 66 ITAA 2008 – up to 3 years imprisonment or fine up to 5 Lakh Rupees or both. \n \nSection 379 IPC – up to 3 years imprisonment or fine or both.");
    }
}
