package screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.personalinformation.R
import navigation.ScreenInfo

@Composable
fun MainInformation(navController: NavController) {
    Column(
        modifier = Modifier.fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    )
    {
        Image(
            painter = painterResource(R.drawable.nn), contentDescription = "Imagen personal",
            modifier = Modifier.height(200.dp)
        )

        Spacer(modifier = Modifier.height(16.dp))

        Text(text = "Mi nombre es Jonathan Aguilar", style = MaterialTheme.typography.titleLarge)
        Text(text = "Soy programador")
        Text(text = "@Jonhi_zzz")

        Spacer(modifier = Modifier.height(16.dp))

        Button(onClick = { navController.navigate(route = ScreenInfo.Description.route) }) {
            Text("Vamos alla")
        }
    }
}

@Preview(showSystemUi = true)
@Composable
fun MainInformationPreviw(){
    //MainInformation()
}