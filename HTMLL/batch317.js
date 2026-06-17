console.log("A");
setTimeout(()=>{

    console.log("D");
},2000)
setTimeout(()=>{
    
    console.log("B");
},0)
console.log("c")
function example(){
    console.log("Hi")
}
const example1=()=>{
    console.log("Hello")
}
const promise= new Promise((resolve,reject) => {
    // const success =true;
    // if(success){
    //     console.log("DONE")
    // }
    // else{
        
    //     console.log("fail")
    // }
    setTimeout(example,4500)
    setTimeout(example1,0)
})
promise.then(res=>{console.log(res)})
.catch(err=>console.log())
