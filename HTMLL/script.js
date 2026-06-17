console.log("Hello")
const a=1;
const b=2;
console.log(a);
const str="Priya";
console.log(str)
const fruits=["Apple","Banana","Grapes"] 
console.log(fruits[0])
fruits[1]="Orange"
console.log(fruits[1])
const arr = [1, "ram"]
for(let i=0;i<arr.length;i++){
    console.log(arr[i]);
}
const fourth =document.getElementById("ptag")
fourth.innerHTML="this is my fourth class";
function newFunction(){
    console.log("I am Writing Something");
}
const input=document.getElementById("eventListener")
const output=document.getElementById("ptag")
input.addEventListener("input",()=>{
    output.textContent=input.value
})
const newvar = document.createElement("h1")
newvar.textContent="New Paragraph";
document.body.appendChild(newvar);