# STRING

## Info:

| Definitions: |     |                                                                    |
| ------------ | --- | -----------------------------------------------------------------: |
| Def          |     | Basically an object that represents sequence/array of char values. |
| Is Immutable |     |   Strings aren't changed, new String is made and old is discarried |

<br/>

## Constructors:

- `String()`
- `String(String)`
- `String(char[])`
- `String(char[], int, int)`
- `String(char[], int, int, String)`
- `String(char[], int, int, Charset)`
- `String(char[], int, int, CharsetDecoder)`
- `String(char[], int, int, CharsetEncoder)`
- `String(char[], int, int, CharsetDecoder, CharsetEncoder)`
- `String(char[], int, int, CharsetDecoder, CharsetEncoder, String)`

## Methods:

- `charAt(int index)`
- `length()`
- `char[] toCharArray()`
- `String concat(String str)`
- `String concat(String str, int offset, int length)`
- `String concat(String[] strs)`
- `String concat(String[] strs, int offset, int length)`
- `String replace(char oldChar, char newChar)`
- `String replace(CharSequence oldSequence, CharSequence newSequence)`
- `String replaceAll(String regex, String replacement)`
- `String replaceFirst(String regex, String replacement)`
- `String[] split(String regex)`
- `String[] split(String regex, int limit)`
- `String[] split(String regex, int limit, int flags)`
- `contains(CharSequence s)`
- `substring(int beginIndex)`
- `substring(int beginIndex, int endIndex)`
- `indexOf(int ch)`
- `indexOf(int ch, int fromIndex)`
- `indexOf(String str)`
- `indexOf(String str, int fromIndex)`
- `lastIndexOf(int ch)`
- `lastIndexOf(int ch, int fromIndex)`
- `lastIndexOf(String str)`
- `lastIndexOf(String str, int fromIndex)`
- `isEmpty()`
- `equals(Object obj)`
- `equalsIgnoreCase(String anotherString)`
- `compareTo(String anotherString)`
- `compareToIgnoreCase(String anotherString)`
- `hashCode()`
- `toString()`
- `toLowerCase()`
- `toUpperCase()`
- `trim()`
- `join(CharSequence delimiter, CharSequence... elements)`

<br/>
