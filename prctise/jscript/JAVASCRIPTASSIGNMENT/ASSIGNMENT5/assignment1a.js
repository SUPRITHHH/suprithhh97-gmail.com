let password = document.getElementById("paswd");
let username = document.getElementById("username");

function showPassword() {
   
    if (password.type === "password") {
      password.type = "text";
    } else {
      password.type = "password";
    }
  }

