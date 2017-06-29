   public double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int length1 = nums1.length;
		int length2 = nums2.length;
		int length = length1 + length2;
		ArrayList<Integer> list = new ArrayList<>();
		int p = 0 , q = 0;
		while(p < length1 && q < length2){
			if(nums1[p] < nums2[q]){
				list.add(nums1[p]);
				p++;
			}else{
				list.add(nums2[q]);
				q++;
			}
		}
		while(p < length1){
			list.add(nums1[p]);
			p++;
		}
		while(q < length2){
			list.add(nums2[q]);
			q++;
		}
		System.out.println(list.toString());
		if ( (length) % 2 == 0){
			return ((double)list.get(length/2) + list.get(length/2 -1)) / 2;
		}else{
			return list.get(length / 2);
		}
    }