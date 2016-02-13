var mongoose = require('mongoose'),  
    Schema   = mongoose.Schema;

var cotxe = new Schema({  
  id:    { type: Number },
  nomXofer:  { type: String },
  lat:     { type: Number },
  lon:  { type: Number },
  numPlaces:   { type: Number },
  marca:  { type: String },
  model:    { type: String},
  color:  { type: String },
  codiPostal:  { type: Number },
  active:  { type: Boolean },
});

module.exports = mongoose.model('Cotxe', cotxe);