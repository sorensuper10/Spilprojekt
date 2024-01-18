package components;

import util.AssetPool;

public class BreakableBrick extends Block {

    @Override
    void playerHit(PlayerController playerController) {
        if (!playerController.isSmall()) {
            AssetPool.getSound("assets/sounds/breakblock1.ogg").play();
            gameObject.destroy();
        }
    }
}
