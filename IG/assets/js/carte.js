var mymap = L.map('mappage', {
	center :[51.505, -0.09], 
	zoom: 13
}	);

L.tileLayer('https://api.tiles.mapbox.com/v4/{id}/{z}/{x}/{y}.png?access_token={accessToken}', {
    attribution: 'Map data &copy; <a href="http://openstreetmap.org">OpenStreetMap</a> contributors, <a href="http://creativecommons.org/licenses/by-sa/2.0/">CC-BY-SA</a>, Imagery © <a href="http://mapbox.com">Mapbox</a>',
    maxZoom: 18,
    id: 'mapbox.streets',
    accessToken: 'pk.eyJ1Ijoic2ViMTAzOSIsImEiOiJjamc3Mm42OXEwYjUyMnFrbG1ubHN0c3dvIn0.5b1m4Gx84Aa-Bm3zseV8Eg'
}
).addTo(mymap);	