package com.zolachu.secretmessage;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import android.widget.Toast;

/**
 * A simple {@link Fragment} subclass.
 * Use the {@link EncryptFragment} factory method to
 * create an instance of this fragment.
 */
public class EncryptFragment extends Fragment {

    public EncryptFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View view = inflater.inflate(R.layout.fragment_encrypt, container, false);

        String message = EncryptFragmentArgs.fromBundle(requireArguments()).getMessage();
        TextView encryptedMessageView = view.findViewById(R.id.encrypted_message);


        StringBuilder str = new StringBuilder(message).reverse();
        encryptedMessageView.setText(str);
        return view;
    }
}