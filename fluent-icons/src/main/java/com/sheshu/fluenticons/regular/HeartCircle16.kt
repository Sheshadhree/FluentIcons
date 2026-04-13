package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.HeartCircle16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.HeartCircle16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 7f)
            lineTo(7.58f, 6.508f)
            curveTo(7.006f, 5.84f, 5.977f, 5.824f, 5.384f, 6.475f)
            curveTo(4.86f, 7.05f, 4.877f, 7.935f, 5.422f, 8.489f)
            lineToRelative(2.4f, 2.44f)
            curveToRelative(0.098f, 0.1f, 0.259f, 0.1f, 0.357f, 0f)
            lineToRelative(2.4f, -2.44f)
            curveToRelative(0.545f, -0.555f, 0.562f, -1.44f, 0.038f, -2.014f)
            curveToRelative(-0.593f, -0.65f, -1.622f, -0.635f, -2.195f, 0.033f)
            lineTo(8f, 7f)
            close()
            moveTo(2f, 8f)
            curveToRelative(0f, -3.314f, 2.686f, -6f, 6f, -6f)
            reflectiveCurveToRelative(6f, 2.686f, 6f, 6f)
            reflectiveCurveToRelative(-2.686f, 6f, -6f, 6f)
            reflectiveCurveToRelative(-6f, -2.686f, -6f, -6f)
            close()
            moveToRelative(6f, -5f)
            curveTo(5.239f, 3f, 3f, 5.239f, 3f, 8f)
            reflectiveCurveToRelative(2.239f, 5f, 5f, 5f)
            reflectiveCurveToRelative(5f, -2.239f, 5f, -5f)
            reflectiveCurveToRelative(-2.239f, -5f, -5f, -5f)
            close()
        }
    }.build()
}
