package navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import screen.Description
import screen.MainInformation
import screen.Settings
import screen.SplashInformation
import screen.UserProfile


@Composable
fun NavigationInfo() {
    val navController = rememberNavController()
    NavHost(navController = navController, startDestination = ScreenInfo.SplashInformation.route) {
        composable(ScreenInfo.SplashInformation.route) {
            SplashInformation(navController)
        }
        composable(ScreenInfo.MainInformation.route) {
            MainInformation(navController)
        }
        composable(ScreenInfo.Description.route) {
            Description(navController)

        }
        composable(ScreenInfo.UserProfile.route)
        {
            UserProfile(navController)
        }
        composable(ScreenInfo.Settings.route)
        {
            Settings(navController)
        }
    }

}