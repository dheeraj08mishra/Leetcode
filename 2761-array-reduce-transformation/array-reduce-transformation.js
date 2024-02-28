/**
 * @param {number[]} nums
 * @param {Function} fn
 * @param {number} init
 * @return {number}
 */
var reduce = function(nums, fn, init) {
        let acc = init;
    for (let index = 0; index < nums.length; index++) {
        const element = nums[index];
        acc= acc?fn(acc,element):element;

       
    }
    return acc;
};