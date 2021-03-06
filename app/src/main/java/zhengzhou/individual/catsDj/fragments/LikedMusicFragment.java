package zhengzhou.individual.catsDj.fragments;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.List;

import zhengzhou.individual.catsDj.R;
import zhengzhou.individual.catsDj.util.SongImageResult;

public class LikedMusicFragment extends Fragment {

    private RecyclerView recyclerView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.music_fragment, container, false);
        recyclerView = view.findViewById(R.id.music_rec_view);
        return view;
    }

    private List<SongImageResult.Al> data =  new ArrayList<>();
    public LikedMusicAdapter adapter;

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        recyclerView.setLayoutManager(new LinearLayoutManager(getContext()));
        adapter =  LikedMusicAdapter.builder().context(this.getContext()).data(this.data).build();
        recyclerView.setAdapter(adapter);
    }
}
