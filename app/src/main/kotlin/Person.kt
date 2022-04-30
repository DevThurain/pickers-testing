class Person {

    var name: String? = null
        get() {
            return "U $field"
        }
     set(value){
        if(!value.isNullOrEmpty()){
            field = value
        }
    }

    companion object{
        var email : String? = null

        fun getPersonInfo(){
            //1
            if(email != null){}

            //2
            email?.let {  }

            //3
            email = email ?: ""
        }
    }



}