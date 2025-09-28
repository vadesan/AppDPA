package dev.luischang.appdpa.presentation.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import coil.compose.rememberAsyncImagePainter
import dev.luischang.appdpa.data.model.CountryModel

val mockCountries = listOf(
    CountryModel("Colombia", 11, "https://flagcdn.com/64x48/co.png"),
    CountryModel("Ecuador", 11, "https://flagcdn.com/64x48/ec.png"),
    CountryModel("Peru", 11, "https://flagcdn.com/64x48/pe.png"),
    CountryModel("Uruguay", 11, "https://flagcdn.com/64x48/uy.png"),
    CountryModel("Paraguay", 11, "https://flagcdn.com/64x48/pr.png"),
    CountryModel("Chile", 11, "https://flagcdn.com/64x48/cl.png"),
    CountryModel("Argentina", 11, "https://flagcdn.com/64x48/ar.png"),
    CountryModel("Ecuador", 11, "https://flagcdn.com/64x48/ec.png"),
    CountryModel("Peru", 11, "https://flagcdn.com/64x48/pe.png"),
    CountryModel("Uruguay", 11, "https://flagcdn.com/64x48/uy.png"),
    CountryModel("Paraguay", 11, "https://flagcdn.com/64x48/pr.png"),
    CountryModel("Chile", 11, "https://flagcdn.com/64x48/cl.png"),
    CountryModel("Argentina", 11, "https://flagcdn.com/64x48/ar.png")
)
@Composable
fun HomeScreen(){
    Column(
        modifier = Modifier.fillMaxSize().padding(16.dp)
    ) {
        Text("Ranking FIFA 2025" , style = MaterialTheme.typography.titleLarge)
        Spacer(modifier = Modifier.height(16.dp))

        LazyColumn {
            items(mockCountries) { country ->
                Card(
                    modifier = Modifier.fillMaxSize().padding(vertical = 2.dp)
                ){
                    Row(modifier = Modifier.padding(4.dp)){
                        Image(
                            contentDescription = country.name,
                            contentScale = ContentScale.Crop,
                            modifier = Modifier.size(32.dp).padding(4.dp),
                            painter = rememberAsyncImagePainter(country.imageUrl)
                        )

                        Column {
                            Text(country.name, style = MaterialTheme.typography.titleMedium)
                            Text(country.ranking.toString(), style = MaterialTheme.typography.titleSmall)
                        }
                    }
                }
            }
        }



    }

}