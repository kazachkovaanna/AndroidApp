package com.example.kseniadiogenova.graphicus;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

/*import com.jjoe64.graphview.BarGraphView;
import com.jjoe64.graphview.GraphView;
import com.jjoe64.graphview.GraphViewSeries;
import com.jjoe64.graphview.GraphView.GraphViewData;
import com.jjoe64.graphview.LineGraphView;*/

import android.app.Activity;
import android.os.Bundle;

import android.view.Menu;
import android.view.View;

import android.widget.LinearLayout;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.activity_main);

     /*   // Линейный график
        GraphViewSeries exampleSeries = new GraphViewSeries(
                new GraphViewData[] { new GraphViewData(1, 3.0d),
                        new GraphViewData(2, 1.5d), new GraphViewData(3, 2.5d),
                        new GraphViewData(4, 1.0d), new GraphViewData(5, 1.3d) });

        GraphView graphView = new LineGraphView(this, "График каких-то данных");
        graphView.addSeries(exampleSeries);

        LinearLayout layout = (LinearLayout) findViewById(R.id.layout);
        layout.addView(graphView);*/

    }
}
