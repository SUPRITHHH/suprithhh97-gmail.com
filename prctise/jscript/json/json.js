const person = {
    name : "Sundresh ",
    age : 100,
    color : "white",
    address : {
        city : "Bijapur",
        state : "Karnataka",
        pincode :577201
    },

    hobbies : ["Coding","BirdWatching","singing"]
}

console.log("JavaScript Person Object",person)
const jsonObject = JSON.stringify(person)
console.log("JSON person Object",jsonObject)
const JavaScriptPersonobject = JSON.parse(jsonObject)
console.log("JavaScript person after parse",JavaScriptPersonobject)

localStorage.setItem("email","billgates@gmail.com")
const emailID = localStorage.getItem('email')
console.log('Email ID',emailID)
localStorage.clear();