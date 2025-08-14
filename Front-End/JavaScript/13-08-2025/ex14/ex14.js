let cities = ["Mumbai", "Delhi", "Chennai", "Kolkata", "Hyderabad", "Bengaluru"];

function loadCities() {
    let dropdown = document.getElementById("cityDropdown");
    dropdown.innerHTML = '<option value="">--Select City--</option>'; 

    for (let i = 0; i < cities.length - 1; i++) {
        for (let j = 0; j < cities.length - i - 1; j++) {
            if (cities[j].toLowerCase() > cities[j + 1].toLowerCase()) {
                let temp = cities[j];
                cities[j] = cities[j + 1];
                cities[j + 1] = temp;
            }
        }
    }

    for (let city of cities) {
        let option = document.createElement("option");
        option.text = city;
        option.value = city;
        dropdown.add(option);
    }
}
