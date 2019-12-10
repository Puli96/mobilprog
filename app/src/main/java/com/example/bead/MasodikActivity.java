package com.example.bead;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

public class MasodikActivity extends AppCompatActivity implements Fragment_input2.FragmentInput2Listener, Fragment_input.FragmentInputListener{
    private Fragment_input fragment_input;
    private Fragment_input2 fragment_input2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_masodik);

    fragment_input = new Fragment_input();
    fragment_input2 = new Fragment_input2();

    getSupportFragmentManager().beginTransaction()
            .replace(R.id.fragmentInput, fragment_input)
            .replace(R.id.fragmentInput2,fragment_input2)
            .commit();

    }

    @Override
    public void onInputSent(CharSequence input) {
        fragment_input2.updateEditText(input);
    }

    @Override
    public void onInput2Sent(CharSequence input) {
        fragment_input.updateEditText(input);
    }
}
