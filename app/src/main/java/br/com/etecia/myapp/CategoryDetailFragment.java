package br.com.etecia.myapp;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;



public class CategoryDetailFragment extends Fragment {

    private static final String ARG_TITLE = "title";
    private static final String ARG_DESCRIPTION = "description";

    private String categoryTitle;
    private String categoryDescription;

    public CategoryDetailFragment() {
        // Required empty public constructor
    }

    public CategoryDetailFragment(String title, String description) {
        this.categoryTitle = title;
        this.categoryDescription = description;
    }

    public static CategoryDetailFragment newInstance(String title, String description) {
        CategoryDetailFragment fragment = new CategoryDetailFragment();
        Bundle args = new Bundle();
        args.putString(ARG_TITLE, title);
        args.putString(ARG_DESCRIPTION, description);
        fragment.setArguments(args);
        return fragment;
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        if (getArguments() != null) {
            categoryTitle = getArguments().getString(ARG_TITLE);
            categoryDescription = getArguments().getString(ARG_DESCRIPTION);
        }
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        return inflater.inflate(R.layout.fragment_category_detail, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        TextView titleView = view.findViewById(R.id.category_title);
        TextView descView = view.findViewById(R.id.category_description);

        titleView.setText(categoryTitle);
        descView.setText(categoryDescription);
    }
}
