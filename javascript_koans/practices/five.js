const arr =[
  ["zara", "dhyaan", "dein"],
  ["mazarat", "chahenge"],
  ["attention", "please"]
];

function print (list) {
  let temp = list[1].reverse();
  return list[0].concat(temp).concat(list[2]);
}

console.log(print(arr));
