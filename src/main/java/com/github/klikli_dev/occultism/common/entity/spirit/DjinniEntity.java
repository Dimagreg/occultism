/*
 * MIT License
 *
 * Copyright 2020 klikli-dev
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this software and
 * associated documentation files (the "Software"), to deal in the Software without restriction, including
 * without limitation the rights to use, copy, modify, merge, publish, distribute, sublicense, and/or sell copies
 * of the Software, and to permit persons to whom the Software is furnished to do so, subject to the following
 * conditions:
 *
 * The above copyright notice and this permission notice shall be included in all copies or substantial
 * portions of the Software.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A PARTICULAR
 * PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT HOLDERS BE
 * LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT
 * OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR
 * OTHER DEALINGS IN THE SOFTWARE.
 */

package com.github.klikli_dev.occultism.common.entity.spirit;

import net.minecraft.entity.EntityType;
import net.minecraft.entity.ai.attributes.AttributeModifierMap;
import net.minecraft.entity.ai.attributes.Attributes;
import net.minecraft.world.World;

public class DjinniEntity extends SpiritEntity {

    //region Initialization
    public DjinniEntity(EntityType<? extends SpiritEntity> type, World world) {
        super(type, world);
    }
    //endregion Initialization

    //region Static Methods
    public static AttributeModifierMap.MutableAttribute registerAttributes() {
        return SpiritEntity.registerAttributes()
                       .createMutableAttribute(Attributes.ATTACK_DAMAGE, 3.0)
                       .createMutableAttribute(Attributes.MAX_HEALTH, 20.0)
                       .createMutableAttribute(Attributes.MOVEMENT_SPEED, 0.30000001192092896)
                       .createMutableAttribute(Attributes.ARMOR, 4.0)
                       .createMutableAttribute(Attributes.ARMOR_TOUGHNESS, 5.0)
                       .createMutableAttribute(Attributes.FOLLOW_RANGE, 50.0);
    }
    //endregion Static Methods
}
