package io.npc.hilttest

import android.os.Bundle
import android.util.Log
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {

    private val viewModel by viewModels<MainViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        Log.d("ViewModelLog", "activity oncreate")

        intent.putExtra("param", "param String")

        viewModel.run {
            Log.d("ViewModelLog", "param: $param")
            Log.d("ViewModelLog", "name: $repoName")
        }
    }
}
