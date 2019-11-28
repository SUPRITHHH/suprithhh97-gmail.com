const message = new Promise(function(resolve,reject){
    if(30<10){
        resolve([{
            name:"Suprith",
            age:67
        },{
            name:"Surya",
            age:68
        },{
            name:"Pramod",
            age:20,
        }])
    }else{
        reject('Failed')
    }
})

message.then(function(data){
    console.log('Employee Data',data)

}).catch(function(error){
    console.log("Failure Message",error)
})

function outerFunction(counter){
    function innerFunction(){
        let count;
        count = counter + 10;
        return count
    }

    return innerFunction
}

let innerFunc = outerFunction(28);
 let  counter = innerFunc()
 console.log('counter value',counter)