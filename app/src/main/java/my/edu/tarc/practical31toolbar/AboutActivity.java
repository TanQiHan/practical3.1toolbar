package my.edu.tarc.practical31toolbar;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);

        WebView WebViewAbout=(WebView)findViewById(R.id.WebViewAbout);
        WebViewAbout.loadUrl("https://github.com/TanQiHan");

    }
}
