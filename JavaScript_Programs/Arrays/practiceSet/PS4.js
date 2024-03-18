//4] Create an array of square of given numbers

let range = prompt(`enter range `);
let myarr = [];

for (let index = 0; index < range; index++) {
  let array = [prompt(`enter ${index + 1} array`)];
  myarr.push(array);
}
console.log(myarr);
// alert(myarr);
let newArr= myarr.map((val)=> val*val);
console.log(newArr);