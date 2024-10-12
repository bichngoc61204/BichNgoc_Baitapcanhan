package com.example.xinglenapp;
import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager2.widget.ViewPager2;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.example.xinglenapp.fragment.ViewPagerAdapter;

public class MainActivity extends AppCompatActivity {

    private ViewPager2 viewPager;
    private BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        viewPager = findViewById(R.id.view_pager);
        bottomNavigationView = findViewById(R.id.bottom_navigation);

        // Sử dụng FragmentStateAdapter mới với ViewPager2
        ViewPagerAdapter adapter = new ViewPagerAdapter(this);  // `this` là FragmentActivity
        viewPager.setAdapter(adapter);

        // Lắng nghe sự thay đổi trang trên ViewPager
        viewPager.registerOnPageChangeCallback(new ViewPager2.OnPageChangeCallback() {
            @Override
            public void onPageSelected(int position) {
                switch (position) {
                    case 0:
                        bottomNavigationView.getMenu().findItem(R.id.menu_home).setChecked(true);
                        break;
                    case 1:
                        bottomNavigationView.getMenu().findItem(R.id.menu_category).setChecked(true);
                        break;
                    case 2:
                        bottomNavigationView.getMenu().findItem(R.id.menu_favourite).setChecked(true);
                        break;
                    case 3:
                        bottomNavigationView.getMenu().findItem(R.id.menu_user).setChecked(true);
                        break;
                }
            }
        });

        // Lắng nghe sự kiện chọn từ BottomNavigationView
        bottomNavigationView.setOnItemSelectedListener(item -> {
            int itemId = item.getItemId();
            if (itemId == R.id.menu_home) {
                viewPager.setCurrentItem(0);
                return true;
            } else if (itemId == R.id.menu_category) {
                viewPager.setCurrentItem(1);
                return true;
            } else if (itemId == R.id.menu_favourite) {
                viewPager.setCurrentItem(2);
                return true;
            } else if (itemId == R.id.menu_user) {
                viewPager.setCurrentItem(3);
                return true;
            }
            return false;
        });
    }
}
