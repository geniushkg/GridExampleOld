package seveninch.tablet.pos;

import android.content.pm.ActivityInfo;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.GridView;
import android.widget.Toast;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    private Button all,fav,ckp,guj,kash,goan,nag;
    GridView gridView;
    ArrayList<Item> gridArray = new ArrayList<Item>();
    CustomGridViewAdapter customGridAdapter;

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_LANDSCAPE);
        all = (Button)findViewById(R.id.btn_all);
        fav = (Button)findViewById(R.id.btn_fav);
        goan = (Button)findViewById(R.id.btn_goan);
        guj = (Button)findViewById(R.id.btn_guj);
        ckp = (Button)findViewById(R.id.btn_ckp);
        kash = (Button)findViewById(R.id.btn_kash);
        nag = (Button)findViewById(R.id.btn_nag);

        // First time trigger allgrid

        gridAll();

        // On button click listener for respective grids

        all.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //  add all items
                gridAll();
            }
        });

        ckp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid1();
            }
        });

        goan.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                grid2();
            }
        });
      guj.setOnClickListener(new View.OnClickListener() {
          @Override
          public void onClick(View v) {
              grid3();
          }
      });

     kash.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             grid4();
         }
     });

     nag.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View v) {
             grid5();
         }
     });

    }

    public  void gridAll(){

        //remove trash values
        gridArray.removeAll(gridArray);
        // code to add to grid
        gridArray.add(new Item("Sol Kadhi",1));
        gridArray.add(new Item("Kolambi Fry",1));
        gridArray.add(new Item("Chicken Rassa",1));
        gridArray.add(new Item("Banda Che Kalu", 1));
        gridArray.add(new Item("Mutton Xacuti", 2));
        gridArray.add(new Item("Pork Vindaloo", 2));
        gridArray.add(new Item("Goan Fish Curry",2));
        gridArray.add(new Item("Methi thepala",3));
        gridArray.add(new Item("Dal Dhokli",3));
        gridArray.add(new Item("White Dhokla",3));
        gridArray.add(new Item("Dum Aloo",4));
        gridArray.add(new Item("Kashmiri Rogan",4));
        gridArray.add(new Item("Kashmiri Dahi B",4));
        gridArray.add(new Item("Vange Che Bhari", 5));
        gridArray.add(new Item("Vada Bhat",5));
        gridArray.add(new Item("Saoji chiken",5));
        gridArray.add(new Item("Saoji mutton",5));

        gridView = (GridView) findViewById(R.id.glayout);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);


    }

    public  void grid1(){

        //remove trash values
        gridArray.removeAll(gridArray);
        // code to add to grid
        gridArray.add(new Item("Sol Kadhi",1));
        gridArray.add(new Item("Kolambi Fry",1));
        gridArray.add(new Item("Chicken Rassa",1));
        gridArray.add(new Item("Banda Che Kalu",1));

        gridView = (GridView) findViewById(R.id.glayout);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {

                Toast.makeText(MainActivity.this, gridArray.get(position).getDesc(), Toast.LENGTH_SHORT).show();
                Log.d("TAG", "onclick trigered for" + gridArray.get(position).getDesc());
            }
        });

    }
    public  void grid2(){

        //remove trash values
        gridArray.removeAll(gridArray);
        // code to add to grid
        gridArray.add(new Item("Mutton Xacuti",2));
        gridArray.add(new Item("Pork Vindaloo",2));
        gridArray.add(new Item("Goan Fish Curry",2));

        gridView = (GridView) findViewById(R.id.glayout);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
                Toast.makeText(getApplicationContext(), (CharSequence) gridArray.get(position).getDesc(), Toast.LENGTH_SHORT).show();
            }
        });

    }
    public  void grid3(){

        //remove trash values
        gridArray.removeAll(gridArray);
        // code to add to grid
        gridArray.add(new Item("Methi thepala",3));
        gridArray.add(new Item("Dal Dhokli",3));
        gridArray.add(new Item("White Dhokla",3));


        gridView = (GridView) findViewById(R.id.glayout);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
                Toast.makeText(getApplicationContext(), (CharSequence) gridArray.get(position).getDesc(), Toast.LENGTH_SHORT).show();
            }
        });

    }
    public  void grid4(){

        //remove trash values
        gridArray.removeAll(gridArray);
        // code to add to grid
        gridArray.add(new Item("Dum Aloo",4));
        gridArray.add(new Item("Kashmiri Rogan",4));
        gridArray.add(new Item("Kashmiri Dahi B",4));

        gridView = (GridView) findViewById(R.id.glayout);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
                Toast.makeText(getApplicationContext(), (CharSequence) gridArray.get(position).getDesc(), Toast.LENGTH_SHORT).show();
            }
        });

    }
    public  void grid5(){

        //remove trash values
        gridArray.removeAll(gridArray);
        // code to add to grid
        gridArray.add(new Item("Vange Che Bhari",5));
        gridArray.add(new Item("Vada Bhat",5));
        gridArray.add(new Item("Saoji chiken",5));
        gridArray.add(new Item("Saoji mutton",5));

        gridView = (GridView) findViewById(R.id.glayout);
        customGridAdapter = new CustomGridViewAdapter(this, R.layout.row_grid, gridArray);
        gridView.setAdapter(customGridAdapter);
        gridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> arg0, View v, int position, long arg3) {
                Toast.makeText(getApplicationContext(), (CharSequence) gridArray.get(position).getDesc(), Toast.LENGTH_SHORT).show();
            }
        });

    }


 }

