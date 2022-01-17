package com.example.navigationview;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getMenuInflater().inflate(R.menu.mnutoolbar , menu);
    }
    @Override public boolean onOptionsItemSelected(MenuItem item) {
        switch (item.getItemId()) {
            case R.id.mnuNuevo:
                Toast.makeText(this.getApplicationContext(),"Ha presionado opción Nuevo ",Toast.LENGTH_LONG).show();
                return true;
                case R.id.mnuBuscar:
                    Toast.makeText(this.getApplicationContext(),"Ha presionado opción Buscar " ,Toast.LENGTH_LONG).show();
                    return true;
                    case R.id.mnuSetting:
                        Toast.makeText(this.getApplicationContext(),"Ha presionado opción Setting" ,Toast.LENGTH_LONG).show();
                        return true;
                        default:
                            return super.onOptionsItemSelected(item);        }
    }
}