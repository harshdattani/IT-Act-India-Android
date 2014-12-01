package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import org.w3c.dom.Text;

/**
 * Created by harsh on 22/9/14.
 */
public class Pornography extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("Pornography");
        crimedetails.setText("Pornography is posting, publishing, and transmiting obscene messages, photographes, videos, and text through e-mail, Websites, chatting, and other forms over the Internet");
        sec.setText("Section 67A of ITAA 2008 first conviction – up to  5 years and 10 lakh. \nSecond or subsequent conviction – up to 7 years and up to 10 lakh,\n \nSection 292 IPC – Up to 2 years imprisonment and fine Rupees 2000 and up to 5 years. \nUp to 5 years and rupees 5000 for second and subsequent conviction.");
    }
}
