package com.example.rollo

import android.os.Bundle
import android.widget.Button
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.rollo.ui.theme.RolloTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            RolloTheme {
                DiceRollerApp()
            }
            }
        }
}


@Preview
@Composable
fun DiceRollerApp() {

}

@Composable
fun DiceWithButtonAndImage(modifier: Modifier= Modifier
    .fillMaxSize()
    .wrapContentSize(Alignment.Center))
{
    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {

            Text(text = stringResource(id = R.string.roll))
        }

    }
// adding roll button
