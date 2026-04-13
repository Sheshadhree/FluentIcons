package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.PersonHeart20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.PersonHeart20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9f, 2f)
            curveTo(6.79f, 2f, 5f, 3.79f, 5f, 6f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            reflectiveCurveToRelative(-1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(-4.991f, 9f)
            curveTo(2.903f, 11f, 2f, 11.887f, 2f, 13f)
            curveToRelative(0f, 1.691f, 0.833f, 2.966f, 2.135f, 3.797f)
            curveTo(5.417f, 17.614f, 7.145f, 18f, 9f, 18f)
            curveToRelative(0.955f, 0f, 1.876f, -0.102f, 2.72f, -0.313f)
            lineToRelative(-1.83f, -2.002f)
            curveToRelative(-1.126f, -1.231f, -1.19f, -3.097f, -0.153f, -4.403f)
            curveToRelative(0.08f, -0.1f, 0.163f, -0.194f, 0.251f, -0.282f)
            horizontalLineToRelative(-5.98f)
            close()
            moveToRelative(10.49f, 1.003f)
            lineToRelative(-0.628f, -0.493f)
            curveToRelative(-1.035f, -0.812f, -2.532f, -0.636f, -3.35f, 0.394f)
            curveToRelative(-0.733f, 0.921f, -0.688f, 2.238f, 0.106f, 3.106f)
            lineToRelative(3.503f, 3.83f)
            curveToRelative(0.199f, 0.217f, 0.54f, 0.217f, 0.738f, 0f)
            lineToRelative(3.504f, -3.83f)
            curveToRelative(0.793f, -0.869f, 0.839f, -2.185f, 0.107f, -3.105f)
            curveToRelative(-0.818f, -1.03f, -2.315f, -1.207f, -3.35f, -0.395f)
            lineToRelative(-0.63f, 0.493f)
            close()
        }
    }.build()
}
