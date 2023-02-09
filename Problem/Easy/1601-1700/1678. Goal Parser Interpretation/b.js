/**
 * @param {string} command
 * @return {string}
 */
var interpret = function (command) {
	return command.replace(/\(\)/gi, "o").replace(/\(al\)/gi, "al");
};
