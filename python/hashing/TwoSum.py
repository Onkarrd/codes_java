def two_sum(nums, target):
  p1 = 0
  p2 = len(nums)-1
  while p1 < p2:
    if target == nums[p1] + nums[p2]:
      return [p1, p2]
    elif target < nums[p1] + nums[p2]:
      p2 -= 1
    else:
      p1 +=1
  return []


print(two_sum([1, 2, 3, 4, 5], 3))
