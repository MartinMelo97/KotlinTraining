var str: String = null // throw error
var str: String? = null // allow set null
str.length // IDE shows error
str?.length // If str is null, return null, else, return length
str!!.length // The !! ensure that the value is not null
