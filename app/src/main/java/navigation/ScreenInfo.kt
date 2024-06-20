package navigation

sealed class ScreenInfo(val route: String) {
        object SplashInformation: ScreenInfo("splash_information")
        object MainInformation: ScreenInfo("main_information")
        object Description: ScreenInfo("description")
        object UserProfile: ScreenInfo("user_profile")

        object Settings: ScreenInfo("settings")

}