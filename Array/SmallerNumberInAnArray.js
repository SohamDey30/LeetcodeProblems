var smallerNumbersThanCurrent = function(nums) {
    var output=[];
    for(var i=0;i<nums.length;i++){
         var count=0;
        for(var j=0;j<nums.length;j++){
             if(nums[i]>nums[j] && j!=i){
                 count=count+1;
             }
         }
        output.push(count);
    }
    return output;

};