function validateForm()
    {
        var email=document.forms["Form"]["email"].value;
        var pswd=document.forms["Form"]["password"].value;
        if (email==null ||email=="")
        {
            alert("Please enter an email...Dont leave it to null");
            return false;
        }
        else if(pswd==null || pswd=="")
        	{
        	  alert("Please enter a  password...Dont leave it to null");
              return false;
        	}
    }