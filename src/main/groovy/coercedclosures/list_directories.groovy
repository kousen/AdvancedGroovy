package coercedclosures

new File('.').list(
    { File dir, String name -> new File(name).isDirectory() } 
     as FilenameFilter).each { println it }
