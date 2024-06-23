process.stdin.resume();
process.stdin.setEncoding('utf8');

process.stdin.on('data', function (chunk) {

    process.stdout.write("I got my first solution!!!");

    process.exit();
});
