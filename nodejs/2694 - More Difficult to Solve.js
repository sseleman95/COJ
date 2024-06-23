process.stdin.resume();
process.stdin.setEncoding('utf8');

process.stdin.on('data', function (chunk) {

    process.stdout.write("This is my first solution in programming competitions");

    process.exit();
});
