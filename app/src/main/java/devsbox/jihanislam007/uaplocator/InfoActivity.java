package devsbox.jihanislam007.uaplocator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class InfoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info);

    }

    public void lib(View view) {

        int id= 1;

        Intent Int_a0 = new Intent(InfoActivity.this, WebActivity.class);
        Int_a0.putExtra("id", 1);
        startActivity(Int_a0);
    }

    public void arch(View view) {
        String id= "2";
        String link= "";

        Intent Int_a0 = new Intent(InfoActivity.this, WebActivity.class);
        Int_a0.putExtra("id", 2);
        Int_a0.putExtra("link", link);
        startActivity(Int_a0);
    }

    public void cse(View view) {
        String id= "3";
        String link= "";

        Intent Int_a0 = new Intent(InfoActivity.this, WebActivity.class);
        Int_a0.putExtra("id", 3);
        Int_a0.putExtra("link", link);
        startActivity(Int_a0);
    }

    public void civ(View view) {
        String id= "4";
        String link= "";

        Intent Int_a0 = new Intent(InfoActivity.this, WebActivity.class);
        Int_a0.putExtra("id", 4);
        Int_a0.putExtra("link", link);
        startActivity(Int_a0);
    }

    public void eee3(View view) {
        String id= "5";
        String link= "";

        Intent Int_a0 = new Intent(InfoActivity.this, WebActivity.class);
        Int_a0.putExtra("id", 5);
        Int_a0.putExtra("link", link);
        startActivity(Int_a0);
    }

    public void phrma(View view) {
        String id= "6";
        String link= "";

        Intent Int_a0 = new Intent(InfoActivity.this, WebActivity.class);
        Int_a0.putExtra("id", 6);
        Int_a0.putExtra("link", link);
        startActivity(Int_a0);
    }

    public void english(View view) {
        String id= "7";
        String link= "";

        Intent Int_a0 = new Intent(InfoActivity.this, WebActivity.class);
        Int_a0.putExtra("id", 7);
        Int_a0.putExtra("link", link);
        startActivity(Int_a0);
    }

    public void admin(View view) {
        String id= "8";
        String link= "";

        Intent Int_a0 = new Intent(InfoActivity.this, WebActivity.class);
        Int_a0.putExtra("id", 8);
        Int_a0.putExtra("link", link);
        startActivity(Int_a0);
    }

    public void plaza(View view) {
        String id= "9";
        String link= "";

        Intent Int_a0 = new Intent(InfoActivity.this, WebActivity.class);
        Int_a0.putExtra("id", 9);
        Int_a0.putExtra("link", link);
        startActivity(Int_a0);
    }

    public void backIn(View view) {
        Intent in = new Intent(InfoActivity.this,MainActivity.class);
        startActivity(in);

    }
}
