/**
* @ClassName: PcmSettleAccManUnit
* @Description: TODO()
* @author BlueMelancholy
* @date 2019年7月10日
*
*/
package cn.sunline.pcm.definition.product.unit;

import cn.sunline.pcm.definition.PcmSettleAccMan;
import cn.sunline.pcm.definition.product.IProductUnit;
import cn.sunline.pcm.definition.product.ProductUnitInfo;

/**
 * @author BlueMelancholy
 * 2019年7月10日
 */
public class PcmSettleAccManUnit implements IProductUnit {
	private final  String MODULE_NAME  ="pcmSettleAccMan";


    private final  String MODULE_NAME_ZH="结算账号管理";
    private final  String MODULE_URI_PREFIX="/"+MODULE_NAME;

	/* (non-Javadoc)
	 * @see cn.sunline.pcm.definition.product.IProductUnit#getUnitInfo()
	 */
	@Override
	public ProductUnitInfo getUnitInfo() {
		return new ProductUnitInfo(
                MODULE_NAME.toUpperCase(),
                MODULE_NAME,
                MODULE_NAME_ZH,
                ""+MODULE_URI_PREFIX+unitConfigURI,
                MODULE_URI_PREFIX+MODULE_URI_PREFIX+detailPageURI,
                MODULE_URI_PREFIX+unitBaseURI,
                PcmSettleAccMan.class.getName()
                );
	}

}
