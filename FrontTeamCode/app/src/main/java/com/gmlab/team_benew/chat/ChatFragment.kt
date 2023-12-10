package com.gmlab.team_benew.chat

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment
import com.gmlab.team_benew.R

class ChatFragment:Fragment() {
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        //val roomId = arguments?.getString("roomId")

        //val roomId_bundle=view.findViewById<TextView>(R.id.hello)

        //roomId_bundle.setText(roomId)
        return inflater.inflate(R.layout.fragment_chatting, container, false)

        //val view:View=inflater.inflate(R.layout.fragment_chatting, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val room=arguments?.getString("roomId")

        val roomIdTextView=view.findViewById<TextView>(R.id.hello)
        roomIdTextView.text=room
    }

}