package com.example.fundo

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView


class LogIn : Fragment() {
//    private lateinit var auth: FirebaseAuth
    private var signUpTxt : TextView? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater!!.inflate(R.layout.fragment_log_in, null, false)
        signUpTxt = view.findViewById(R.id.btnNext)
        goToSignUpPage()
        return view
    }

    private fun goToSignUpPage() {
        signUpTxt?.setOnClickListener{
            val fragmentManager = getFragmentManager()
            val fragmentTransaction = fragmentManager?.beginTransaction()
            fragmentTransaction?.replace(R.id.fragment_container, SignUPFragment())
            fragmentTransaction?.commit()
        }

    }
}