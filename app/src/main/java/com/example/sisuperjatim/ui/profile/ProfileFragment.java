package com.example.sisuperjatim.ui.profile;

//import android.content.Intent;
import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;
//import android.widget.TextView;

import androidx.annotation.NonNull;
//import androidx.cardview.widget.CardView;
import androidx.annotation.Nullable;
import androidx.cardview.widget.CardView;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProviders;

//import com.example.sisuperjatim.ProfileActivity;
import com.example.sisuperjatim.MainActivity;
import com.example.sisuperjatim.ProfileActivity;
import com.example.sisuperjatim.ProfileActivityLogged;
import com.example.sisuperjatim.R;
import com.example.sisuperjatim.SessionManager;

import java.util.HashMap;
//import java.time.Instant;

public class ProfileFragment extends Fragment {
    CardView cvTentangKami,cvCaraPenggunaan,cvHubungi,cvInputData,cvLogout;
    private ProfileViewModel profileViewModel;
    private TextView name, email;
    private CardView logout;
    SessionManager sessionManager;

    public View onCreateView(@NonNull LayoutInflater inflater,
                             ViewGroup container, Bundle savedInstanceState) {

        profileViewModel =
                ViewModelProviders.of(this).get(ProfileViewModel.class);
        View root ;
        root = inflater.inflate(R.layout.fragment_profile, container, false);


//        cvTentangKami.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        cvCaraPenggunaan.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        cvHubungi.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//            }
//        });
//
//        cvInputData.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intentInputData = new Intent(getActivity(), ProfileActivity.class);
//                startActivity(intentInputData);
//            }
//        });






//        final TextView textView = root.findViewById(R.id.text_notifications);
//        profileViewModel.getText().observe(this, new Observer<String>() {
//            @Override
//            public void onChanged(@Nullable String s) {
//                textView.setText(s);
//            }
//        });



        return root;
    }

//    @Override
//    public void onCreateView(@Nullable LayoutInflater inflater,
//                              ViewGroup container,
//                              Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//        View view = inflater.inflate(R.layout.fragment_profile, container, false);
//        sessionManager = new SessionManager(getContext());
//
//
//        name = view.findViewById(R.id.name);
//        email = view.findViewById(R.id.email);
//        logout = view.findViewById(R.id.logout);
//
//        Intent intent = getActivity().getIntent();
//        String extraName = intent.getStringExtra("name");
//        String extraEmail = intent.getStringExtra("email");
//
//        name.setText(extraName);
//        email.setText(extraEmail);
//
//        HashMap<String, String> user = sessionManager.getUserData();
//        String mName = user.get(sessionManager.NAME);
//        String mEmail = user.get(sessionManager.EMAIL);
//
//        name.setText(mName);
//        email.setText(mEmail);
//
//        logout.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                sessionManager.logout();
//                Toast.makeText(getContext(), "LOGGED OUT!", Toast.LENGTH_SHORT);
//            }
//        });
//
//    }

    @Override
    public void onViewCreated(View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        sessionManager = new SessionManager(getContext());
        name = view.findViewById(R.id.name);
        email = view.findViewById(R.id.email);
        logout = view.findViewById(R.id.logout);

        Intent intent = getActivity().getIntent();
        String extraName = intent.getStringExtra("name");
        String extraEmail = intent.getStringExtra("email");

        name.setText(extraName);
        email.setText(extraEmail);

        logout.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sessionManager.logout();
                Toast.makeText(getContext(), "LOGGED OUT!", Toast.LENGTH_SHORT);
            }
        });
    }
}

