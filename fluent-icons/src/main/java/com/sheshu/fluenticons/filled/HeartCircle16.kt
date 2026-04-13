package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.HeartCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.HeartCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            close()
            moveToRelative(6f, -1f)
            lineTo(7.578f, 6.508f)
            curveTo(7.005f, 5.84f, 5.976f, 5.824f, 5.383f, 6.475f)
            curveTo(4.86f, 7.05f, 4.876f, 7.935f, 5.422f, 8.489f)
            lineToRelative(2.4f, 2.44f)
            curveToRelative(0.097f, 0.1f, 0.258f, 0.1f, 0.356f, 0f)
            lineToRelative(2.4f, -2.44f)
            curveToRelative(0.545f, -0.555f, 0.562f, -1.44f, 0.038f, -2.014f)
            curveToRelative(-0.593f, -0.65f, -1.622f, -0.635f, -2.195f, 0.033f)
            lineTo(8f, 7f)
            close()
        }
    }.build()
}
