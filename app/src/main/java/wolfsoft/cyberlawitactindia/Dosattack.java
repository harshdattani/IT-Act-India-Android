package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Dosattack extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("DOS Attack or DDOS Attack");
        crimedetails.setText("Important service offered by a Web site or a server is denied or disrupted thereby causing loss to the intended users of the service. DOS attacks forces the web sites to temporarily cease operation.");
        sec.setText("Section 66 ITAA 2008 – up to 3 years imprisonment or fine up to 5 Lakh Rupees or both.\nSection 43 ITAA 2008 - penalty and campensation for damage to computer,computer system, or computer network. \nSection 66F of ITAA 2008 – life imprisonment.");
    }
}
