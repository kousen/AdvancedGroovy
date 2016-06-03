package metaprogramming

import java.util.logging.*

Logger.metaClass.methodMissing = { String name, args ->
    println "inside methodMissing with $name"
    int val = Level.WARNING.intValue() +
        (Level.SEVERE.intValue() - Level.WARNING.intValue()) * Math.random()
    def level = new CustomLevel(name.toUpperCase(),val)
    def impl = { Object... varArgs ->
        delegate.log(level,varArgs[0])
    }
    Logger.metaClass."$name" = impl
    impl(args)
}


Logger log = Logger.getLogger(this.class.name)
log.hey 'what up?'
log.whoa 'dude, seriously'
log.rofl "you're kidding, right?"
log.rofl 'rolling on the floor laughing'
log.rofl 'rolling on the floor laughing'
log.whatever 'heavy sigh'
log.sup('sup, dude')