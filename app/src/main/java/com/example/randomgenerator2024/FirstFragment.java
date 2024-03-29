package com.example.randomgenerator2024;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.navigation.fragment.NavHostFragment;

import com.example.randomgenerator2024.databinding.FragmentFirstBinding;

public class FirstFragment extends Fragment {

    private FragmentFirstBinding binding;

    @Override
    public View onCreateView(
            @NonNull LayoutInflater inflater, ViewGroup container,
            Bundle savedInstanceState
    ) {

        binding = FragmentFirstBinding.inflate(inflater, container, false);
        return binding.getRoot();

    }

    public void onViewCreated(@NonNull View view, Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        final int[] counter = {0};

        binding
                .countBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter[0]++;
                binding.countTxt.setText(String.valueOf(counter[0]));
            }
        });

        binding.resetBtn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                counter[0] = 0;
                binding.countTxt.setText(String.valueOf(counter[0]));
            }
        });

        binding.randomBtn.setOnClickListener(v -> {
            Bundle bundle = new Bundle();

            if(counter[0] == 0) {
                Toast.makeText(v.getContext(), "The counter value must be greater than 0 !", Toast.LENGTH_LONG).show();
                return;
            }

            bundle.putInt("counterValue", counter[0]);
            NavHostFragment.findNavController(FirstFragment.this)
                    .navigate(R.id.action_FirstFragment_to_SecondFragment, bundle);
        });

        binding.toastBtn.setOnClickListener(v -> {
            Toast.makeText(v.getContext(), "Toast are great when you eat them with Cheese and Ham", Toast.LENGTH_LONG).show();

        });

    }

    @Override
    public void onDestroyView() {
        super.onDestroyView();
        binding = null;
    }

}