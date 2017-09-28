const arr = [5, 10, 20, 50, 100, 500, 1000];
function sum(List, currentList) {
  let result = [];
  for (let i = 0; i < currentList.length; i++) {
    let temp = findOne(List, currentList[i]);
    if (temp === undefined) {
      break;
    }
    result.push(temp);
  }
  return result.reduce((sum, value) => {
    return sum + value;
  }, 0);

}
function findOne(arr, one) {
  return arr.find(item => item === one);
}

console.log(sum(arr, [20, 50, 10, 20, 13, 500]));
