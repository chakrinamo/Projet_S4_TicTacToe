package projet.iut.morpion;

import android.app.Activity;
import android.content.Intent;
import android.view.MenuItem;

/**
 * Created by Zouhairi on 22/03/2015.
 */
public class MenuPerso extends Activity {

    public boolean actionMenu(MenuItem item){

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
        return true;
    }
}
