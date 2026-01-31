package com.example.smartcampusapp.core.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.smartcampusapp.feature.auth.ui.LoginScreen
import com.example.smartcampusapp.feature.dashboard.ui.DashboardScreen
import com.example.smartcampusapp.feature.campusinfo.ui.CampusInfoScreen

@Composable
fun AppNavGraph(
    navController: NavHostController,
    startDestination: String = Routes.LOGIN
) {
    NavHost(
        navController = navController,
        startDestination = startDestination
    ) {

        composable(Routes.LOGIN) {
            LoginScreen(
                onLoginSuccess = {
                    navController.navigate(Routes.DASHBOARD) {
                        popUpTo(Routes.LOGIN) { inclusive = true }
                    }
                }
            )
        }

        composable(Routes.DASHBOARD) {
            DashboardScreen(
                onNavigateToCampusInfo = {
                    navController.navigate(Routes.CAMPUS_INFO)
                },
                onLogout = {
                    navController.navigate(Routes.LOGIN) {
                        popUpTo(0) { inclusive = true }
                    }
                }
            )
        }

        composable(Routes.CAMPUS_INFO) {
            CampusInfoScreen(
                onBack = { navController.popBackStack() }
            )
        }
    }
}
