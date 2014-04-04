package com.starbaby.diyBook.clientbean;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;

import com.starbaby.diyBook.R;



import android.annotation.SuppressLint;
import android.test.AndroidTestCase;
import android.util.SparseArray;

@SuppressLint("UseSparseArrays")
@SuppressWarnings("unchecked")
public class EmojiDate extends AndroidTestCase{
	 public static final SparseArray emojiImgToNumArray;
	 public static final ArrayList<Integer> emojiImgArrray;
	 public static final HashMap<Integer,Integer> 	 emojiNumToImgArray;
	 static{
	  emojiImgToNumArray = new SparseArray();
	  emojiNumToImgArray = new HashMap<Integer,Integer> ();
	  emojiImgArrray = new ArrayList<Integer>();
	  
      emojiImgToNumArray.append(R.drawable.emoji_1f603, "1f603");
      emojiImgToNumArray.append(R.drawable.emoji_1f60d, "1f60d");
      emojiImgToNumArray.append(R.drawable.emoji_1f612, "1f612");
      emojiImgToNumArray.append(R.drawable.emoji_1f633, "1f633");
      emojiImgToNumArray.append(R.drawable.emoji_1f601, "1f601");
      emojiImgToNumArray.append(R.drawable.emoji_1f618, "1f618");
      emojiImgToNumArray.append(R.drawable.emoji_1f609, "1f609");
      emojiImgToNumArray.append(R.drawable.emoji_1f620, "1f620");
      emojiImgToNumArray.append(R.drawable.emoji_1f61e, "1f61e");
      emojiImgToNumArray.append(R.drawable.emoji_1f625, "1f625");
      emojiImgToNumArray.append(R.drawable.emoji_1f62d, "1f62d");
      emojiImgToNumArray.append(R.drawable.emoji_1f61d, "1f61d");
      emojiImgToNumArray.append(R.drawable.emoji_1f621, "1f621");
      emojiImgToNumArray.append(R.drawable.emoji_1f623, "1f623");
      emojiImgToNumArray.append(R.drawable.emoji_1f614, "1f614");
      emojiImgToNumArray.append(R.drawable.emoji_1f604, "1f604");
      emojiImgToNumArray.append(R.drawable.emoji_1f637, "1f637");
      emojiImgToNumArray.append(R.drawable.emoji_1f61a, "1f61a");
      emojiImgToNumArray.append(R.drawable.emoji_1f613, "1f613");
      emojiImgToNumArray.append(R.drawable.emoji_1f602, "1f602");
      emojiImgToNumArray.append(R.drawable.emoji_1f60a, "1f60a");
      emojiImgToNumArray.append(R.drawable.emoji_1f622, "1f622");
      emojiImgToNumArray.append(R.drawable.emoji_1f61c, "1f61c");
      emojiImgToNumArray.append(R.drawable.emoji_1f628, "1f628");
      emojiImgToNumArray.append(R.drawable.emoji_1f630, "1f630");
      emojiImgToNumArray.append(R.drawable.emoji_1f632, "1f632");
      emojiImgToNumArray.append(R.drawable.emoji_1f60f, "1f60f");
      emojiImgToNumArray.append(R.drawable.emoji_1f631, "1f631");
      emojiImgToNumArray.append(R.drawable.emoji_1f62a, "1f62a");
      emojiImgToNumArray.append(R.drawable.emoji_1f616, "1f616");
      emojiImgToNumArray.append(R.drawable.emoji_1f60c, "1f60c");
      emojiImgToNumArray.append(R.drawable.emoji_1f47f, "1f47f");
      emojiImgToNumArray.append(R.drawable.emoji_1f47b, "1f47b");
      emojiImgToNumArray.append(R.drawable.emoji_1f385, "1f385");
      emojiImgToNumArray.append(R.drawable.emoji_1f467, "1f467");
      emojiImgToNumArray.append(R.drawable.emoji_1f466, "1f466");
      emojiImgToNumArray.append(R.drawable.emoji_1f469, "1f469");
      emojiImgToNumArray.append(R.drawable.emoji_1f468, "1f468");
      emojiImgToNumArray.append(R.drawable.emoji_1f436, "1f436");
      emojiImgToNumArray.append(R.drawable.emoji_1f431, "1f431");
      emojiImgToNumArray.append(R.drawable.emoji_1f44d, "1f44d");
      emojiImgToNumArray.append(R.drawable.emoji_1f44e, "1f44e");
      emojiImgToNumArray.append(R.drawable.emoji_1f44a, "1f44a");
      emojiImgToNumArray.append(R.drawable.emoji_270a, "270a");
      emojiImgToNumArray.append(R.drawable.emoji_270c, "270c");
      emojiImgToNumArray.append(R.drawable.emoji_1f4aa, "1f4aa");
      emojiImgToNumArray.append(R.drawable.emoji_1f44f, "1f44f");
      emojiImgToNumArray.append(R.drawable.emoji_1f448, "1f448");
      emojiImgToNumArray.append(R.drawable.emoji_1f446, "1f446");
      emojiImgToNumArray.append(R.drawable.emoji_1f449, "1f449");
      emojiImgToNumArray.append(R.drawable.emoji_1f447, "1f447");
      emojiImgToNumArray.append(R.drawable.emoji_1f44c, "1f44c");
      emojiImgToNumArray.append(R.drawable.emoji_2764, "2764");
      emojiImgToNumArray.append(R.drawable.emoji_1f494, "1f494");
      emojiImgToNumArray.append(R.drawable.emoji_1f64f, "1f64f");
      emojiImgToNumArray.append(R.drawable.emoji_2600, "2600");
      emojiImgToNumArray.append(R.drawable.emoji_1f319, "1f319");
      emojiImgToNumArray.append(R.drawable.emoji_1f31f, "1f31f");
      emojiImgToNumArray.append(R.drawable.emoji_26a1, "26a1");
      emojiImgToNumArray.append(R.drawable.emoji_2601, "2601");
      emojiImgToNumArray.append(R.drawable.emoji_2614, "2614");
      emojiImgToNumArray.append(R.drawable.emoji_1f341, "1f341");
      emojiImgToNumArray.append(R.drawable.emoji_1f33b, "1f33b");
      emojiImgToNumArray.append(R.drawable.emoji_1f343, "1f343");
      emojiImgToNumArray.append(R.drawable.emoji_1f457, "1f457");
      emojiImgToNumArray.append(R.drawable.emoji_1f380, "1f380");
      emojiImgToNumArray.append(R.drawable.emoji_1f444, "1f444");
      emojiImgToNumArray.append(R.drawable.emoji_1f339, "1f339");
      emojiImgToNumArray.append(R.drawable.emoji_2615, "2615");
      emojiImgToNumArray.append(R.drawable.emoji_1f382, "1f382");
      emojiImgToNumArray.append(R.drawable.emoji_1f559, "1f559");
      emojiImgToNumArray.append(R.drawable.emoji_1f37a, "1f37a");
      emojiImgToNumArray.append(R.drawable.emoji_1f50d, "1f50d");
      emojiImgToNumArray.append(R.drawable.emoji_1f4f1, "1f4f1");
      emojiImgToNumArray.append(R.drawable.emoji_1f3e0, "1f3e0");
      emojiImgToNumArray.append(R.drawable.emoji_1f697, "1f697");
      emojiImgToNumArray.append(R.drawable.emoji_1f381, "1f381");
      emojiImgToNumArray.append(R.drawable.emoji_26bd, "26bd");
      emojiImgToNumArray.append(R.drawable.emoji_1f4a3, "1f4a3");
      emojiImgToNumArray.append(R.drawable.emoji_1f48e, "1f48e");

      
      emojiNumToImgArray.put(Integer.valueOf(0x1f603), Integer.valueOf(R.drawable.emoji_1f603));
      emojiNumToImgArray.put(Integer.valueOf(0x1f60d), Integer.valueOf(R.drawable.emoji_1f60d));
      emojiNumToImgArray.put(Integer.valueOf(0x1f612), Integer.valueOf(R.drawable.emoji_1f612));
      emojiNumToImgArray.put(Integer.valueOf(0x1f633), Integer.valueOf(R.drawable.emoji_1f633));
      emojiNumToImgArray.put(Integer.valueOf(0x1f601), Integer.valueOf(R.drawable.emoji_1f601));
      emojiNumToImgArray.put(Integer.valueOf(0x1f618), Integer.valueOf(R.drawable.emoji_1f618));
      emojiNumToImgArray.put(Integer.valueOf(0x1f609), Integer.valueOf(R.drawable.emoji_1f609));
      emojiNumToImgArray.put(Integer.valueOf(0x1f620), Integer.valueOf(R.drawable.emoji_1f620));
      emojiNumToImgArray.put(Integer.valueOf(0x1f61e), Integer.valueOf(R.drawable.emoji_1f61e));
      emojiNumToImgArray.put(Integer.valueOf(0x1f625), Integer.valueOf(R.drawable.emoji_1f625));
      emojiNumToImgArray.put(Integer.valueOf(0x1f62d), Integer.valueOf(R.drawable.emoji_1f62d));
      emojiNumToImgArray.put(Integer.valueOf(0x1f61d), Integer.valueOf(R.drawable.emoji_1f61d));
      emojiNumToImgArray.put(Integer.valueOf(0x1f621), Integer.valueOf(R.drawable.emoji_1f621));
      emojiNumToImgArray.put(Integer.valueOf(0x1f623), Integer.valueOf(R.drawable.emoji_1f623));
      emojiNumToImgArray.put(Integer.valueOf(0x1f614), Integer.valueOf(R.drawable.emoji_1f614));
      emojiNumToImgArray.put(Integer.valueOf(0x1f604), Integer.valueOf(R.drawable.emoji_1f604));
      emojiNumToImgArray.put(Integer.valueOf(0x1f637), Integer.valueOf(R.drawable.emoji_1f637));
      emojiNumToImgArray.put(Integer.valueOf(0x1f61a), Integer.valueOf(R.drawable.emoji_1f61a));
      emojiNumToImgArray.put(Integer.valueOf(0x1f613), Integer.valueOf(R.drawable.emoji_1f613));
      emojiNumToImgArray.put(Integer.valueOf(0x1f602), Integer.valueOf(R.drawable.emoji_1f602));
      emojiNumToImgArray.put(Integer.valueOf(0x1f60a), Integer.valueOf(R.drawable.emoji_1f60a));
      emojiNumToImgArray.put(Integer.valueOf(0x1f622), Integer.valueOf(R.drawable.emoji_1f622));
      emojiNumToImgArray.put(Integer.valueOf(0x1f61c), Integer.valueOf(R.drawable.emoji_1f61c));
      emojiNumToImgArray.put(Integer.valueOf(0x1f628), Integer.valueOf(R.drawable.emoji_1f628));
      emojiNumToImgArray.put(Integer.valueOf(0x1f630), Integer.valueOf(R.drawable.emoji_1f630));
      emojiNumToImgArray.put(Integer.valueOf(0x1f632), Integer.valueOf(R.drawable.emoji_1f632));
      emojiNumToImgArray.put(Integer.valueOf(0x1f60f), Integer.valueOf(R.drawable.emoji_1f60f));
      emojiNumToImgArray.put(Integer.valueOf(0x1f631), Integer.valueOf(R.drawable.emoji_1f631));
      emojiNumToImgArray.put(Integer.valueOf(0x1f62a), Integer.valueOf(R.drawable.emoji_1f62a));
      emojiNumToImgArray.put(Integer.valueOf(0x1f616), Integer.valueOf(R.drawable.emoji_1f616));
      emojiNumToImgArray.put(Integer.valueOf(0x1f60c), Integer.valueOf(R.drawable.emoji_1f60c));
      emojiNumToImgArray.put(Integer.valueOf(0x1f47f), Integer.valueOf(R.drawable.emoji_1f47f));
      emojiNumToImgArray.put(Integer.valueOf(0x1f47b), Integer.valueOf(R.drawable.emoji_1f47b));
      emojiNumToImgArray.put(Integer.valueOf(0x1f385), Integer.valueOf(R.drawable.emoji_1f385));
      emojiNumToImgArray.put(Integer.valueOf(0x1f467), Integer.valueOf(R.drawable.emoji_1f467));
      emojiNumToImgArray.put(Integer.valueOf(0x1f466), Integer.valueOf(R.drawable.emoji_1f466));
      emojiNumToImgArray.put(Integer.valueOf(0x1f469), Integer.valueOf(R.drawable.emoji_1f469));
      emojiNumToImgArray.put(Integer.valueOf(0x1f468), Integer.valueOf(R.drawable.emoji_1f468));
      emojiNumToImgArray.put(Integer.valueOf(0x1f436), Integer.valueOf(R.drawable.emoji_1f436));
      emojiNumToImgArray.put(Integer.valueOf(0x1f431), Integer.valueOf(R.drawable.emoji_1f431));
      emojiNumToImgArray.put(Integer.valueOf(0x1f44d), Integer.valueOf(R.drawable.emoji_1f44d));
      emojiNumToImgArray.put(Integer.valueOf(0x1f44e), Integer.valueOf(R.drawable.emoji_1f44e));
      emojiNumToImgArray.put(Integer.valueOf(0x1f44a), Integer.valueOf(R.drawable.emoji_1f44a));
      emojiNumToImgArray.put(Integer.valueOf(0x270a),  Integer.valueOf(R.drawable.emoji_270a));
      emojiNumToImgArray.put(Integer.valueOf(0x270c),  Integer.valueOf(R.drawable.emoji_270c));
      emojiNumToImgArray.put(Integer.valueOf(0x1f4aa), Integer.valueOf(R.drawable.emoji_1f4aa));
      emojiNumToImgArray.put(Integer.valueOf(0x1f44f), Integer.valueOf(R.drawable.emoji_1f44f));
      emojiNumToImgArray.put(Integer.valueOf(0x1f448), Integer.valueOf(R.drawable.emoji_1f448));
      emojiNumToImgArray.put(Integer.valueOf(0x1f446), Integer.valueOf(R.drawable.emoji_1f446));
      emojiNumToImgArray.put(Integer.valueOf(0x1f449), Integer.valueOf(R.drawable.emoji_1f449));
      emojiNumToImgArray.put(Integer.valueOf(0x1f447), Integer.valueOf(R.drawable.emoji_1f447));
      emojiNumToImgArray.put(Integer.valueOf(0x1f44c), Integer.valueOf(R.drawable.emoji_1f44c));
      emojiNumToImgArray.put(Integer.valueOf(0x2764), Integer.valueOf(R.drawable.emoji_2764));
      emojiNumToImgArray.put(Integer.valueOf(0x1f494), Integer.valueOf(R.drawable.emoji_1f494));
      emojiNumToImgArray.put(Integer.valueOf(0x1f64f), Integer.valueOf(R.drawable.emoji_1f64f));
      emojiNumToImgArray.put(Integer.valueOf(0x2600), Integer.valueOf(R.drawable.emoji_2600));
      emojiNumToImgArray.put(Integer.valueOf(0x1f319), Integer.valueOf(R.drawable.emoji_1f319));
      emojiNumToImgArray.put(Integer.valueOf(0x1f31f), Integer.valueOf(R.drawable.emoji_1f31f));
      emojiNumToImgArray.put(Integer.valueOf(0x26a1), Integer.valueOf(R.drawable.emoji_26a1));
      emojiNumToImgArray.put(Integer.valueOf(0x2601), Integer.valueOf(R.drawable.emoji_2601));
      emojiNumToImgArray.put(Integer.valueOf(0x2614), Integer.valueOf(R.drawable.emoji_2614));
      emojiNumToImgArray.put(Integer.valueOf(0x1f341), Integer.valueOf(R.drawable.emoji_1f341));
      emojiNumToImgArray.put(Integer.valueOf(0x1f33b), Integer.valueOf(R.drawable.emoji_1f33b));
      emojiNumToImgArray.put(Integer.valueOf(0x1f343), Integer.valueOf(R.drawable.emoji_1f343));
      emojiNumToImgArray.put(Integer.valueOf(0x1f457), Integer.valueOf(R.drawable.emoji_1f457));
      emojiNumToImgArray.put(Integer.valueOf(0x1f380), Integer.valueOf(R.drawable.emoji_1f380));
      emojiNumToImgArray.put(Integer.valueOf(0x1f444), Integer.valueOf(R.drawable.emoji_1f444));
      emojiNumToImgArray.put(Integer.valueOf(0x1f339), Integer.valueOf(R.drawable.emoji_1f339));
      emojiNumToImgArray.put(Integer.valueOf(0x2615), Integer.valueOf(R.drawable.emoji_2615));
      emojiNumToImgArray.put(Integer.valueOf(0x1f382), Integer.valueOf(R.drawable.emoji_1f382));
      emojiNumToImgArray.put(Integer.valueOf(0x1f559), Integer.valueOf(R.drawable.emoji_1f559));
      emojiNumToImgArray.put(Integer.valueOf(0x1f37a), Integer.valueOf(R.drawable.emoji_1f37a));
      emojiNumToImgArray.put(Integer.valueOf(0x1f50d), Integer.valueOf(R.drawable.emoji_1f50d));
      emojiNumToImgArray.put(Integer.valueOf(0x1f4f1), Integer.valueOf(R.drawable.emoji_1f4f1));
      emojiNumToImgArray.put(Integer.valueOf(0x1f3e0), Integer.valueOf(R.drawable.emoji_1f3e0));
      emojiNumToImgArray.put(Integer.valueOf(0x1f697), Integer.valueOf(R.drawable.emoji_1f697));
      emojiNumToImgArray.put(Integer.valueOf(0x1f381), Integer.valueOf(R.drawable.emoji_1f381));
      emojiNumToImgArray.put(Integer.valueOf(0x26bd), Integer.valueOf(R.drawable.emoji_26bd));
      emojiNumToImgArray.put(Integer.valueOf(0x1f4a3), Integer.valueOf(R.drawable.emoji_1f4a3));
      emojiNumToImgArray.put(Integer.valueOf(0x1f48e), Integer.valueOf(R.drawable.emoji_1f48e));

      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f603));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f60d));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f612));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f633));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f601));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f618));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f609));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f620));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f61e));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f625));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f62d));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f61d));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f621));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f623));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f614));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f604));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f637));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f61a));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f613));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f602));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f60a));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f622));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f61c));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f628));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f630));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f632));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f60f));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f631));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f62a));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f616));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f60c));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f47f));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f47b));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f385));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f467));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f466));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f469));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f468));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f436));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f431));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f44d));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f44e));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f44a));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_270a));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_270c));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f4aa));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f44f));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f448));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f446));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f449));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f447));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f44c));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_2764));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f494));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f64f));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_2600));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f319));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f31f));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_26a1));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_2601));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_2614));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f341));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f33b));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f343));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f457));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f380));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f444));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f339));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_2615));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f382));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f559));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f37a));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f50d));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f4f1));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f3e0));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f697));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f381));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_26bd));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f4a3));
      emojiImgArrray.add(Integer.valueOf(R.drawable.emoji_1f48e));
       
     
	 }
	 
	  
}