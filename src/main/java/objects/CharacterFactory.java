package objects;

import utils.RegistoryList;
import utils.RegistoryObject;

public class CharacterFactory {
    public static final RegistoryList<AbstractCharacterMaking> CHARA_LIST = new RegistoryList<>();

    public static final RegistoryObject<AbstractCharacterMaking> TEST_OBJECT = CHARA_LIST.create("test", TestObject::new);



}
