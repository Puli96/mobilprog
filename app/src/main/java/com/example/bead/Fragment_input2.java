package com.example.bead;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class Fragment_input2 extends Fragment {

    private FragmentInput2Listener listener;
    private EditText editText;
    private Button button;

    public interface FragmentInput2Listener{
        void onInput2Sent(CharSequence input);
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View v = inflater.inflate(R.layout.fragment_input2,container,false);

        editText = v.findViewById(R.id.edit_text);
        button = v.findViewById(R.id.next);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                CharSequence input = editText.getText();
                listener.onInput2Sent(input);
            }
        });

        return v;
    }

    public void updateEditText(CharSequence newText){
        editText.setText(newText);
    }

    @Override
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof  FragmentInput2Listener){
            listener = (FragmentInput2Listener) context;
        }else{
            throw new RuntimeException(context.toString() + " must implement FragmentInput2  Listener");
        }
    }

    @Override
    public void onDetach() {
        super.onDetach();
        listener = null;
    }
}
