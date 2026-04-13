package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Target20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Target20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 11.5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            curveToRelative(0f, -0.829f, -0.672f, -1.5f, -1.5f, -1.5f)
            reflectiveCurveTo(8.5f, 9.17f, 8.5f, 10f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            close()
            moveTo(5f, 10f)
            curveToRelative(0f, -2.761f, 2.239f, -5f, 5f, -5f)
            reflectiveCurveToRelative(5f, 2.239f, 5f, 5f)
            reflectiveCurveToRelative(-2.239f, 5f, -5f, 5f)
            reflectiveCurveToRelative(-5f, -2.239f, -5f, -5f)
            close()
            moveToRelative(5f, -4f)
            curveToRelative(-2.21f, 0f, -4f, 1.79f, -4f, 4f)
            curveToRelative(0f, 2.209f, 1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.791f, 4f, -4f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            close()
            moveToRelative(-8f, 4f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(8f, -7f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
        }
    }.build()
}
