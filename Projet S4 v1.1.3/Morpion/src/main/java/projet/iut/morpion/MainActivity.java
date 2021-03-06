package projet.iut.morpion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends Activity {
	
	private Menu m = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);


		  
		Button jeu = (Button)findViewById(R.id.jouer);
		jeu.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "D�but du jeu", Toast.LENGTH_SHORT).show();
                Intent jeu = new Intent(MainActivity.this, JeuActivity.class) ;
                startActivity(jeu) ;
			}
		});
		
		Button opt = (Button)findViewById(R.id.option);
		opt.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Option", Toast.LENGTH_SHORT).show();
                Intent opt = new Intent(MainActivity.this, OptionActivity.class) ;
                startActivity(opt) ;
			}
		});
		
		Button aid = (Button)findViewById(R.id.aide);
		aid.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Aides", Toast.LENGTH_SHORT).show();
                Intent hlp = new Intent(MainActivity.this, HelpActivity.class) ;
                startActivity(hlp) ;
			}
		});
		
		Button pro = (Button)findViewById(R.id.apropos);
		pro.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "A propos", Toast.LENGTH_SHORT).show();
                Intent abt = new Intent(MainActivity.this, AboutActivity.class) ;
                startActivity(abt) ;
			}
		});
		
		Button qut = (Button)findViewById(R.id.quitter);
		qut.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				Toast.makeText(getApplicationContext(), "Bye...", Toast.LENGTH_SHORT).show();
				System.exit(0);
			}
		});
	}


    @Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.main, menu);
		m = menu;
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.

		
		switch(item.getItemId())
		{
		case R.id.game:
			Intent jeu = new Intent(this, JeuActivity.class) ;
			startActivity(jeu) ;
			break;
		case R.id.exit:
			System.exit(0);
			break;
		case R.id.help:
			Intent hlp = new Intent(this, HelpActivity.class) ;
			startActivity(hlp) ;
			break;
		case R.id.opt:
			Intent opt = new Intent(this, OptionActivity.class) ;
			startActivity(opt) ;
			break;
		case R.id.about:
			Intent abt = new Intent(this, AboutActivity.class) ;
			startActivity(abt) ;
			break;

		}
		return super.onOptionsItemSelected(item);

	}

}
	
