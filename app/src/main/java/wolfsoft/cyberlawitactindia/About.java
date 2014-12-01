package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;
import wolfsoft.cyberlawitactindia.TextViewEx;
import wolfsoft.cyberlawitactindia.TextJustifyUtils;

/**
 * Created by harsh on 22/9/14.
 */
public class About extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.definations);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        final TextView crimedetails = (TextView) findViewById(R.id.crimedetails);



        crimetittle.setText(Html.fromHtml("<b>About IT ACT India</b>"));

        crimedetails.setText(Html.fromHtml("<p align=”justify“>In May 2000, both the houses of the Indian Parliament passed the Information Technology Bill.<p align=”justify“>The Bill received the assent of the President in August 2000 and came to be known as the Information Technology Act, 2000.<p align=”justify“>Cyber laws are contained in the IT Act, 2000.\n" +
                "\n" +
                "<p align=”justify“>This Act aims to provide the legal infrastructure for e-commerce in India.<p align=”justify“>And the cyber laws have a major impact for e-businesses and the new economy in India.<p align=”justify“>So, it is important to understand what are the various perspectives of the IT Act, 2000 and what it offers.\n" +
                "\n" +
                "<p align=”justify“>The Information Technology Act, 2000 also aims to provide for the legal framework so that legal sanctity is accorded to all electronic records and other activities carried out by electronic means.<p align=”justify“>The Act states that unless otherwise agreed, an acceptance of contract may be expressed by electronic means of communication and the same shall have legal validity and enforceability.\n" +
                "\n" +
                "\n" +
                "<b><br><p align=”justify“>ADVANTAGES OF IT ACT</b>\n" +
                "\n" +
                "<p align=”justify“>The IT Act 2000 attempts to change outdated laws and provides ways to deal with cyber crimes.<p align=”justify“>The Act offers the much-needed legal framework so that information is not denied legal effect, validity or enforceability, solely on the ground that it is in the form of electronic records.\n" +
                "\n" +
                "<p align=”justify“>From the perspective of e-commerce in India, the IT Act 2000 and its provisions contain many positive aspects."));







            }

}
