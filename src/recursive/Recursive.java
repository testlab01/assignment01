/**
Copyright 2017 prahveen29@gmail.com

Licensed under the Apache License, Version 2.0 (the "License");
you may not use this file except in compliance with the License.
You may obtain a copy of the License at
 
http://www.apache.org/licenses/LICENSE-2.0

Unless required by applicable law or agreed to in writing, software
distributed under the License is distributed on an "AS IS" BASIS,
WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
See the License for the specific language governing permissions and
limitations under the License.

* @author Prahveen Thiruchelvam
**
*/

/*returns the maximum among the first n elements of an array*/


package recursive;

public class Recursive {

	public int getMax(int numArray[], int length){
		if(length == 1){
			return numArray[0];
		}else{
			return findMax(getMax(numArray, length -1), numArray[length -1]);
		}
			
	}
	
	private int findMax(int num1, int num2){
		return num1 > num2 ? num1:num2;
	}

}
