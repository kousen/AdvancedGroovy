package gjdk

// trivial username, password
def u = 'username'
def p = 'password'

// base 64 encoding
def encoded = "$u:$p".getBytes().encodeBase64().toString()
println "$u:$p -> $encoded"
assert encoded == 'dXNlcm5hbWU6cGFzc3dvcmQ='

// decoded with multiple returns
def (user,pass) = new String(encoded.decodeBase64()).split(':')
println "(user,pass) = ($user,$pass)"
assert user == u
assert pass == p
