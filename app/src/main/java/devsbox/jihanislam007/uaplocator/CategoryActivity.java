package devsbox.jihanislam007.uaplocator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import devsbox.jihanislam007.uaplocator.Map.MapActivity;

public class CategoryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_category);
    }

    public void back(View view) {
        Intent in = new Intent(CategoryActivity.this,MainActivity.class);
        startActivity(in);
    }

    public void information(View view) {
        Intent in = new Intent(CategoryActivity.this,InfoActivity.class);
        startActivity(in);
    }

    public void whereTogo(View view) {
        /*Intent in = new Intent(CategoryActivity.this,web.class);
        startActivity(in);*/
        Toast.makeText(this,"this page is under construction",Toast.LENGTH_LONG).show();
    }

    public void locatme(View view) {
        Intent in = new Intent(CategoryActivity.this,MapActivity.class);
        startActivity(in);

    }


}
