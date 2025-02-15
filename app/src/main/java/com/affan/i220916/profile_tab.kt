package com.affan.i220916

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView

class profile_tab : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_profile_tab)
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main)) { v, insets ->
            val systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars())
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom)
            insets
        }

        val homeBtn = findViewById<ImageView>(R.id.home_btn)
        homeBtn.setOnClickListener {
            val intent = Intent(this, feed::class.java)
            startActivity(intent)
        }

        val recyclerProfilePost = findViewById<RecyclerView>(R.id.recycler_view_posts)
        val layoutManager = LinearLayoutManager(this)
        recyclerProfilePost.layoutManager = layoutManager

        val profileList = mutableListOf<profile_model>()

        profileList.add(profile_model(R.drawable.affan_pfp, R.drawable.eye_pfp,R.drawable.faaira_pfp))
        profileList.add(profile_model(R.drawable.ham_pfp , R.drawable.ham2_pfp,R.drawable.shayaan_pfp))
        profileList.add(profile_model(R.drawable.adil_pfp,))


        recyclerProfilePost.adapter = profile_adapter(profileList)
    }
}