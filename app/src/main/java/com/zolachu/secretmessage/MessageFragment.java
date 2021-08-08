package com.zolachu.secretmessage;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link MessageFragment} factory method to
 * create an instance of this fragment.
 */
public class MessageFragment extends Fragment {

    public MessageFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_message, container, false);

        Button nextButton = view.findViewById(R.id.next);
        TextView messageView = view.findViewById(R.id.message);
        nextButton.setOnClickListener(v -> {
                    String message = messageView.toString();
                    MessageFragmentDirections.ActionMessageFragmentToEncryptFragment action = MessageFragmentDirections.actionMessageFragmentToEncryptFragment(message);

                    NavController navController = Navigation.findNavController(view);
                    navController.navigate(action);
                });
        return view;
    }
}