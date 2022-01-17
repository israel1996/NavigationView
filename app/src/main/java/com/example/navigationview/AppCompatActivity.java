package com.example.navigationview;

public interface AppCompatActivity {

}
@Override
protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState);
    setContentView(R.layout.activity_main);
    Toolbar toolbar = (Toolbar) findViewById(R.id.appbar);
    setSupportActionBar(toolbar);}
