package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.TriangleRight48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.TriangleRight48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(39.567f, 25.758f)
            curveToRelative(1.238f, -0.652f, 1.248f, -2.422f, 0.017f, -3.088f)
            lineTo(10.082f, 6.717f)
            curveTo(8.916f, 6.087f, 7.5f, 6.93f, 7.5f, 8.256f)
            verticalLineToRelative(31.487f)
            curveToRelative(0f, 1.318f, 1.4f, 2.163f, 2.565f, 1.549f)
            lineToRelative(29.502f, -15.534f)
            close()
            moveToRelative(1.206f, -5.287f)
            curveToRelative(2.99f, 1.617f, 2.966f, 5.916f, -0.041f, 7.5f)
            lineTo(11.23f, 43.503f)
            curveTo(8.4f, 44.994f, 5f, 42.942f, 5f, 39.744f)
            verticalLineTo(8.255f)
            curveToRelative(0f, -3.22f, 3.44f, -5.27f, 6.272f, -3.738f)
            lineTo(40.773f, 20.47f)
            close()
        }
    }.build()
}
