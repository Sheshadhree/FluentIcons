package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CircleLine16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CircleLine16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14f, 8f)
            curveToRelative(0f, 3.314f, -2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            reflectiveCurveToRelative(2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            close()
            moveToRelative(-1.025f, 0.5f)
            horizontalLineToRelative(-9.95f)
            curveTo(3.275f, 11.027f, 5.407f, 13f, 8f, 13f)
            curveToRelative(2.593f, 0f, 4.725f, -1.973f, 4.975f, -4.5f)
            close()
            moveToRelative(0f, -1f)
            curveTo(12.725f, 4.973f, 10.593f, 3f, 8f, 3f)
            curveTo(5.407f, 3f, 3.276f, 4.973f, 3.025f, 7.5f)
            horizontalLineToRelative(9.95f)
            close()
        }
    }.build()
}
