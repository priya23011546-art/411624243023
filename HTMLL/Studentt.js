let students = [];

function attach(student) {
    students.push(student);
}

function detach(student) {
    let newStudents = [];
    for (let i of students) {
        if (i !== student) {
            newStudents.push(i);
        }
    }
    students = newStudents;
}

function notify(message) {
    for (let i of students) {
        console.log(i + " received: " + message);
    }
}

attach("Vishnupriya");
attach("Arun");

notify("Holiday tomorrow");

attach("Priya");

detach("Arun");

notify("Exam on Monday");
notify("Festival celebration on Friday");