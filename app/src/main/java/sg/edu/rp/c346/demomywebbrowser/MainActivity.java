package sg.edu.rp.c346.demomywebbrowser;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.webkit.WebViewClient;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    Button btnLoadURL;
    WebView wvMyPage;
    EditText et;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        wvMyPage = findViewById(R.id.webViewMyPage);
        btnLoadURL = findViewById(R.id.buttonLoad);
        et = findViewById(R.id.editText);

        wvMyPage.setWebViewClient(new WebViewClient());

        WebSettings aa = wvMyPage.getSettings();
        aa.setJavaScriptEnabled(true);
        aa.setAllowFileAccess(false);
        aa.setDisplayZoomControls(true);

        btnLoadURL.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // String url = "https://www.grab.com/sg/";
                wvMyPage.loadUrl(et.getText().toString());
                et.setVisibility(View.GONE);
            }
        });
    }
}
