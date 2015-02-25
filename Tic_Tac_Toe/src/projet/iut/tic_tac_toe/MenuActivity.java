package projet.iut.tic_tac_toe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;

public class MenuActivity extends Activity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_menu);
	}
	
	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// TODO Auto-generated method stub
		boolean ok=false;
		switch(item.getItemId())
		{
		case R.id.jouer:
			Intent jeu = new Intent(this, MainActivity.class) ;
		startActivity(jeu) ;
		break;
		
		case R.id.aide:
			Intent aide = new Intent(this, AideActivity.class) ;
		startActivity(aide) ;
		break;
		
		case R.id.option:
			Intent option = new Intent(this, OptionActivity.class) ;
		startActivity(option) ;
		break;
		
		case R.id.apropos:
			Intent propos = new Intent(this, MainActivity.class) ;
		startActivity(propos) ;
		break;
		
		case R.id.quitter:
			finish();
			System.exit(0);
		break;
		
		}
		return ok;
	}
}
