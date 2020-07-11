$(function() {   
    $("#formsubmitforgot").validate({
        rules:{
         
             email:
             {
                 required:true,
                //  email:true,
                 email1:true,               
             },
             submitHandler:function(form){
                form.submit();
            }
            
             },
 
         messages:{
          
            email:{
                required:"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;Please Enter Email Address",
            },           
         }
    });
    
 });
 
 
 $.validator.addMethod("email1",function(value,element){
    return this.optional(element) || /^[a-zA-Z0-9._-]+@[a-zA-Z0-9.-]+\.[a-zA-Z]{2,4}$/.test(value);
 },"&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp&nbsp;Enter the Correct E-mail Format");
 

 