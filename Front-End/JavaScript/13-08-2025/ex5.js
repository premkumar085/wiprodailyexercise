var x = 4; // global scope variable
const z = 9; // constant variable 

function f() {
    x = 9; 
    let y = 8; //block scope
    var z = 10;

    console.log("x in function is " + x); 
    console.log("y in function is " + y);
    console.log("z in function is " + z);


    if (true) {
        let z = 18; 
        console.log("y in if block is " + y); 
        console.log("z in if block is " + z); 
    }

    console.log("z in function is " + z); 
}

f(); // function call

console.log("x outside function is " + x); 
console.log("z outside function is " + z); 