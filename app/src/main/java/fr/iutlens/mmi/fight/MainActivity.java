package fr.iutlens.mmi.fight;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

import fr.iutlens.mmi.fight.utils.Pad;

public class MainActivity extends AppCompatActivity {

    private GameView gameView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        gameView = findViewById(R.id.gameView);

        Pad pad = findViewById(R.id.pad);

        gameView.setPad(pad);
    }

    public void onFire(View view) {
        gameView.onFire();
    }
}
