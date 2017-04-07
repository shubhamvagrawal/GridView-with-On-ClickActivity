package shubh.grid;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.GridView;

public class Grid extends AppCompatActivity {

    GridView androidGridView;

    String[] gridViewString = {
            "Alram", "Android", "Mobile",
    } ;
    int[] gridViewImageId = {
            R.drawable.pay, R.drawable.bank, R.drawable.books,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.gridview);

        CustomGrid adapterViewAndroid = new CustomGrid(Grid.this, gridViewString, gridViewImageId);
        androidGridView=(GridView)findViewById(R.id.grid_view_image_text);
        androidGridView.setAdapter(adapterViewAndroid);
        androidGridView.setOnItemClickListener(new AdapterView.OnItemClickListener() {

            @Override
            public void onItemClick(AdapterView<?> parent, View v,
                                    int position, long id) {

                if(position==0){
                    Intent iinent= new Intent(Grid.this,pay.class);
                    startActivity(iinent);
                }

                if(position==1){
                    Intent iinent= new Intent(Grid.this,pay.class);
                    startActivity(iinent);
                }

                if(position==2){
                    Intent iinent= new Intent(Grid.this,pay.class);
                    startActivity(iinent);
                }

            }

    });
}}