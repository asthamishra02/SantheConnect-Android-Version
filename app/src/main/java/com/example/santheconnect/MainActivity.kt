//package com.example.santheconnect
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.activity.enableEdgeToEdge
//import androidx.compose.foundation.layout.fillMaxSize
//import androidx.compose.foundation.layout.padding
//import androidx.compose.material3.Scaffold
//import androidx.compose.material3.Text
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.tooling.preview.Preview
//import com.example.santheconnect.ui.theme.SantheConnectTheme
//
//class MainActivity : ComponentActivity() {
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//        enableEdgeToEdge()
//        setContent {
//            SantheConnectTheme {
//                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
//                    Greeting(
//                        name = "Android",
//                        modifier = Modifier.padding(innerPadding)
//                    )
//                }
//            }
//        }
//    }
//}
//
//@Composable
//fun Greeting(name: String, modifier: Modifier = Modifier) {
//    Text(
//        text = "Hello $name!",
//        modifier = modifier
//    )
//}
//
//@Preview(showBackground = true)
//@Composable
//fun GreetingPreview() {
//    SantheConnectTheme {
//        Greeting("Android")
//    }
//}

//package com.example.santheconnect
//
//import android.os.Bundle
//import android.widget.Toast
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import com.google.firebase.firestore.FirebaseFirestore
//
//class MainActivity : ComponentActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        val db = FirebaseFirestore.getInstance()
//
//        val testData = hashMapOf(
//            "name" to "Mysore Santhe",
//            "type" to "Market"
//        )
//
//        db.collection("locations")
//            .add(testData)
//            .addOnSuccessListener {
//                Toast.makeText(this, "Firebase Connected!", Toast.LENGTH_LONG).show()
//            }
//            .addOnFailureListener {
//                Toast.makeText(this, "Failed!", Toast.LENGTH_LONG).show()
//            }
//
//        setContent {
//
//        }
//    }
//}

//
//package com.example.santheconnect
//
//import android.os.Bundle
//import androidx.activity.ComponentActivity
//import androidx.activity.compose.setContent
//import androidx.compose.foundation.background
//import androidx.compose.foundation.layout.*
//import androidx.compose.foundation.shape.RoundedCornerShape
//import androidx.compose.material3.Card
//import androidx.compose.material3.CardDefaults
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.draw.clip
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.layout.ContentScale
//import androidx.compose.ui.unit.dp
//import coil.compose.AsyncImage
//import com.google.android.gms.maps.model.CameraPosition
//import com.google.android.gms.maps.model.LatLng
//import com.google.maps.android.compose.GoogleMap
//import com.google.maps.android.compose.Marker
//import com.google.maps.android.compose.MarkerState
//import com.google.maps.android.compose.rememberCameraPositionState
//import androidx.compose.runtime.Composable
//
//class MainActivity : ComponentActivity() {
//
//    override fun onCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        setContent {
//            SantheConnectScreen()
//        }
//    }
//}
//
//@Composable
//fun SantheConnectScreen() {
//
//    val mysore = LatLng(12.2958, 76.6394)
//
//    val cameraPositionState = rememberCameraPositionState {
//        position = CameraPosition.fromLatLngZoom(mysore, 12f)
//    }
//
//    Column(
//        modifier = Modifier
//            .fillMaxSize()
//            .background(Color(0xFFFFF8E7))
//    ) {
//
//        Text(
//            text = "SantheConnect",
//            style = MaterialTheme.typography.headlineMedium,
//            modifier = Modifier.padding(16.dp)
//        )
//
//        GoogleMap(
//            modifier = Modifier
//                .fillMaxWidth()
//                .height(300.dp),
//            cameraPositionState = cameraPositionState
//        ) {
//
//            Marker(
//                state = MarkerState(position = mysore),
//                title = "Mysore Santhe",
//                snippet = "Traditional Karnataka Market"
//            )
//        }
//
//        Spacer(modifier = Modifier.height(16.dp))
//
//        SantheCard()
//    }
//}
//
//@Composable
//fun SantheCard() {
//
//    Card(
//        modifier = Modifier
//            .fillMaxWidth()
//            .padding(16.dp),
//
//        shape = RoundedCornerShape(20.dp),
//
//        elevation = CardDefaults.cardElevation(
//            defaultElevation = 8.dp
//        )
//    ) {
//
//        Column {
//
//            AsyncImage(
//                model = "https://images.unsplash.com/photo-1504674900247-0877df9cc836",
//                contentDescription = "Karnataka Food",
//
//                modifier = Modifier
//                    .fillMaxWidth()
//                    .height(220.dp)
//                    .clip(RoundedCornerShape(topStart = 20.dp, topEnd = 20.dp)),
//
//                contentScale = ContentScale.Crop
//            )
//
//            Column(
//                modifier = Modifier.padding(16.dp)
//            ) {
//
//                Text(
//                    text = "Mysore Santhe",
//                    style = MaterialTheme.typography.headlineSmall
//                )
//
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(
//                    text = "Authentic Jolada Rotti, Handicrafts, and Traditional Karnataka Food."
//                )
//
//                Spacer(modifier = Modifier.height(8.dp))
//
//                Text(
//                    text = "Open Today • 2 km away",
//                    color = Color.Gray
//                )
//            }
//        }
//    }
//}



package com.example.santheconnect

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import coil.compose.AsyncImage
import com.google.android.gms.maps.model.CameraPosition
import com.google.android.gms.maps.model.LatLng
import com.google.maps.android.compose.GoogleMap
import com.google.maps.android.compose.Marker
import com.google.maps.android.compose.MarkerState
import com.google.maps.android.compose.rememberCameraPositionState

class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            SantheConnectScreen()
        }
    }
}

