function openPage(page){
    window.location.href = page;
}
function startTest() {
    document.documentElement.requestFullscreen();
}
let malpractice = 0;

document.addEventListener("visibilitychange", function () {

    if (document.hidden) {
        malpractice++;

        alert("⚠️ Malpractice Detected!\nTab Switching is Not Allowed.");

        document.getElementById("warning").innerHTML =
            "Warnings : " + malpractice;
    }

});
document.addEventListener("fullscreenchange", function () {

    if (!document.fullscreenElement) {

        alert("⚠️ Full Screen Exit Detected!");

    }

});
document.addEventListener("contextmenu", function(e){

    e.preventDefault();

});
document.addEventListener("keydown", function(e){

    if(e.key==="F12"){

        e.preventDefault();

    }

});
document.addEventListener("keydown", function(e){

    if(e.ctrlKey && e.shiftKey && e.key==="I"){

        e.preventDefault();

    }

});
let warnings = 0;

document.addEventListener("visibilitychange", function(){

    if(document.hidden){

        warnings++;

        if(warnings>=3){

            alert("Test Submitted due to Malpractice");

            submitQuiz();

        }

    }

});