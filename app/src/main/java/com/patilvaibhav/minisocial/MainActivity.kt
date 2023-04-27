package com.patilvaibhav.minisocial

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import com.patilvaibhav.minisocial.navigation.AppNavHost
import com.patilvaibhav.minisocial.ui.screens.settingsscreen.SettingsScreenViewModel
import com.patilvaibhav.minisocial.ui.theme.MiniSocialTheme
import com.patilvaibhav.minisocial.utility.others.updateResources
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    private val settingsViewModel: SettingsScreenViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MiniSocialTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    AppNavHost(settingsViewModel)
                }
            }
        }
        lifecycleScope.launch {
            settingsViewModel.language.collect { language ->
                updateResources(this@MainActivity, language)
            }
        }
    }
}
