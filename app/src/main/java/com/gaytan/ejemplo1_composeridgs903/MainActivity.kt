package com.gaytan.ejemplo1_composeridgs903

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

private val messages: List<MyMessage> = listOf(
    MyMessage("Picolo", body = "Es un namekiano que surgió tras ser creado en los últimos momentos de vida de su padre, siendo su actual reencarnación. Aunque en un principio fue el archienemigo de Son Goku, con el paso del tiempo fue haciéndose menos malvado hasta finalmente convertirse en un ser bondadoso y miembro de los Guerreros Z. A través del tiempo, también comenzó a tomarle cariño a su discípulo Son Gohan, a quien veía como una especie de \\\"vástago\\\" y formando un lazo de amistad con este."),
    MyMessage("Freezer", body = "Freezer es el tirano espacial y el principal antagonista de la saga de Freezer."),
    MyMessage("Krilin", body = "Amigo cercano de Goku y guerrero valiente, es un personaje del manga y anime de Dragon Ball. Es uno de los principales discípulos de Kame-Sen'nin, Guerrero Z, y el mejor amigo de Son Goku. Es junto a Bulma uno de los personajes de apoyo principales de Dragon Ball, Dragon Ball Z y Dragon Ball Super. Aparece en Dragon Ball GT como personaje secundario. En el Arco de Majin Boo, se retira de las artes marciales, optando por formar una familia, como el esposo de la Androide Número 18 y el padre de Marron"),
    MyMessage("Gohan", body = "Son Gohanda en su tiempo en España, o simplemente Gohan en Hispanoamérica, es uno de los personajes principales de los arcos argumentales de Dragon Ball Z, Dragon Ball Super y Dragon Ball GT. Es un mestizo entre saiyano y humano terrícola. Es el primer hijo de Son Goku y Chi-Chi, hermano mayor de Son Goten, esposo de Videl y padre de Pan"),
    MyMessage("Bulma", body = "Bulma es la protagonista femenina de la serie manga Dragon Ball y sus adaptaciones al anime Dragon Ball, Dragon Ball Z, Dragon Ball Super y Dragon Ball GT. Es hija del Dr. Brief y su esposa Panchy, hermana menor de Tights y una gran amiga de Son Goku con quien inicia la búsqueda de las Esferas del Dragón. En Dragon Ball Z tuvo a Trunks, primogénito de quien sería su esposo Vegeta, a su hija Bra[3] y su hijo adulto del tiempo alterno Trunks del Futuro Alternativo."),
    MyMessage( "Zarbon", body = "Zarbon es uno de los secuaces de Freezer y un luchador poderoso." ),
    MyMessage("Cell", body = "Cell conocido como Célula en España, es un bioandroide creado por la computadora del Dr. Gero, quien vino del futuro de la línea 3 con la intención de vengarse de Goku por haber acabado con el Ejército del Listón Rojo, y con ello el sueño de todo villano: dominar el mundo. Es el antagonista principal del Arco de los Androides y Cell."),
    MyMessage("Gotenks", body = "Gotenks también conocido inicialmente como Gotrunk en el doblaje al español de España, es el resultado de la Danza de la Fusión llevada a cabo correctamente por Goten y Trunks.")

)
data class PersonajeTarjeta(val title: String, val body: String)



class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Ejemplo1ComposerIDGS903Theme {
                Tarjeta()
            }
        }

    }
}

    data class MyMessage(val title: String, val body: String)
    @supepressLint("UnusedMaterial3ScaffoldPaddingParameter")
    @OptIn(ExperimentalMaterial3Api::class)
@Composable
fun MyMessage(messages: List<MyMessage>){

        Scaffold {}
            AppBarWithImage()
                }



    @Composable
    fun Tarjeta(Personajes: List<PersonajeTarjeta>) {
      LazyColumn {
          //ImagenHeroe()
         items(Personajes){ Personaje ->
             MyPersonajes(Personaje)
         }
      }

      }



@Composable
fun MyPersonajes(Personaje: PersonajeTarjeta){
    Row {
        ImagenHeroe()
        Personajes(Personaje)
    }

    }


@Composable
fun MyMessage(Personajes: List<PersonajeTarjeta>){
    Column {
        Personajes(Personajes)
    }
}


@Composable
fun Personaje(name: String, color: Color, style: androidx.compose.ui.text.TextStyle){
    Text(text = name)
}



    @Composable
    fun Personaje() {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Column {
                Text("Gohan")
                Text("Son Goku")
            }
        }
    }


@Composable
fun Personajes(Personaje: Int){
    Column {
        Personaje(Personaje.title,
            MaterialTheme.colorScheme.primary,MaterialTheme.typography.headlineMedium)
        Personaje(Personaje.body,
            MaterialTheme.colorScheme.onBackground,MaterialTheme.typography.bodyLarge)

    }
}


    @Composable
    fun ImagenHeroe() {
        Image(
            painter = painterResource(id = R.drawable.goku_normal),
            contentDescription = "Goku",
            modifier = Modifier
                .padding(bottom = 8.dp)
                .size(100.dp)
                .clip(CircleShape)
                .background(MaterialTheme.colorScheme.tertiary)
        )
    }

    @Preview
    @Composable
    fun GreetingPreview() {
        Tarjeta()

    }



