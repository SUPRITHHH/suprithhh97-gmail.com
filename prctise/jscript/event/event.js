function showMessage(){
    alert("Welcome");
}

function changeColor(){
    let pElement = document.getElementById('mover')
    pElement.style.color="green"
}

function removeColor(){
    let rElement = document.getElementById('mover')
    rElement.style.color="Black"
}

function printHello(){
    //console.log('Hello')
    let userName=document.getElementById('username').value
    document.getElementById('showuser').textContent=userName
}

let name = "SUPRITH"
let age = 21;
let phoneno = 9008957673;
console.log('Name is '+name+'Age is '+age+'phone no is'+phoneno);
console.log(`Name is ${name} Age is ${age} phone no is ${phoneno}`)
console.log(`2+2 =${2+2} `)
document.getElementById('b1').disabled = false;