//creates a new array by performing
//some operation on each array element
const rollNo = [1,2,3,4,5,6,7,8,9];
let roll = rollNo.map((value) =>{
    return value * 2;
});
console.log(roll);