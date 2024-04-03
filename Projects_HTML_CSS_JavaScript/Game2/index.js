function start() {
  const randomNum = [];
  while (randomNum.length < 50) {
    const num = Math.floor(Math.random() * 50) + 1;
    if (!randomNum.includes(num)) {
      randomNum.push(num);
    }
  }
  const createDiv = document.getElementById("container");
  createDiv.innerHTML = ``;
  for (const numb of randomNum) {
    const gridItems = document.createElement("div");
    gridItems.classList.add("grid_num");
    gridItems.textContent = numb;
    createDiv.appendChild(gridItems);
  }
}
