package projet.iut.morpion;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.Toast;

public class JeuActivity extends Activity implements OnClickListener {

    final String EXTRA_JOUEUR1 = "X";
    final String EXTRA_JOUEUR2 = "O";

	Button A1,A2,A3,B1,B2,B3,C1,C2,C3, Rejouer;
	Button [] tab;

	boolean tour = true;
	int tour_cpt = 0;

    Intent intent = getIntent();
    String joueur1 = "";
    String joueur2 = "";

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_jeu);

        if (intent != null) {
            joueur1 = intent.getStringExtra(EXTRA_JOUEUR1);
            joueur2 = intent.getStringExtra(EXTRA_JOUEUR1);
        }
		
		Rejouer = (Button) findViewById(R.id.Rejouer);
		A1 = (Button) findViewById(R.id.A1);
		A2 = (Button) findViewById(R.id.A2);
		A3 = (Button) findViewById(R.id.A3);
		B1 = (Button) findViewById(R.id.B1);
		B2 = (Button) findViewById(R.id.B2);
		B3 = (Button) findViewById(R.id.B3);
		C1 = (Button) findViewById(R.id.C1);
		C2 = (Button) findViewById(R.id.C2);
		C3 = (Button) findViewById(R.id.C3);


		tab = new Button []{A1,A2,A3,B1,B2,B3,C1,C2,C3};

		for(Button b : tab){

			b.setOnClickListener(this);
		}

		Rejouer.setOnClickListener(new OnClickListener(){

			public void onClick(View v){

				tour = true;
				tour_cpt = 0;
				enabledisableAllButtons(true);
			}
		});
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
        int id = item.getItemId();
        if (id == R.id.action_settings) {
            return true;
        }
		return super.onOptionsItemSelected(item);
	}
	
	@Override
	public void onClick(View v) {
		// TODO Auto-generated method stub
		Button b = (Button) v;
		buttonClicked(b);		

	}

	public void buttonClicked(Button b){

		if(tour){
			//joueur 1
			b.setTextColor(Color.RED);
			b.setText("X");

		}else{
			//joueur 2
			b.setTextColor(Color.BLUE);
			b.setText("O");

		}
		tour_cpt++;
		//on change de tour en d�sactivant le boutton click�
		b.setClickable(false);
		//b.setBackgroundColor(Color.LTGRAY);
		tour = !tour;
		gagnant();
	}

	private void gagnant(){

		boolean gagne = false;


		//horizontal
		if(A1.getText() == A2.getText() && A2.getText() == A3.getText() 
				&& !A1.isClickable())
			gagne =true;
		else if(B1.getText() == B2.getText() && B2.getText() == B3.getText() 
				&& !B1.isClickable())
			gagne =true;
		else if(C1.getText() == C2.getText() && C2.getText() == C3.getText() 
				&& !C1.isClickable())
			gagne =true;

		//vertical
		else if(A1.getText() == B1.getText() && B1.getText() == C1.getText() 
				&& !A1.isClickable())
			gagne =true;
		else if(A2.getText() == B2.getText() && B2.getText() == C2.getText()
				&& !B2.isClickable())
			gagne =true;
		else if(A3.getText() == B3.getText() && B3.getText() == C3.getText()
				&& !C3.isClickable())
			gagne =true;

		//diagonal
		else if(A1.getText() == B2.getText() && B2.getText() == C3.getText() 
				&& !A1.isClickable())
			gagne =true;
		else if(A3.getText() == B2.getText() && B2.getText() == C1.getText() 
				&& !B2.isClickable())
			gagne =true;


		if(gagne){
			if(!tour){
				toast(joueur1+" gagne");
			}else{
				toast(joueur2+" gagne");
			}	
			enabledisableAllButtons(false);

		}else if(tour_cpt == 9){
			toast("Pas de gagnant");
		}


	}

	private void toast(String message) {
		// TODO Auto-generated method stub
		Toast.makeText(getApplicationContext(), message, Toast.LENGTH_SHORT).show();
	}

	private void enabledisableAllButtons(boolean active) {
		// TODO Auto-generated method stub
		for(Button b : tab){

			b.setClickable(active);

			if(active){

				b.setText("");
				//b.setBackground(getWallpaper());

			}
		}
	}
}
