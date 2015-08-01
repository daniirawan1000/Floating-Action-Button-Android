
FloatingActionButton fab;

fab = (android.support.design.widget.FloatingActionButton) findViewById(R.id.fab1);
        fab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i = new Intent(MainActivity.this, Add_member.class);
                startActivity(i);
            }
        });
