package com.example.sisuperjatim.ui.profile;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

import com.example.sisuperjatim.ProfileActivity;
import com.example.sisuperjatim.R;
import java.time.Instant;

public class ProfileFragment extends Fragment {
    private CardView cardView;
    private ProfileViewModel profileViewModel;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {
        profileViewModel =
                ViewModelProviders.of(this).get(ProfileViewModel.class);
        View root = inflater.inflate(R.layout.fragment_profile, container, false);

        cardView = (CardView) cardView.findViewById(R.id.input_data);
        cardView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Instant instant = new Instant(this, ProfileActivity.class);
                startActivity(instant);
            }
        });

        return root;
    }
}

