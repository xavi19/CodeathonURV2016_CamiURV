// Author: CamiURV
// Febrero 2016


//Require de los modulos
var express = require('express');
var app = express();
var http = require('http').Server(app);
var io = require('socket.io')(http);
var bodyParser = require('body-parser');


var mapa = io.of('/mapa');
var chat = io.of('/chat');
var rooms =["main"];


//Configuración
app.set('view engine','jade');
app.set('port', process.env.PORT || 3000);
app.use(express.static('/public'));
app.use(bodyParser.json());
app.use(bodyParser.urlencoded({extended: true}));

//Rutas
app.get('/cotxe', function(req, res){
	res.render('cotxe');

});


app.post('/cotxe', function(data){
	

});
app.post('/passatger', function(req, res){
	
});

app.get('/cotxe/:canal', function(req, res){
	res.render('cotxe');
});

app.get('/peu', function(req, res){
	res.render('peu');
	
});

// LLegir de cotxes.json
app.get('/chat', function(req, res){
	res.render('chat')
	
});


app.get('/form', function(req, res){
	res.render('form')
})

//Manejo de eventos para los clientes con sockets
mapa.on('connection', function(socket){
	var urlEnd = socket.handshake.headers.referer.split('/');

	socket.on('addRoom', function(room) {
        rooms.push(room);
        console.log(rooms);
        if (rooms.length >99){
        	rooms.length = 0;
        }
    });
    socket.on('removeRoom', function(room){
    	var aux = rooms.indexOf(room);
    	delete rooms[aux];
    	console.log(rooms);
    })
	socket.on('send loc', function(data){
		for (var i = rooms.length - 1; i >= 0; i--) {
			mapa.in(rooms[i]).emit('print loc', data);
		};
		
	}); 
	// funcion para suscribirme al ultimo param de la url
	if (urlEnd[urlEnd.length-2] === 'cotxe'){
		socket.join(urlEnd[urlEnd.length-1]);
	}
});

chat.on('connection', function(socket){
  	socket.on('chat message', function(msg){
		chat.emit('chat message', msg);
    });
});

console.log(rooms);





//Puerto para servir
http.listen(app.get('port'), function(){
  console.log('Express server listening on port ' + app.get('port'));
});