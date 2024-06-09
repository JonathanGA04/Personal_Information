package navigation

sealed class ScreenInfo(val route: String) {
        object SplashInformation: ScreenInfo("splash_Information")
        object MainInformation: ScreenInfo("main_Information")
        object Description: ScreenInfo("description")
}