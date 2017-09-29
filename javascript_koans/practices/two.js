// helper function for output
function writeAnswer(answer) {
  $('div.answer').append($('<div>').text(answer));
}

function isTrafficJam(numberOfAutoRickshaws, isAfterEightPm) {
  var answer;

  if(isAfterEightPm){
    answer=false;
  } else {
    if(numberOfAutoRickshaws > 40) {
      answer=true
    }else {
      answer=false;
    }
  }

  writeAnswer(answer);
}

isTrafficJam(30, false);
