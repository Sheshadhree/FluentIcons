package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Prohibited20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Prohibited20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(18f, 10f)
            curveToRelative(0f, 4.418f, -3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            reflectiveCurveToRelative(3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            close()
            moveToRelative(-1f, 0f)
            curveToRelative(0f, -1.753f, -0.644f, -3.356f, -1.71f, -4.584f)
            lineToRelative(-9.874f, 9.875f)
            curveTo(6.644f, 16.356f, 8.247f, 17f, 10f, 17f)
            curveToRelative(3.866f, 0f, 7f, -3.134f, 7f, -7f)
            close()
            moveTo(4.71f, 14.584f)
            lineToRelative(9.874f, -9.875f)
            curveTo(13.356f, 3.644f, 11.753f, 3f, 10f, 3f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            curveToRelative(0f, 1.753f, 0.644f, 3.356f, 1.71f, 4.584f)
            close()
        }
    }.build()
}
