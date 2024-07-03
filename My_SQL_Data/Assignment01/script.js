document.addEventListener("DOMContentLoaded", () => {
  const loginToggle = document.getElementById("loginToggle");
  const registerToggle = document.getElementById("registerToggle");
  const loginForm = document.getElementById("loginForm");
  const registerForm = document.getElementById("registerForm");

  loginToggle.addEventListener("click", () => {
    loginForm.classList.remove("hidden");
    registerForm.classList.add("hidden");
    loginToggle.classList.add("active");
    registerToggle.classList.remove("active");
  });

  registerToggle.addEventListener("click", () => {
    loginForm.classList.add("hidden");
    registerForm.classList.remove("hidden");
    loginToggle.classList.remove("active");
    registerToggle.classList.add("active");
  });
});
