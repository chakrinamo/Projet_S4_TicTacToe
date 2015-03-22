package projet.iut.morpion;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class OptionActivity extends Activity {

    final String EXTRA_JOUEUR1 = "O";
    final String EXTRA_JOUEUR2 = "X";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_option);

        final EditText joueur1 = (EditText) findViewById(R.id.joueur1);
        final EditText joueur2 = (EditText) findViewById(R.id.joueur2);

        final Button valider = (Button)findViewById(R.id.valide);
        valider.setOnClickListener(new View.OnClickListener() {

            @Override
            public void onClick(View v) {
                Intent menu = new Intent(OptionActivity.this, MainActivity.class) ;
                Intent jeu = new Intent(OptionActivity.this, JeuActivity.class) ;
                jeu.putExtra(EXTRA_JOUEUR1,joueur1.getText().toString());
                jeu.putExtra(EXTRA_JOUEUR2,joueur2.getText().toString());
                startActivity(menu) ;
            }
        });
	}

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.option, menu);
		return true;
	}

	@Override
	public boolean onOptionsItemSelected(MenuItem item) {
		// Handle action bar item clicks here. The action bar will
		// automatically handle clicks on the Home/Up button, so long
		// as you specify a parent activity in AndroidManifest.xml.
		int id = item.getItemId();
		if (id == R.id.action_settings) {
			return true;
		}
		return super.onOptionsItemSelected(item);
	}
}
