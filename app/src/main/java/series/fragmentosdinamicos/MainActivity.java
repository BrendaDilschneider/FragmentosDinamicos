package series.fragmentosdinamicos;

import android.annotation.TargetApi;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.net.Uri;
import android.os.Build;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener, BlankFragment.OnFragmentInteractionListener{

    Button boton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        boton = (Button) findViewById(R.id.button);
        boton.setOnClickListener(this);
    }

    @TargetApi(Build.VERSION_CODES.HONEYCOMB)
    @Override
    public void onClick(View v) {
        //Paso 1: obtengo la instancia del administrador de fragmentos
        FragmentManager fragmentManager= getFragmentManager();
        //Paso 2: crear una nueva transacción
        FragmentTransaction transaction = fragmentManager.beginTransaction();
        //Paso 3: crear nuevo fragmento y añadirlo
        BlankFragment fragment = new BlankFragment();
        transaction.add(R.id.layoutprincipal,fragment);
        //Paso 4: confirmar el cambio
        transaction.commit();
    }

    //Funcion de comunicacion actividad-fragmento
    @Override
    public void onFragmentInteraction(Uri uri) {

    }
}
