const message = new Promise(function(resolve,reject){
    if(30<10){
        resolve("Success")
    }else{
        reject('Failed')
    }
})

message.then(function(msg){
    console.log('Success Message',msg)

}).catch(function(error){
    console.log("Failure Message",error)
})