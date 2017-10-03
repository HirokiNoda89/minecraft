package to.msn.wings.minecraft_memo2.recipe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import to.msn.wings.minecraft_memo2.R;

public class RecipeActivity extends Activity{

    ListView listview;
    String[] members = {"基本", "ブロック", "道具", "防具", "乗り物", "機械", "食料", "醸造用品", "染料", "その他"};

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recipi);

        ArrayAdapter<String> adapter = new ArrayAdapter<String>(this,R.layout.base);
        listview = (ListView) findViewById(R.id.listview);

        for (String str: members){
            adapter.add(str);
        }

        listview.setAdapter(adapter);

        listview.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                switch (position){
                    case 0:
                        Intent i1 = new Intent(RecipeActivity.this,BaseActivity.class);
                        startActivity(i1);
                        break;
                    case 1:
                        Intent i2 = new Intent(RecipeActivity.this,BlockActivity.class);
                        startActivity(i2);
                        break;
                    case 2:
                        Intent i3 = new Intent(RecipeActivity.this,BaseActivity.class);
                        startActivity(i3);
                        break;
                    case 3:
                        Intent i4 = new Intent(RecipeActivity.this,BaseActivity.class);
                        startActivity(i4);
                        break;
                    case 4:
                        Intent i5 = new Intent(RecipeActivity.this,BaseActivity.class);
                        startActivity(i5);
                        break;
                    case 5:
                        Intent i6 = new Intent(RecipeActivity.this,BaseActivity.class);
                        startActivity(i6);
                        break;
                    case 6:
                        Intent i7 = new Intent(RecipeActivity.this,BaseActivity.class);
                        startActivity(i7);
                        break;
                    case 7:
                        Intent i8 = new Intent(RecipeActivity.this,BaseActivity.class);
                        startActivity(i8);
                        break;
                    case 8:
                        Intent i9 = new Intent(RecipeActivity.this,BaseActivity.class);
                        startActivity(i9);
                        break;
                    case 9:
                        Intent i = new Intent(RecipeActivity.this,BaseActivity.class);
                        startActivity(i);
                        break;
                }
            }
        });

    }
}
