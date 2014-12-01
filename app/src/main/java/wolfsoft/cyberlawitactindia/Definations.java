package wolfsoft.cyberlawitactindia;

import android.app.Activity;
import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

/**
 * Created by harsh on 22/9/14.
 */
public class Definations extends Activity {

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.definations);

        TextView crimetittle = (TextView) findViewById(R.id.crimetittle);
        TextView crimedetails = (TextView) findViewById(R.id.crimedetails);



        crimetittle.setText(Html.fromHtml("<b>Cyber Glossary</b>"));

        crimedetails.setText(Html.fromHtml("<p align=”justify“><b>Aymmetric Crypto system\n</b>" +
                "<p align=”justify“>A System of a secure key pair consisting of a private key for creating a digital signature and a public key to verify the digital signature\n" +
                "\n" +
                "<b><br><br>Computer\n</b>" +
                "<p align=”justify“>An electronic, magnetic, optical or other high-speed date processing device or system which performs logical, arithmetic and memory functions by manipulations of electronic, magnetic or optical impulses, and includes all input, output, processing, storage, computer software or communication facilities which are connected or relates to the computer in a computer system or computer network.\n" +
                "\n" +
                "<b><br><br>Computer resources\n</b>" +
                "<p align=”justify“>It means computer, computer system, computer network, data, computer database or software.\n" +
                "\n" +
                "<b><br><br>Data\n</b>" +
                "<p align=”justify“>Data means a representation of information, knowledge, facts, concepts or instruction which are being prepared or have been prepared in a formalised manner, and is intended to be processed, is being processed or has been processed in a computer system or computer network, and may be in any form (including computer printouts magnetic or optical storage media, punched cards, punched tapes) or stored internally in the memory of the computer.\n" +
                "\n" +
                "<b><br><br>Hash\n</b>" +
                "<p align=”justify“>A hash function takes a variable sized input and has a fixed size output. What this means in plain English is that the hash is used to authenticate an email or document by leaving a specific piece of code on it, such that the document has a \"digital fingerprint\" that would signal tampering.\n" +
                "\n" +
                "<b><br><br>Key\n</b>" +
                "<p align=”justify“>Used widely in cryptography, keys are like pieces of code that allow you to encrypt and decrypt data. Incidentally, a key can be used to perform other mathematical operations as well.\n" +
                "\n" +
                "<b><br><br>Digital Signature\n</b>" +
                "<p align=”justify“>Digital signatures are a means of proving that a file or email message belongs to a specific person, much as a driver's license proves identity in real life. Digital signatures have the added benefit of verifying that your message has not been tampered with. When you sign a message, a hash function--a computation that leaves a specific code, or \"digital fingerprint\" is applied to it. If the fingerprint on the recipient's message doesn't match the original fingerprint, the message has been altered.\n" +
                "\n" +
                "<br><br><b>Proxy Server\n</b>" +
                "<p align=”justify“>A proxy server is a system that caches items from other servers to speed up access. On the Web, a proxy first attempts to find data locally, and if it's not there, fetches it from the remote server where the data resides permanently.\n" +
                "\n" +
                "<br><br><b>Piracy\n</b>" +
                "<br><p align=”justify“>Software piracy is the mislicensing, unauthorized reproduction and illegal distribution of software, whether for business or personal use."+
                "<b><br><br>Email bombing</b>\n" +
                "<p align=”justify“>Sending a large number of emails to an individual or the company or the email server which ultimately results in crashing\n" +
                "\n" +
                "<br><br><b>Hacking</b>\n" +
                "<p align=”justify“>Illegal intrusion into a computer system and/or network\n" +
                "\n" +
                "<br><br><b>Malicious Software dissemination</b>\n" +
                "<p align=”justify“>Use of malicious software such as Key-logger, password crackers, network vulnerability scanners which are a threat to data privacy\n" +
                "\n" +
                "<b><br><br>Email Spoofing/Spamming</b>\n" +
                "<p align=”justify“>Such emails are often being sent from a fake source and intentions to send such emails are mostly used for direct marketing, spreading virus etc\n" +
                "\n" +
                "<b><br><br>Phishing/Social Engineering</b>\n" +
                "<p align=”justify“>Gathering sensitive information from account holders like user-name and password by deceptive means.\n" +
                "\n" +
                "<b><br><br>Forging</b>\n" +
                "<p align=”justify“>This includes counterfeiting currency notes, postage and revenue stamps, marksheets etc. Such acts can be forged using sophisticated computers and scanners.\n" +
                "\n" +
                "<b><br><br>Cyber Defamation</b>\n" +
                "<p align=”justify“>This occurs when defamation takes place with the help of computers and/or internet.\n" +
                "\n" +
                "<b><br><br>Virus</b>\n" +
                "<p align=”justify“>Viruses are programs that attaches themselves to a computer/file and replicate on a network.\n" +
                "\n" +
                "<b><br><br>Worms</b>\n" +
                "<p align=”justify“>Worms do not need the host to attach themselves.\n" +
                "\n" +
                "<b><br><br>Identity Theft</b>\n" +
                "<p align=”justify“>Stealing someone's identity to obtain credit/service using other's information to assume his or her identity in daily life.\n" +
                "\n" +
                "<b><br><br>Financial Crime</b>\n" +
                "<p align=”justify“>This includes cheating, credit card frauds, money laundering etc.\n" +
                "\n" +
                "<b><br><br>Credit Card Frauds</b>\n" +
                "<p align=”justify“>Unauthorized and illegal use of a credit card, card numbers obtained using techniques such as skimming\n" +
                "\n" +
                "<b><br><br>Intellectual Property Crime</b>\n" +
                "<p align=”justify“>Includes software piracy, copyrights, trademark violation etc\n" +
                "\n" +
                "<b><br><br>Data Diddling</b>\n" +
                "<p align=”justify“>This attack involves altering raw data just before a computer processes it and then changing it back after the process is completed.\n" +
                "\n" +
                "<b><br><br>Salami Attack</b>\n" +
                "<p align=”justify“>It is performed for the purpose of committing financial crimes. Important feature of this type of offence is the alteration is so small that it would normally go un-noticed\n" +
                "\n" +
                "<b><br><br>Web Jacking</b>\n" +
                "<p align=”justify“>The hacker gains access and control over the website.\n" +
                "\n" +
                "<b><br><br>DOS/DDOS</b>\n" +
                "<p align=”justify“>The computer of victim is flooded with more request than it can handle which cause it to crash. DDOS is also a type of DOS in which the offenders are wide in a number and wide spread.\n" +
                "\n" +
                "<b><br><br>Cyber Stalking</b>\n" +
                "<p align=”justify“>It is the use of internet or other electronic means to stalk or harass an individual, group of individual or organization.\n" +
                "\n" +
                "<b><br><br>Cyber Pornography</b>\n" +
                "<p align=”justify“>Includes website, magazines with pornographic content which actually been prepared using computer and internet.\n" +
                "\n" +
                "<b><br><br>Electronic Surveillance</b>\n" +
                "<p align=”justify“>Placement of bugs, wire tapes and hidden cameras for industrial espionage."));

            }
}
