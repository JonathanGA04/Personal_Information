package screen

import android.annotation.SuppressLint
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.TopAppBar
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.navigation.NavController


@OptIn(ExperimentalMaterial3Api::class)
@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun Description(navController: NavController){
    Scaffold(topBar = {
        TopAppBar(title = { Text(text = "Descripcion") }, navigationIcon = { IconButton(
            onClick = { /*TODO*/ }) {
            Icon(imageVector = Icons.Default.ArrowBack , contentDescription = "Arroy Back", modifier = Modifier.clickable { navController.popBackStack() } )
        }
        } )

    }) {
        DescriptionBody(navController)
    }

}
@Composable
fun DescriptionBody(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(text = "Voy iniciando en Android estudio y esta es mi primera aplicacion")
    }
}