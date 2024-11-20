package com.example.tareasbasic.screens

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.AccountCircle
import androidx.compose.material.icons.filled.MoreVert
import androidx.compose.material.icons.filled.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.example.tareasbasic.R

@Composable
fun FirstScreen(navControlador: NavController) {
    Column (modifier = Modifier.fillMaxSize().background(colorResource(R.color.verdecito))) { // Ahí feo que flipas
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {

            Image(
                painter = painterResource(R.drawable.whalogo),
                contentDescription = "IconoWhasap",
                modifier = Modifier.size(250.dp)
            )

            Spacer(modifier = Modifier.weight(1f))
            Icon(imageVector = Icons.Default.Search, contentDescription = null, modifier = Modifier.padding(5.dp))
            Icon(imageVector = Icons.Default.MoreVert, contentDescription = null, modifier = Modifier.padding(25.dp))
        } // Whasa
        Row(
            modifier = Modifier.fillMaxWidth(),
            verticalAlignment = Alignment.CenterVertically
        ) {


        }
        User(name = stringResource(id = R.string.persona1))
        User(name = stringResource(id = R.string.persona2))
        User(name = stringResource(id = R.string.persona3))
        User(name = stringResource(id = R.string.persona4))
        User(name = stringResource(id = R.string.persona5))
    }
}

@Composable
fun User(name: String){
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(15.dp),
        verticalAlignment = Alignment.CenterVertically){

        Icon(
            imageVector = Icons.Default.AccountCircle,
            contentDescription = "lara makinonga",
            modifier = Modifier
                .size(80.dp)
                .padding(10.dp)
        )
        Column(
            modifier = Modifier.weight(1f)
        ) {
            Text(text = name)

        }
    }
}


