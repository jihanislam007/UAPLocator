package devsbox.jihanislam007.uaplocator;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class WebActivity extends AppCompatActivity {

    private WebView mWebview;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web);

        mWebview = new WebView(this);

        Intent mIntent = getIntent();
        int g_id = mIntent.getIntExtra("id", 0);

        if(g_id==1){
            mWebview.loadUrl("http://uap-bd.edu/lhr/semineer-library/");
            setContentView(mWebview);
        }else if(g_id==2){
            mWebview.loadUrl("http://www.uap-bd.edu/architecture/index.html");
            setContentView(mWebview);
        }else if(g_id==3){
            mWebview.loadUrl("http://www.uap-bd.edu/cse/index.php");
            setContentView(mWebview);
        }else if(g_id==4){
            mWebview.loadUrl("http://www.uap-bd.edu/ce/index.html");
            setContentView(mWebview);
        }else if(g_id==5){
            mWebview.loadUrl("http://eee.uap-bd.edu/");
            setContentView(mWebview);
        }else if(g_id==6){
            mWebview.loadUrl("http://www.uap-bd.edu/phar/index.php");
            setContentView(mWebview);
        }else if(g_id==7){
            mWebview.loadUrl("http://www.uap-bd.edu/eng/index.php");
            setContentView(mWebview);
        }else if(g_id==8){
            mWebview.loadUrl("http://www.uap-bd.edu/bsh/index.html");
            setContentView(mWebview);
        }else if(g_id==9){
            mWebview.loadUrl("http://www.uap-bd.edu/index.html");
            setContentView(mWebview);
        }


    }
}
