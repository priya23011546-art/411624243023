let observers=[]
function attach(observer){
    observers.push(observer)
}
function detach(observer){
    let newobservers=[]
    for(let i of observers){
        if(i!==observer){
            newobservers.push(i)
        }
    }
    observers=newobservers
}
function notify(){
    for(let i of observers){
        console.log(i + " is notified")
    }
}   
attach("A")
attach("B")
notify()
attach("C")
detach("B")
notify()