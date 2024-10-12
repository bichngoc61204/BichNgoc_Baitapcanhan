package com.example.xinglenapp.fragment;
import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class ViewPagerAdapter extends FragmentStateAdapter {

    public ViewPagerAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        // Tạo và trả về fragment tương ứng với vị trí của view pager
        switch (position) {
            case 0:
                return new HomeFragment(); // Fragment trang chủ
            case 1:
                return new CategoryFragment(); // Fragment chuyên mục
            case 2:
                return new FavouriteFragment(); // Fragment yêu thích
            case 3:
                return new UserFragment(); // Fragment người dùng
            default:
                return new HomeFragment(); // Fragment mặc định
        }
    }

    @Override
    public int getItemCount() {
        // Trả về số lượng trang (fragments) trong ViewPager
        return 4;  // Giả sử bạn có 4 trang tương ứng với 4 fragments
    }
}
