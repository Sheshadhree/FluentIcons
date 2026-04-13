package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Ribbon32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Ribbon32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(16f, 2f)
            curveTo(10.477f, 2f, 6f, 6.477f, 6f, 12f)
            curveToRelative(0f, 3.272f, 1.571f, 6.176f, 4f, 8f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 0.36f, 0.194f, 0.693f, 0.507f, 0.87f)
            curveToRelative(0.314f, 0.178f, 0.699f, 0.173f, 1.008f, -0.012f)
            lineTo(16f, 27.166f)
            lineToRelative(4.485f, 2.692f)
            curveToRelative(0.31f, 0.185f, 0.694f, 0.19f, 1.008f, 0.012f)
            curveTo(21.806f, 29.693f, 22f, 29.36f, 22f, 29f)
            verticalLineToRelative(-9f)
            curveToRelative(2.429f, -1.824f, 4f, -4.728f, 4f, -8f)
            curveToRelative(0f, -5.523f, -4.477f, -10f, -10f, -10f)
            close()
            moveTo(8f, 12f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(12f, 9.168f)
            verticalLineToRelative(6.066f)
            lineToRelative(-3.485f, -2.092f)
            curveToRelative(-0.317f, -0.19f, -0.713f, -0.19f, -1.03f, 0f)
            lineTo(12f, 27.234f)
            verticalLineToRelative(-6.066f)
            curveTo(13.225f, 21.703f, 14.578f, 22f, 16f, 22f)
            curveToRelative(1.422f, 0f, 2.775f, -0.297f, 4f, -0.832f)
            close()
        }
    }.build()
}
