let num = [1, 2, 3, 4, 5, 6, 7, 8, 9, 10];
let num1 = num.reduce(add);// reduce convert array in single value 

function add(x,y) {
  return x+y;
}
console.log(num1);
