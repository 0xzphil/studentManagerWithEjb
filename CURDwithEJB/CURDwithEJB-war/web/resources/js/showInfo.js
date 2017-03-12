/* 
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */


$(document).ready(function(){
    console.log("OK");
    getSvInfo();
    
});

function getSvInfo(){
    $(".detailsTableOddRow").click(function(){
        console.log("Clicked");
        console.log($(this).find(".studentId").html());
        J2lib.ajaxGet("/CURDwithEJB-war/faces/getStudent?id="+ $(this).find(".studentId").html(), function(data){
            showInfo(data);
        });
    });
}

function showInfo(data){
    console.log(data);
    $("#nameModal").text(data.name);
    $("#msvModal").text(data.msv);
    $("#sexModal").text(data.sex);
    $("#dobModal").text(data.date_of_birth);
    $("#qqModal").text(data.qq);
    $("#emailModal").text(data.email);
    $("#sdtModal").text(data.phone_number);
    PF('dlg3').show();
}

