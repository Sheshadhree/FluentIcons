package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Temperature48: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Temperature48",
        defaultWidth = 48.dp,
        defaultHeight = 48.dp,
        viewportWidth = 48f,
        viewportHeight = 48f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(24f, 9f)
            curveToRelative(-2.071f, 0f, -3.75f, 1.679f, -3.75f, 3.75f)
            verticalLineToRelative(15.207f)
            lineToRelative(-0.484f, 0.445f)
            curveToRelative(-1.241f, 1.144f, -2.016f, 2.78f, -2.016f, 4.598f)
            curveToRelative(0f, 3.452f, 2.798f, 6.25f, 6.25f, 6.25f)
            reflectiveCurveToRelative(6.25f, -2.798f, 6.25f, -6.25f)
            curveToRelative(0f, -1.818f, -0.775f, -3.454f, -2.016f, -4.598f)
            lineToRelative(-0.484f, -0.445f)
            verticalLineTo(12.75f)
            curveTo(27.75f, 10.679f, 26.071f, 9f, 24f, 9f)
            close()
            moveToRelative(-6.75f, 3.75f)
            curveTo(17.25f, 9.022f, 20.272f, 6f, 24f, 6f)
            reflectiveCurveToRelative(6.75f, 3.022f, 6.75f, 6.75f)
            verticalLineToRelative(13.925f)
            curveToRelative(1.549f, 1.653f, 2.5f, 3.879f, 2.5f, 6.325f)
            curveToRelative(0f, 5.109f, -4.141f, 9.25f, -9.25f, 9.25f)
            reflectiveCurveToRelative(-9.25f, -4.141f, -9.25f, -9.25f)
            curveToRelative(0f, -2.446f, 0.951f, -4.672f, 2.5f, -6.325f)
            verticalLineTo(12.75f)
            close()
            moveTo(28f, 33f)
            curveToRelative(0f, 2.21f, -1.79f, 4f, -4f, 4f)
            reflectiveCurveToRelative(-4f, -1.79f, -4f, -4f)
            curveToRelative(0f, -1.679f, 1.034f, -3.116f, 2.5f, -3.71f)
            verticalLineTo(18.5f)
            curveToRelative(0f, -0.828f, 0.672f, -1.5f, 1.5f, -1.5f)
            reflectiveCurveToRelative(1.5f, 0.672f, 1.5f, 1.5f)
            verticalLineToRelative(10.79f)
            curveTo(26.966f, 29.885f, 28f, 31.322f, 28f, 33f)
            close()
        }
    }.build()
}