data class SanthePlace(
    val name: String,
    val specialty: String,
    val imageUrl: String,
    val location: LatLng
)

@Composable
fun SantheConnectScreen() {

    val places = listOf(
        SanthePlace(
            "Mysore Santhe",
            "Authentic Jolada Rotti",
            "https://images.unsplash.com/photo-1504674900247-0877df9cc836",
            LatLng(12.2958, 76.6394)
        ),
        SanthePlace(
            "Bangalore Food Street",
            "Thatte Idli & Filter Coffee",
            "https://images.unsplash.com/photo-1517248135467-4c7edcad34c4",
            LatLng(12.9716, 77.5946)
        )
    )

    val cameraPositionState = rememberCameraPositionState {
        position = CameraPosition.fromLatLngZoom(
            LatLng(12.9716, 77.5946),
            7f
        )
    }

    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFFFF8E1))
    ) {

        Text(
            text = "SantheConnect",
            style = MaterialTheme.typography.headlineMedium,
            modifier = Modifier.padding(16.dp)
        )

        GoogleMap(
            modifier = Modifier
                .fillMaxWidth()
                .height(300.dp),
            cameraPositionState = cameraPositionState
        ) {

            places.forEach { place ->

                Marker(
                    state = MarkerState(position = place.location),
                    title = place.name,
                    snippet = place.specialty
                )
            }
        }

        LazyColumn(
            modifier = Modifier.fillMaxSize()
        ) {

            items(places) { place ->

                Card(
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(12.dp),
                    elevation = CardDefaults.cardElevation(defaultElevation = 6.dp)
                ) {

                    Column {

                        AsyncImage(
                            model = place.imageUrl,
                            contentDescription = place.name,
                            modifier = Modifier
                                .fillMaxWidth()
                                .height(200.dp)
                        )

                        Column(
                            modifier = Modifier.padding(12.dp)
                        ) {

                            Text(
                                text = place.name,
                                style = MaterialTheme.typography.titleLarge
                            )

                            Spacer(modifier = Modifier.height(6.dp))

                            Text(
                                text = place.specialty,
                                style = MaterialTheme.typography.bodyLarge
                            )
                        }
                    }
                }
            }
        }
    }
}