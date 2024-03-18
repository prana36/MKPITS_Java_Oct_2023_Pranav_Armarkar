let num = [1,2,3,4,5,6,7,8,9,10];
let num1=num.filter(greater_than_5);

function greater_than_5(num) {
    return num>5;
    
}
console.log(num1);