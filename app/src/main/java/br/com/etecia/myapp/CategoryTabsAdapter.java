package br.com.etecia.myapp;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.viewpager2.adapter.FragmentStateAdapter;

public class CategoryTabsAdapter extends FragmentStateAdapter {

    public CategoryTabsAdapter(Fragment fragment) {
        super(fragment);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        switch (position) {
            case 0:
                return new CategoryDetailFragment("Mobilidade Urbana", 
                    "Sistemas inteligentes de tráfego, transporte público automatizado e gestão de tráfego em tempo real.");
            case 1:
                return new CategoryDetailFragment("Segurança Pública",
                    "Vigilância inteligente com câmeras de IA, resposta rápida a emergências e análise de padrões de criminalidade.");
            case 2:
                return new CategoryDetailFragment("Sustentabilidade",
                    "Gestão ambiental, eficiência energética, energia renovável e redução de emissões de carbono.");
            case 3:
                return new CategoryDetailFragment("Saúde e Bem-estar",
                    "Plataformas de telemedicina, monitoramento de saúde pública e bem-estar dos cidadãos urbanos.");
            default:
                return new CategoryDetailFragment("", "");
        }
    }

    @Override
    public int getItemCount() {
        return 4;
    }
}
