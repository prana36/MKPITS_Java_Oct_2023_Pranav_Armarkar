//1] Creat an array of number and take input from the user to add numberto this array
let range = prompt(`enter range `);
let myarr=[];

for (let index = 0; index < range; index++)
 {
    let array = [prompt( `enter ${index+1} array`)];
    myarr.push(array);    
}
console.log(myarr);
alert(myarr);
