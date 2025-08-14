function validateEmail() {
    let email = document.getElementById("email").value.trim();
    let emailError = document.getElementById("emailError");
    let regex = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;

    if (email === "") {
        emailError.textContent = "Email is required";
        return false;
    } else if (!regex.test(email)) {
        emailError.textContent = "Invalid email format";
        return false;
    } else {
        emailError.textContent = "";
        return true;
    }
}

function validatePassword() {
    let password = document.getElementById("password").value.trim();
    let passwordError = document.getElementById("passwordError");

    if (password === "") {
        passwordError.textContent = "Password is required";
        return false;
    } else {
        passwordError.textContent = "";
        return true;
    }
}

function handleLogin() {
    let isEmailValid = validateEmail();
    let isPasswordValid = validatePassword();

    if (isEmailValid && isPasswordValid) {
        alert("Login Successful");
    } else {
        alert("Error in Login");
    }
}