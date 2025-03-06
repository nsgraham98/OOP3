package utilities;

/**
* DictionaryADT.java
*
* @author Nick Graham
* @version 1.0
* 
* Class Definition: This interface represents the public contract for the
* implementation of Dictionary for the DictionaryADT Lab. 
*/

public interface DictionaryADT<K,V>
{
	public void createDictionary();
	
	public void insertKVPair(Object key, Object value);
	
	public void removeKVPair(Object key);
	
	public void updateValue(Object key, Object newValue);
	
	public void getValue(Object key);
}
