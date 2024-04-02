    package com.example.menu;
    import androidx.annotation.NonNull;
    import androidx.appcompat.app.AppCompatActivity;
    import androidx.fragment.app.Fragment;

    import android.provider.ContactsContract;
    import android.view.MenuItem;
    import android.os.Bundle;
    import com.google.android.material.bottomnavigation.BottomNavigationView;

    public class MainActivity extends AppCompatActivity {
        private BottomNavigationView bottomNavigationView;

        @Override
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);


            bottomNavigationView = findViewById(R.id.BottomNavigationView);
            bottomNavigationView.setOnItemSelectedListener(navListener);

        }

        private BottomNavigationView.OnItemSelectedListener navListener =
                new BottomNavigationView.OnItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selectedFragment = null;

                        if (item.getItemId() == R.id.home) {
                            selectedFragment = new home2() ;
                        } else if (item.getItemId() == R.id.profile) {
                            selectedFragment = new profile2();
                        } else if (item.getItemId() == R.id.settings) {
                            selectedFragment = new Profile();
                        }

                        getSupportFragmentManager().beginTransaction()
                                .replace(R.id.frame_layout, selectedFragment)
                                .commit();

                        return true;
                    }
                };

        }
