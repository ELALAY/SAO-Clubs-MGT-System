//
// forms.js
//

function checkform(form, pcode, descript, date, qoh, min, price, discount)
{
    // Check each field has a value
    if (pcode.value == ''	|| 
        descript.value == ''	|| 
        date.value == ''	|| 
        qoh.value == ''		|| 
        min.value == ''		|| 
        price.value == ''	|| 
        discount.value == '') {
 
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

function checkform2(form, pcode)
{
    // Check each field has a value
    if (pcode.value == '') {
 
        alert('You must provide the requested details. Please try again');
        return false;
    }
 
    // TODO: Check the date

 
    // Finally submit the form. 
    form.submit();
    return true;
}
