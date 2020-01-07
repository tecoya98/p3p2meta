package mx.edu.tesoem.isc.teco.p3p2meta;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

import com.google.gson.Gson;

public class MainActivity extends AppCompatActivity {
     EditText txtnombre,txtedad,txtcorreo,txtcurp;
     TextView lbljson;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        txtnombre=findViewById(R.id.txtnombre);
        txtedad=findViewById(R.id.txtedad);
        txtcorreo=findViewById(R.id.txtcorreo);
        txtcurp=findViewById(R.id.txtcurp);
        lbljson=findViewById(R.id.lbljson);
    }
    public void convertirjson(View v){
        Datos datosobj=new Datos(txtnombre.getText().toString(),Integer.parseInt(txtedad.getText().toString()),txtcorreo.getText().toString(),txtcurp.getText().toString());
        Gson gson=new Gson();
        String cjson=gson.toJson(datosobj);
        lbljson.setText(cjson);
        Datos datosobj1=gson.fromJson(cjson,Datos.class);
        Log.i("informacion de json","Nombre"+datosobj1.getNombre()+"Edad"+datosobj1.getEdad()+"Correo"+datosobj1.getCorreo()+"Curp"+datosobj1.getCurp());
    }

}
