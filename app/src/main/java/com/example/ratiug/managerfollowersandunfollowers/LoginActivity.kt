package com.example.ratiug.managerfollowersandunfollowers

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class LoginActivity : AppCompatActivity() {
    private lateinit var appId: String
    private lateinit var appSecret: String
    private lateinit var redirectURI: String

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        appId = getString(R.string.instagram_app_id)
        appSecret = getString(R.string.instagram_secret)
        redirectURI = getString(R.string.instagram_redirect_uri)

    }

    val mAuthUrl = ("https://api.instagram.com/oauth/authorize"
            + "?client_id=$appId"
            + "&redirect_uri=$redirectURI"
            + "&scope=user_profile,user_media"
            + "&response_type=code")

}