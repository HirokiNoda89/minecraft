package to.msn.wings.minecraft_memo2;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import to.msn.wings.minecraft_memo2.recipe.RecipeActivity;

/**
 * Created by 4163104 on 2017/09/07.
 */

public class home extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void onClick1(View v) {
        Intent intent = new Intent(home.this, ListActivity.class);
        startActivity(intent);
    }

    public void onClick2(View v) {
        Intent intent = new Intent(home.this,RecipeActivity.class);
        startActivity(intent);
    }

}
