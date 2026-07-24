let messages = [];
const input = document.getElementById("messageInput");
const addBtn = document.getElementById("addBtn");
const clearBtn = document.getElementById("clearBtn");
const count = document.getElementById("count");
const status = document.getElementById("status");
const messageSection = document.getElementById("messageSection");
input.addEventListener("input", function () {
    count.textContent = input.value.length;
});
function displayMessages() {
    messageSection.innerHTML = "";
    messages.forEach(function(message) {
        let p = document.createElement("p");
        p.className = "message";
        p.textContent = message;
        messageSection.appendChild(p);
        setTimeout(function () {
            if (messages.includes(message)) {
                messages.splice(messages.indexOf(message), 1);
                displayMessages();
                status.textContent = "Message Expired";
            }
        }, 10000);

    });

}
addBtn.addEventListener("click", function () {
    let text = input.value.trim();
    let promise = new Promise(function (resolve, reject) {
        if (text.length >= 3) {
            resolve(text);
        } else {
            reject("Message must contain at least 3 characters");
        }
    });
    promise
        .then(function (msg) {
            status.textContent = "Message Added Successfully";
            messages.push(msg);
            displayMessages();
            input.value = "";
            count.textContent = 0;
        })
        .catch(function (error) {
            status.textContent = error;

        });
});
clearBtn.addEventListener("click", function () {
    messages = [];
    messageSection.innerHTML = "";
    status.textContent = "All Messages Cleared";

});