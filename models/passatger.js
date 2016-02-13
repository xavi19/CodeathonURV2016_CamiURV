var mongoose = require('mongoose'),  
    Schema   = mongoose.Schema;

var passatger = new Schema({  
  id:    { type: Number },
  nom: {type: String},
  lat:     { type: Number },
  lon:  { type: Number }
});

module.exports = mongoose.model('Passatger', passatger);