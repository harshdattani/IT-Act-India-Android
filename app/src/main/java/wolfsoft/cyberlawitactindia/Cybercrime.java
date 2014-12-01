package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by harsh on 22/9/14.
 */
public class Cybercrime extends Activity {

    // List view
    private ListView lv;

    // Listview Adapter
    ArrayAdapter<String> adapter;

    // Search EditText
    EditText inputSearch;


    // ArrayList for Listview
    ArrayList<HashMap<String, String>> productList;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.crime_list);

        // Listview Data
        String products[] = {"Pornography", "Data Theft", "DOS or DDOS Attack", "Computer Hardware Theft", "Digital or Electronic Signature Misuse",
                "Copyright Infringement or Piracy", "Hacking",
                "E-mail Abuse", "E-mail Spoofing", "E-mail Threatening", "Data Modification","Identity theft","Thumb Impression Misuse","Forgery for Cheating",
        "Forgery for Reputation Harming","Cyber Defamation","Child Pornography"};


        lv = (ListView) findViewById(R.id.list_view);
        lv.setSelector( R.drawable.listselector);
        inputSearch = (EditText) findViewById(R.id.inputSearch);

        // Adding items to listview
        adapter = new ArrayAdapter<String>(this, R.layout.list_item, R.id.crime_name, products);

        lv.setAdapter(adapter);

        lv.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            public void onItemClick(AdapterView<?> parent, View view,
                                    int position, long id) {


                    if (((String)adapter.getItem(position)).equals("Pornography")) {

                            Intent intent = new Intent(Cybercrime.this, Pornography.class);
                            startActivity(intent);

                    }

                if (((String)adapter.getItem(position)).equals("Child Pornography")) {

                    Intent intent = new Intent(Cybercrime.this, Childpornography.class);
                    startActivity(intent);

                }

                if (((String)adapter.getItem(position)).equals("DOS or DDOS Attack")) {

                    Intent intent = new Intent(Cybercrime.this, Dosattack.class);
                    startActivity(intent);

                }

                if (((String)adapter.getItem(position)).equals("Computer Hardware Theft")) {

                    Intent intent = new Intent(Cybercrime.this, Computerthef.class);
                    startActivity(intent);

                }
                if (((String)adapter.getItem(position)).equals("Digital or Electronic Signature Misuse")) {

                    Intent intent = new Intent(Cybercrime.this, Digitalsignature.class);
                    startActivity(intent);

                }
                if (((String)adapter.getItem(position)).equals("Copyright Infringement or Piracy")) {

                    Intent intent = new Intent(Cybercrime.this, Piracy.class);
                    startActivity(intent);

                }
                if (((String)adapter.getItem(position)).equals("Hacking")) {

                    Intent intent = new Intent(Cybercrime.this, Hacking.class);
                    startActivity(intent);

                }
                if (((String)adapter.getItem(position)).equals("E-mail Abuse")) {

                    Intent intent = new Intent(Cybercrime.this, Emailabuse.class);
                    startActivity(intent);

                }
                if (((String)adapter.getItem(position)).equals("E-mail Spoofing")) {

                    Intent intent = new Intent(Cybercrime.this, Emailspoofing.class);
                    startActivity(intent);

                }
                if (((String)adapter.getItem(position)).equals("E-mail Threatening")) {

                    Intent intent = new Intent(Cybercrime.this, Emailthreatening.class);
                    startActivity(intent);

                }
                if (((String)adapter.getItem(position)).equals("Data Modification")) {

                    Intent intent = new Intent(Cybercrime.this, Datamodification.class);
                    startActivity(intent);

                }
                if (((String)adapter.getItem(position)).equals("Identity theft")) {

                    Intent intent = new Intent(Cybercrime.this, Identitytheft.class);
                    startActivity(intent);

                }
                if (((String)adapter.getItem(position)).equals("Thumb Impression Misuse")) {

                    Intent intent = new Intent(Cybercrime.this, Thumb.class);
                    startActivity(intent);

                }
                if (((String)adapter.getItem(position)).equals("Forgery for Cheating")) {

                    Intent intent = new Intent(Cybercrime.this,Forgery.class);
                    startActivity(intent);

                }
                if (((String)adapter.getItem(position)).equals("Forgery for Reputation Harming")) {

                    Intent intent = new Intent(Cybercrime.this,Forgeryrepu.class);
                    startActivity(intent);

                }
                if (((String)adapter.getItem(position)).equals("Cyber Defamation")) {

                    Intent intent = new Intent(Cybercrime.this,Cyberdefamation.class);
                    startActivity(intent);

                }

                }


        });

        /**
         * Enabling Search Filter
         * */
        inputSearch.addTextChangedListener(new TextWatcher() {

            @Override
            public void onTextChanged(CharSequence cs, int arg1, int arg2, int arg3) {
                // When user changed the Text
               Cybercrime.this.adapter.getFilter().filter(cs);
            }

            @Override
            public void beforeTextChanged(CharSequence arg0, int arg1, int arg2,
                                          int arg3) {
                // TODO Auto-generated method stub

            }

            @Override
            public void afterTextChanged(Editable arg0) {
                // TODO Auto-generated method stub
            }
        });
    }


}