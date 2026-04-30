package com.example.matiasmasucci_parcial1_desarrollodeaplicaciones1



import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.matiasmasucci_parcial1_desarrollodeaplicaciones1.ui.screen.PokemonListScreenFinal
import com.example.matiasmasucci_parcial1_desarrollodeaplicaciones1.ui.theme.MatiasMasucci_Parcial1_DesarrolloDeAplicaciones1

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MatiasMasucci_Parcial1_DesarrolloDeAplicaciones1 {
            PokemonListScreenFinal()
        }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    MatiasMasucci_Parcial1_DesarrolloDeAplicaciones1 {
        Greeting("Android")
    }
}