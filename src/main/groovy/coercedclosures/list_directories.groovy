package coercedclosures

new File('/').list(
    { File dir, String name -> new File(name).directory } )
//        as FilenameFilter)
        .each { fileName -> println fileName }
