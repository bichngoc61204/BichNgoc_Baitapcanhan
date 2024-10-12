package com.example.xinglenapp.fragment;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.GridView;

import androidx.fragment.app.Fragment;

import com.example.xinglenapp.R;

public class CategoryFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_category, container, false);

        // Tạo dữ liệu tĩnh cho danh mục
        String[] categories = {
                "Thú bông", "Móc khóa", "Áo len", "Lót ly", "Gấu", "Khăn"
        };

      // Tìm GridView từ layout
        GridView gridView = view.findViewById(R.id.danhmuc);

        // Sử dụng ArrayAdapter để đổ dữ liệu lên GridView
        ArrayAdapter<String> adapter = new ArrayAdapter<>(getActivity(),
                R.layout.grid_item, categories);
        gridView.setAdapter(adapter);

        return view;
    }

}
