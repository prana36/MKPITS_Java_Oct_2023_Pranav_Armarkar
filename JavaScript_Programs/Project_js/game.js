let systemNum = Math.ceil(Math.random() * 100);
// console.log(systemNum);
let gusse = 0;
prompt(`Gusse the No. `);
while (true) {
  if (Number(prompt()) == systemNum) {
    alert(`congratulations you win`+`attemps is `+gusse);
    break;
  } else {
    alert(`Try again`);
    gusse++;
    continue;
  }
}
