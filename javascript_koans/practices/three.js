// js
function writeAnswer(answer) {
  $('div.answer').append($('<div>').text(answer));
}

function calculate(d, w, n){
  let result = 'Rs ';
  if(n){
    writeAnswer(result+1.5*(20 + 8 * (d-1) + 4 * w));
  } else {
    writeAnswer(result+20 + 8 * (d-1) + 4 * w);
  }
}

calculate(3.5,4,true);
