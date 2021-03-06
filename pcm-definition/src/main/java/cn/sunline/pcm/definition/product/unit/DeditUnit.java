package cn.sunline.pcm.definition.product.unit;

import cn.sunline.pcm.definition.Dedit;
import cn.sunline.pcm.definition.product.IProductUnit;
import cn.sunline.pcm.definition.product.ProductUnitInfo;

/**
 * 平台违约金
 * @author zzq
 *
 */
public class DeditUnit implements IProductUnit {
	private final  String MODULE_NAME  ="dedit";


    private final  String MODULE_NAME_ZH="平台违约金";


    @Override
    public ProductUnitInfo getUnitInfo() {
            return new ProductUnitInfo(
                            MODULE_NAME.toUpperCase(),
                            MODULE_NAME,
                            MODULE_NAME_ZH,
                            ""+MODULE_URI_PREFIX+unitConfigURI,
                            MODULE_URI_PREFIX+MODULE_URI_PREFIX+detailPageURI,
                            MODULE_URI_PREFIX+unitBaseURI,
                            Dedit.class.getName()
                            );
    }

    private final  String MODULE_URI_PREFIX="/"+MODULE_NAME;
}
