console.log("Window object",window);
console.log("This keyword",this)
console.log(this===window)
//window.alert("Welcome to Javascript Class")
//alert('welcome UST Global and Testyantra')
//let conformdelete=confirm("Are you sure you want to delete")
//console.log('confirm Delete',conformdelete)

//let username= prompt("What is your name?","Suprith")//prompt(string,default value)
//console.log("UserName",username)
const person={
    firstname:"Alia",
    age:26,
    lastname:"Kapoor",
    getName : function(){
        console.log("This Keyword",this)
        return this.firstname+''+this.lastname// return person.firstname+''+peron.lastname
    }
}

let fullName = person.getName()
console.log("Full Name",fullName)