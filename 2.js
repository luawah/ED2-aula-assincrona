const nums = [1, 3, 7, 21, 32, 44, 92, 11];

let target = 28;

const returnIndicies = (target, nums) => {
	for (let i = 0; i < nums.length; i++) {
		let val1 = nums[i];
		for (let j = i; j < nums.length; j++) {
			let val2 = nums[j];
			if (val1 + val2 === target) return [i, j];
		}
	}
	return "Não há par que somado corresponda ao valor pedido.";
};

console.log(returnIndicies(target, nums));
