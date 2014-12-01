package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Childpornography extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("Child Pornography");
        crimedetails.setText("Child Pornography is pornography that exploits children for sexual gratification. It may be produced with the sexual assault or direct involvement of a child. Child Pornography is illegal and censored in most jurisdictions of the world");
        sec.setText("Section 67B of ITAA 2008 first conviction - upto 5 years and 10 lakhs.\n second or subsequent conviction - upto 7 years and upto 10 lakhs\n\nSection 292 IPC - upto 2 years imprisonment and fine Rupees 2000\nFor second and subsequent conviction, 5 years imprisonment and Rupees 5000 fine");
    }
}
