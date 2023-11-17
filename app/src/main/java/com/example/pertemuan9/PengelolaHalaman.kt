package com.example.pertemuan9

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.pertemuan7_contact.HalamanSatu

enum class PengelolaHalaman {
    Home,
    CustomerDetails,
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun well(

    navController: NavHostController = rememberNavController()
) {
    Scaffold(

    ) { innerPadding ->

        NavHost(
            navController = navController,
            startDestination = PengelolaHalaman.Home.name,
            modifier = Modifier.padding(innerPadding)
        ) {
            composable(route = PengelolaHalaman.Home.name) {
                HalamanHome(onNextButtonClicked = {
                    navController.navigate(PengelolaHalaman.CustomerDetails.name)
                }
                )
            }
            composable(route = PengelolaHalaman.CustomerDetails.name) {
                HalamanSatu(onSubmitButtonClicked = {})

            }
        }
    }
}
