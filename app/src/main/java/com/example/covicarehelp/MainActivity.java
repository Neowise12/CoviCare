package com.example.covicarehelp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;



public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void Mails(View view) {


        Intent intent = new Intent(Intent.ACTION_SENDTO);
        intent.setData(Uri.parse("mailto:")); // only email apps should handle this
        intent.putExtra(Intent.EXTRA_SUBJECT, "Good News, vaccination slot available");
        intent.putExtra(Intent.EXTRA_TEXT, Body());
        if (intent.resolveActivity(getPackageManager()) != null) {
            startActivity(intent);
        }
        intent.putExtra(Intent.EXTRA_STREAM, "https://www.instagram.com/p/CParexjJ21L/?utm_medium=copy_link");
    }

    public String Body() {
        return "Hii from covicarehelp \n" +
                "\n" +
                "Hope you are healthy and well at your home.\n" +
                "\n" +
                "This is to inform you that slot of vaccine for age group 18-44 has been available in your area.(...)\n" +
                "So kindly book own slot on cowin.gov.in or on Aarogya setu app and be vaccinate as soon as possible.\n" +
                "\n" +
                "And till please maintain physical distance and wear mask.\n" +
                "\n" +
                "\n" +
                "Share this link www.covicarehelp.in,  so that every needy hand can get access to vaccination, Oxygen and bed availability.\n" +
                "\n" +
                "www.covicarehelp.in";
    }

}
