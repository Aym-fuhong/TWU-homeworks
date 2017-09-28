// helper function for output
function writeAnswer(answer) {
  $('div.answer').append($('<div>').text(answer));
}

function kiteGame(numberOfKites) {
  let answer = '';
  for (let i = 1; i <= numberOfKites; i++) {
    if (i % 3 === 0) {
      answer += "Peche!";
    }
    if (i % 5 === 0) {
      answer += "Ipo kaate!";
    }
    if (i % 3 !== 0 && i % 5 !== 0) {
      answer += i;
    }
    answer += " ";
  }
  writeAnswer(answer);
}

kiteGame(100);
