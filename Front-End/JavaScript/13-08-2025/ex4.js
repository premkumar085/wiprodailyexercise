input = document.getElementById("myInput");
label = document.getElementById("charCount");

input.oninput = function () {
    label.innerText = (50 - input.value.length) + " characters remaining";
};
