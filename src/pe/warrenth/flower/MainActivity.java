package pe.warrenth.flower;

import android.os.Bundle;
import android.app.Activity;
import android.content.Context;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {
	
	private Context context;
	
	private LinearLayout canvasLayout;
	private EditText editName;
	private Button btnOk;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		initResource();
	}
	
	private void initResource() {
		editName = (EditText) findViewById(R.id.edit_name);
		btnOk = (Button) findViewById(R.id.btn_ok);
		canvasLayout = (LinearLayout) findViewById(R.id.canvas_layout);
		
		btnOk.setOnClickListener(this);
	}

	@Override
	public void onClick(View view) {
		switch (view.getId()) {
		case R.id.btn_ok:
			String input = editName.getText().toString().trim();
			
			if(input.length() >3) {
				Toast.makeText(getApplicationContext(), "You can enter up to 3 characters ", Toast.LENGTH_SHORT).show();
				return;
			}
			
			if(!input.equals("")) {
				canvasLayout.removeAllViews();
				CanvasView canvasView = new CanvasView(MainActivity.this, input);
				canvasLayout.addView(canvasView);
			}
			
			break;
		default:
			break;
		}
	}


}
