function interpret(command: string): string {
	return command.replace(/\(\)/gi, "o").replace(/\(al\)/gi, "al");
};
