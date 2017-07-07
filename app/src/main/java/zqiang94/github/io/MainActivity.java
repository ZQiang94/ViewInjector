package zqiang94.github.io;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

import com.example.BindView;

import io.github.zqiang94.viewinject_api.ViewInjector;

public class MainActivity extends AppCompatActivity {
    @BindView(R.id.contentTV)
    TextView contentTV;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ViewInjector.injectView(this);
        contentTV.setText("Hello Annotation!!!");
    }
}
