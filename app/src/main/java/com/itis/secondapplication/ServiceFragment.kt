package com.itis.secondapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

import com.itis.secondapplication.databinding.FragmentServicesBinding

class ServiceFragment : Fragment(R.layout.fragment_services) {

    private var binding : FragmentServicesBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentServicesBinding.bind(view)

        binding?.btnNavigationToMusic?.setOnClickListener{
            findNavController().navigate(R.id.action_serviceFragment_to_musicFragment,
                MusicFragment.createBundle(ServiceFragment().javaClass.name))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}