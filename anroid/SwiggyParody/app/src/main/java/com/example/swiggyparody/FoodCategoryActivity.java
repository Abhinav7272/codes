package com.example.swiggyparody;

import android.app.ListActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;

public class FoodCategoryActivity extends ListActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        ListView listfoods = getListView();
        ArrayAdapter<Food> listAdapter = new ArrayAdapter<Food>(this,android.R.layout.simple_list_item_1,Food.foods);
        listfoods.setAdapter(listAdapter);
    }

    @Override
    protected void onListItemClick(ListView listview, View itemview, int position, long id) {
        super.onListItemClick(listview, itemview, position, id);
        Intent intent = new Intent (FoodCategoryActivity.this, FoodActivity.class);
        intent.putExtra(FoodActivity.EXTRA_FOODNO,(int) id);
        startActivity(intent);
    }
}