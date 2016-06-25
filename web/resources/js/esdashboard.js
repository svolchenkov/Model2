/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/* global xhr */

var text;

function loadData(dataUrl, target) {
    var xhr = new XMLHttpRequest();
    xhr.overrideMimeType("application/json");
    xhr.open('GET', dataUrl, true);
    xhr.onreadystatechange = function () {
        if (xhr.readyState == 4) {
            if (xhr.status == 200) {
                console.log(xhr.responseText);
                document.getElementById("marginPercentageData").innerHTML = xhr.responseText;
//parse jsoon data
                var jsonData = JSON.parse(xhr.responseText);
                var optionsHTML = ''
                for (var i = 0; i < jsonData[rootElement].length; i++) {
                    optionsHTML += '<option value="' + jsonData[rootElement][i].code + '">'
                            + jsonData[rootElement][i].name + '</option>'
                }
                var targetCurrentHtml = target.innerHTML;
                target.innerHTML = targetCurrentHtml + optionsHTML;
            } else {
                console.log(xhr.statusText);
// Show the error on the Web page
                tempContainer.innerHTML += '<p class="error">Error getting ' +
                        target.name + ": " + xhr.statusText + ",code: " + xhr.status + "</p>";
            }
        }
    }
    xhr.send();
}


function receiveData() {
    loadData('http://localhost:8282/Model2/es/dashboard');
}

function test() {
    var x, text;

    // Get the value of the input field with id="numb"
    x = document.getElementById("numb").value;

    // If x is Not a Number or less than one or greater than 10
    if (isNaN(x) || x < 1 || x > 10) {
        text = "Input not valid";
    } else {
        text = "Input OK";
    }
    document.getElementById("wholesaleCostData").innerHTML = text;
}

function showHPSolarList(str) {
    alert(str);
}
function Warn() {
    alert("This is a warning message!");
    document.write("This is a warning message!");
}

//-------------------- dialog box ---------------------------------

function CustomAlert() {
    this.render = function (dialog) {
        var winW = window.innerWidth;
        var winH = window.innerHeight;
        var dialogoverlay = document.getElementById('dialogoverlay');
        var dialogbox = document.getElementById('dialogbox');
        dialogoverlay.style.display = "block";
        dialogoverlay.style.height = winH + "px";
        dialogbox.style.left = (winW / 2) - (550 * .5) + "px";
        dialogbox.style.top = "100px";
        dialogbox.style.display = "block";
        document.getElementById('dialogboxhead').innerHTML = "Acknowledge This Message";
        document.getElementById('dialogboxbody').innerHTML = dialog;
//        document.getElementById('dialogboxfoot').innerHTML = '<button onclick="Alert.ok()">OK</button>';
    };
    this.ok = function () {
        document.getElementById('dialogbox').style.display = "none";
        document.getElementById('dialogoverlay').style.display = "none";
    };
}
var Alert = new CustomAlert();

/* ------------------- graph down -------------------------------------*/

function graphShow() {
//    document.getElementById("graphShow").style.height = "800px";
    document.getElementById("graphShow").innerHTML = '<table><tr><td><p:chart type="bar" model="#{graphShow.combinedModel}" style="height:300px" ></p:chart></td></tr></table>';
}
function buttonCloseGraph () {
    document.getElementById("graphShow").style.height = "1px";
    document.getElementById("graphShow").innerHTML = "<p></p>";
}

