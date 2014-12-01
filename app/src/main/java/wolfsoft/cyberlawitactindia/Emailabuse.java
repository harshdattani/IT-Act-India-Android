package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Emailabuse extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crimedetails);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);
        TextView sec = (TextView) findViewById(R.id.sections);


        crimetittle.setText("E-mail Abuse");
        crimedetails.setText("The use of electronic mail to harass, annoy, or cause harm to the email recipient is termed as E-mail abuse.  Abuse can take the form of bulk email, SPAM, UCE, threatening e-mail, e-mail sent with the intent to slow productivity of, or cause damage to, the recipient's computer system.");
        sec.setText("Section 66A of ITAA 2008 – up to 3 years imprisonment and fine\n" +
                "Section 500 IPC – up to 2 years or fine or both.");
    }
}
