$(function() {  
    $("#formsubmitreset").validate({
        rules:{
            password1:{
                required:true,
                pass1:true
                 
              },
            
             password2:{
                required:true,
                equalTo:"#passs1"
                 
             },
             submitHandler:function(form){
                 form.submit();
             }
           
             },
 
         messages:{
            
            password1:{
             required: "&nbsp&nbsp;Please Enter New Password",
            
            },
           password2:{
               required: "&nbsp&nbsp;Please Enter the Password",
            
           }
           
         }
        
    });
    
 });
 

 
 $.validator.addMethod("pass1",function(value,element){
    return this.optional(element) || /^(?=.*[a-z])(?=.*[A-Z])(?=.*\d)(?=.*[@$!%*?&])[A-Za-z\d@$!%*?&]{8,}$/.test(value);
 },"&nbsp&nbsp;Enter valid Password");
 
