function myFunction() {
    var inpObj = document.getElementById("id1");
    if (inpObj.checkValidity() == false) {
        document.getElementById("passcode").innerHTML =
            inpObj.validationMessage;
    } else {
        document.getElementById("passcode").innerHTML = "Passcode Valid";
    }
}