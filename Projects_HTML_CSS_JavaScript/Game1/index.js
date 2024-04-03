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

function startTimer(duration, display) {
  var timer = duration,
    minutes,
    seconds;
  setInterval(function () {
    minutes = parseInt(timer / 60, 10);
    seconds = parseInt(timer % 60, 10);

    minutes = minutes < 10 ? "0" + minutes : minutes;
    seconds = seconds < 10 ? "0" + seconds : seconds;

    display.textContent = minutes + ":" + seconds;

    if (--timer < 0) {
      timer = duration;
    }
  }, 1000);
}

window.onload = function () {
  var fiveMinutes = 60 * 5,
    display = document.querySelector("#timer");
  startTimer(fiveMinutes, display);
};
