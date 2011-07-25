package mox.prove;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

public class ProvamoxActivity extends Activity {
    /** Called when the activity is first created. */
    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        
        TextView t1 = (TextView) findViewById(R.id.tv1);
        t1.setText("invece si");
    }
}