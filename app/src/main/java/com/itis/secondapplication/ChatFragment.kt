package com.itis.secondapplication

import android.os.Bundle
import android.view.View
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.itis.secondapplication.databinding.FragmentChatsBinding

class ChatFragment : Fragment(R.layout.fragment_chats) {

    private var binding : FragmentChatsBinding? = null

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding = FragmentChatsBinding.bind(view)

        binding?.btnNavigationToMusic?.setOnClickListener{
            findNavController().navigate(R.id.action_chatFragment_to_musicFragment,
                MusicFragment.createBundle(ChatFragment().javaClass.name))
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }
}