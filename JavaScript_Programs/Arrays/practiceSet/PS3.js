//filter for numbers divisible by 10 from a given array
let range = prompt(`enter range `);
let myarr = [];

for (let index = 0; index < range; index++) {
  let array = [prompt(`enter ${index + 1} array`)];
  myarr.push(array);
}
// console.log(myarr);
// alert(myarr);

let  newArr = myarr.filter(divisible_by_10);

function divisible_by_10(myarr)
{
     return myarr%10==0;

}
alert(newArr);
console.log(newArr)
