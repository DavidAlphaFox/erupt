package xyz.erupt.annotation.fun;

import java.util.List;

/**
 * @author liyuepeng
 * @date 2019-07-25.
 */
public interface ChoiceFetchHandler {

    List<VLModel> fetch(String[] params);

}
