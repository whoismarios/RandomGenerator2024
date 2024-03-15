package com.example.randomgenerator2024;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.randomgenerator2024.databinding.FragmentSecondBinding;

import java.util.Random;

public class SecondFragment extends Fragment {

    private FragmentSecondBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {


        binding = FragmentSecondBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    @SuppressLint("SetTextI18n")
    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        if (getArguments() != null) {
            int counterValue = getArguments().getInt("counterValue", 0);

            String randomNumberString = returnRandomNumberAsString(counterValue);

            binding.randomTxt.setText(randomNumberString);
            binding.messageTxt.setText(getString(R.string.message) + " " + counterValue);
        } else {
            binding.randomTxt.setText("0");
        }

        binding.BackBtn.setOnClickListener(v ->
                NavHostFragment.findNavController(SecondFragment.this)
                        .navigate(R.id.action_SecondFragment_to_FirstFragment)
        );
    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

    public String returnRandomNumberAsString(int counterValue){
        Random random = new Random();

        int randomNumber = random.nextInt(counterValue + 1);
        return Integer.toString(randomNumber);
    }

}