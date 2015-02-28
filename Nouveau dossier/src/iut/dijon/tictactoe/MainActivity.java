package iut.dijon.tictactoe;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class MainActivity extends Activity implements OnClickListener {

	Button jouer,option,aides,apropos,quitter;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
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

		boolean ok=false;
		switch(item.getItemId())
		{
		case R.id.jouer:
			Toast.makeText(this,"Jeu",Toast.LENGTH_LONG).show();	
			Intent intent = new Intent(this, GameActivity.class) ;
			startActivity(intent) ;
			break;
		case R.id.option:
			Toast.makeText(this,"Option",Toast.LENGTH_LONG).show();	
			Intent opt = new Intent(this, OptionActivity.class) ;
			startActivity(opt) ;
			break;	

		}
		return ok;

	}

	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Button b = (Button) v;
	}

	
}
