package com.realifetraining.reallife;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.view.View;
import android.support.design.widget.NavigationView;
import android.support.v4.view.GravityCompat;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.ActionBarDrawerToggle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.Menu;
import android.view.MenuItem;

public class MainActivity extends AppCompatActivity
        implements NavigationView.OnNavigationItemSelectedListener {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        FloatingActionButton fab = (FloatingActionButton) findViewById(R.id.fab);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG)
                        .setAction("Action", null).show();
            }
        });

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        ActionBarDrawerToggle toggle = new ActionBarDrawerToggle(
                this, drawer, toolbar, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        drawer.addDrawerListener(toggle);
        toggle.syncState();

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);
    }

    @Override
    public void onBackPressed() {
        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawer.isDrawerOpen(GravityCompat.START)) {
            drawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();
        }
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        // Inflate the menu; this adds items to the action bar if it is present.
        getMenuInflater().inflate(R.menu.main, menu);
        return true;
    }

    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
        // Handle action bar item clicks here. The action bar will
        // automatically handle clicks on the Home/Up button, so long
        // as you specify a parent activity in AndroidManifest.xml.
        int id = item.getItemId();

        //noinspection SimplifiableIfStatement
        if (id == R.id.action_settings) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }

    @SuppressWarnings("StatementWithEmptyBody")
    @Override
    public boolean onNavigationItemSelected(MenuItem item) {
        // Handle navigation view item clicks here.
        int id = item.getItemId();
        android.widget.TextView title =findViewById(R.id.text_title);
        android.widget.TextView body =findViewById(R.id.text_body);

        if (id == R.id.nav_home) {
            title.setText("Welcome!");
            body.setText("Did you spend all of high school complaining about how you never learned anything important to adult life? Well so did we! That's why we invented ReaLife, a program that allows you to learn the basics of adulthood. How to balance a checkbook, whatever that means, or become a wolf of wallstreet. Continue through our information blurbs, quizzes and even game to learn these, for once, useful skills!");
        } else if (id == R.id.nav_balancing) {
            title.setText("Balancing");
            body.setText("Balancing your checkbook, surprisingly relates to budgeting almost directly. It is a way to keep track of what you have spent and how much you have left in your ‘checkbook’, bank account. You write down each bank transaction, ATM visit or check written; and subtract or add from your original total bank statement. This helps you have a good, or even perfect, estimate of what money you have to spend in your checking. More information can be found at: https://www.capitalone.com/financial-education/money-basics/balancing-budget/balance-your-checkbook/");
        } else if (id == R.id.nav_budgeting) {
            title.setText("Budgeting");
            body.setText("Budgeting ensure that you will have enough money to pay for the essentials in life as well as essential non-essentials, like Redbull. Budgeting allows a person to keep track of what money they have coming in, at hand, and leaving; at all times. It allows a person to be more financially responsible and give over stability in their bank account. There are many apps and books that help a person learn what budgeting techniques they are most compatible with. More information at: https://www.daveramsey.com/blog/the-truth-about-budgeting");
        } else if (id == R.id.nav_flowsheet) {
            title.setText("Flow Sheets");
            body.setText("A Flowsheet is a document that allows you to see the flow of your money. This document can be made with excel or any other table making program. It can be made to specify where each portion of your income flows. Making your bills, payments and excess money completely transparent to yourself for months to come. For more information: https://quickbooks.intuit.com/r/financial-management/free-cash-flow-statement-template-example-and-guide/");
        } else if (id == R.id.nav_paying_bills) {
            title.setText("Paying Bills");
            body.setText("When you are renting or paying off your home, buying electricity, water, or heat; you have bills to pay. When paying bill, it is important to be proactive. First you need to check your mail often and make sure you keep track of all your bills and collect them in a safe spot. If you can not pay all your bills at once you can ask your banker for easy due dates to meet and finish paying them off. For more information read: https://www.wikihow.com/Pay-Your-Bills");
        } else if (id == R.id.nav_stocks) {
            title.setText("Stocks");
            body.setText("A Stock Market displays the buyers and sellers of a company or cooperation. It is important to research past and predictions of a particular stock before investing. This allows you to have the ability to, hopefully, make money (Just avoid Bitcoin for the time being). Investing in Stock is not a required part of being an adult and does require risk. You can either win big, lose big, win then lose and vise versa over and over again or any combination. It a way to ‘gamble’ in a more professional manner.");
        } else if (id == R.id.nav_subscriptions) {
            title.setText("Subscriptions");
            body.setText("Payments are required when a person has a subscription to a service or item. This could range from a subscription from the, almost holy, Chegg or that important educational subscription you have to the IEEE Spectrum. No matter what your service is, you must make these payments monthly, bimonthly or whatever your receipt says. Other payments include heating/cooling, electricity, and more. For more or any information look here: https://www.investopedia.com/terms/p/payment.asp");
        } else if (id == R.id.nav_taxes) {
            title.setText("Taxes");
            body.setText("In the United States, citizens are required to pay taxes, unless they plan on living the next 3 years eating prison food, in prison. These taxes go towards paying government officials, building needed roads and even supplies for the U.S. military. Some states have sales tax which is a tax percentage on items sold. There are also income taxes on your yearly income and property taxes on the house and property. Once you are independent and finally weened off your parents and guardians you must pay these taxes. To do this you use a W-2 form. Don’t worry, if this is an acronym, it’s for something unimportant. You must use a W-2 to show proof of employment. For more information read: https://www.nerdwallet.com/blog/loans/student-loans/expert-advice-students-filing-taxes/");
        }

        DrawerLayout drawer = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawer.closeDrawer(GravityCompat.START);
        return true;
    }
}
