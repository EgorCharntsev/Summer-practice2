package com.itis.secondapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.secondapplication.databinding.FragmentSettingsBinding

class SettingFragment : Fragment(R.layout.fragment_settings) {

    private var binding : FragmentSettingsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentSettingsBinding.bind(view)

        binding?.btnNavigationToMusic?.setOnClickListener{
            findNavController().navigate(R.id.action_settingFragment_to_musicFragment,
                MusicFragment.createBundle(SettingFragment().javaClass.name))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}