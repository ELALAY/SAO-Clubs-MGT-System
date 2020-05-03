//
// forms.js
//

function checkform(form, studid, clubid, sem, year, ranking)
{
    // Check each field has a value
    if (studid.value == ''	|| 
        clubid.value == ''	|| 
        sem.value == ''	|| 
        year.value == ''		|| 
        ranking.value == '') {
 
        alert('You must provide all the requested details. Please try again');
        return false;
   }


    function checkform3(form, studid, clubid, sem, year)
{
    // Check each field has a value
    if (studid.value == ''   || 
        clubid.value == ''    || 
       sem.value == ''    || 
        year.value == ''   ) {
 
        alert('You must provide all the requested details. Please try again');
        return false;
    }
 
    // TODO: Check the date

 //if(date.value>Date())
   // alert('You must provide a valid date. Please try again');
     //   return false;

    // Finally submit the form. 
    form.submit();
    return true;
}

function reset(){
    location.reload(true);
}
function submitForm(form){
form.submit;
}

function checkform2(form, clubdid, studid)
{
    // Check each field has a value
    if (clubid.value == '' || studid.value == '') {
 
        alert('You must provide the requested details. Please try again');
        return false;
    }
 
    // TODO: Check the date

 
    // Finally submit the form. 
    form.submit();
    return true;
}
