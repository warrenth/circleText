package pe.warrenth.flower;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.view.View;

public class CanvasView extends View {
	private Context context;
	private String input;
	
	Canvas canvas;
	
	public CanvasView(Context context, String input) {
		super(context);
		this.context = context;
		this.input = input;
	}

	@Override
	protected void onDraw(Canvas canvas) {
		super.onDraw(canvas);
		
		Paint paint = new Paint();
		paint.setColor(Color.GREEN);                
		paint.setStyle(Paint.Style.STROKE);   
		paint.setTextSize(80);
		canvas.drawColor(Color.WHITE); 
		
		for(int i=0; i<50; i++){
			canvas.drawText(input, (float)(getWidth()*0.71), (float)(getHeight()*0.71), paint);
			canvas.rotate(20, getWidth() / 2, getHeight() / 2); 
		}

	}

	
}
