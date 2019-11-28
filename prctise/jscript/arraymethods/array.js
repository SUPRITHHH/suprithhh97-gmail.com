const hobbies=["Sleeping","Reading","Writing","Roaming"];
console.log(typeof hobbies);

const isArrayOrNot = Array.isArray(hobbies);
console.log("Hobbies array or not",isArrayOrNot) ;
const hasCricket = hobbies.includes("Reading");
console.log("Using include method",hasCricket);
hobbies.push("Cricket");hobbies.push("Volleyball");
console.log("After push method",hobbies);
hobbies.pop();
console.log('After Pop method',hobbies);
hobbies.unshift("Numismatics","Singing");
console.log("After Unshift method",hobbies)
hobbies.shift();
console.log("After Shift method",hobbies);

const hobbies1=["Sleeping","Cricket","Eating","Coding","Roaming"];
hobbies1.splice(1,3,"Bird Watchhing","Pubg");
console.log("After Splice method",hobbies1);
const afterSlice = hobbies1.slice(2,4);
console.log("After slice method",hobbies1);
console.log("After slice method",afterSlice);
const indexOfCoding = hobbies1.indexOf('Coding',1);
console.log('Index of coding',indexOfCoding);
const string = hobbies1.join("-");
console.log(string);
const numbers = [100,200,300,400]
 const num1= numbers.map(function(value,index){
      let newValue = value + 50;
      return newValue;
    })

    console.log("After Map method",num1);
    const nums2=numbers.map(value=>value+500)
    console.log("After map arrow function",nums2);

    const filterNum = 
       numbers.filter(function(value,index){

        if(value>200){
            return true;
        }
        else{
            return false;
        }
       })

       console.log("After filter method",filterNum);

       const filterNumArrow =
       numbers.filter(value=>value>200)
       console.log("After filter method",filterNumArrow);