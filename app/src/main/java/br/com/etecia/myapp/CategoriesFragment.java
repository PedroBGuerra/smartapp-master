package br.com.etecia.myapp;

import android.os.Bundle;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.widget.ViewPager2;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.google.android.material.tabs.TabLayout;
import com.google.android.material.tabs.TabLayoutMediator;
import com.smartcity.app.R;

public class CategoriesFragment extends Fragment {

    private TabLayout tabLayout;
    private ViewPager2 viewPager2;

    public CategoriesFragment() {
        // Required empty public constructor
    }

    public static CategoriesFragment newInstance() {
        return new CategoriesFragment();
    }

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_categories, container, false);
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        tabLayout = view.findViewById(R.id.tab_layout);
        viewPager2 = view.findViewById(R.id.view_pager);

        // Setup ViewPager with adapter
        CategoryTabsAdapter adapter = new CategoryTabsAdapter(this);
        viewPager2.setAdapter(adapter);

        // Connect TabLayout with ViewPager2
        new TabLayoutMediator(tabLayout, viewPager2,
                (tab, position) -> {
                    switch (position) {
                        case 0:
                            tab.setText(getString(R.string.mobilidade));
                            break;
                        case 1:
                            tab.setText(getString(R.string.seguranca));
                            break;
                        case 2:
                            tab.setText(getString(R.string.sustentabilidade));
                            break;
                        case 3:
                            tab.setText(getString(R.string.saude));
                            break;
                    }
                }).attach();
    }
}
