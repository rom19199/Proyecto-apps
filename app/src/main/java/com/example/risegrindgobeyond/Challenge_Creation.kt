package com.example.risegrindgobeyond

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_challenge__creation.*
import kotlinx.android.synthetic.main.activity_challenge__creation.view.*

class Challenge_Creation : AppCompatActivity() {

    lateinit var ChallengeName : EditText
    lateinit var ChallengeFrec: EditText
    lateinit var ChallengeGoal: EditText
    lateinit var ChallengeDesc : EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_challenge__creation)
        ChallengeName = findViewById(R.id.editTextChallengeName)
        ChallengeFrec = findViewById(R.id.etFreq1)
        ChallengeFrec = findViewById(R.id.etFreq2)
        ChallengeGoal = findViewById(R.id.tvTime1)
        ChallengeDesc = findViewById(R.id.editTextDescription)

//        buttonConfirm.setOnClickListener(){
//            if(editTextChallengeName.text.isEmpty()){
//                Toast.makeText(this,"Enter Challenge name", Toast.LENGTH_SHORT).show()
//                editTextChallengeName.requestFocus()
//            }else{
//                val challenge = Models()
//                challenge.ChallengeName = editTextChallengeName.text.toString()
//                if(etFreq1.text.isEmpty())
//                    challenge.ChallengeFrec = etFreq1.text.toString()
//                if(etFreq2.text.isEmpty())
//                    challenge.ChallengeFrec = etFreq2.text.toString()
//                if(tvTime1.text.isEmpty())
//                    challenge.ChallengeGoal = tvTime1.text.toString()
//                if(editTextDescription.text.isEmpty())
//                    challenge.ChallengeDesc = editTextDescription.text.toString()
//                ChallengeProgress.dBhandler.addChallenges(this, challenge)
//                ClearEdit()
//                editTextChallengeName.requestFocus()
//
//            }
//
//        }
//        buttonCancel.setOnClickListener(){
//            ClearEdit()
//            finish()
//
//        }
//    }
//
//    private fun ClearEdit(){
//        editTextChallengeName.text.clear()
//        etFreq1.text.clear()
//        etFreq2.text.clear()
//        tvTime1.text.clear()
//        editTextDescription.text.clear()
//
//    }
    }
    fun addChallenge(v:View){

    }

}
