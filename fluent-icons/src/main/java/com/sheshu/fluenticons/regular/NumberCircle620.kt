package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.NumberCircle620: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.NumberCircle620",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10f, 3f)
            curveToRelative(-3.866f, 0f, -7f, 3.134f, -7f, 7f)
            reflectiveCurveToRelative(3.134f, 7f, 7f, 7f)
            reflectiveCurveToRelative(7f, -3.134f, 7f, -7f)
            reflectiveCurveToRelative(-3.134f, -7f, -7f, -7f)
            close()
            moveToRelative(-8f, 7f)
            curveToRelative(0f, -4.418f, 3.582f, -8f, 8f, -8f)
            reflectiveCurveToRelative(8f, 3.582f, 8f, 8f)
            reflectiveCurveToRelative(-3.582f, 8f, -8f, 8f)
            reflectiveCurveToRelative(-8f, -3.582f, -8f, -8f)
            close()
            moveToRelative(8f, -0.5f)
            curveToRelative(-1.105f, 0f, -2f, 0.895f, -2f, 2f)
            reflectiveCurveToRelative(0.895f, 2f, 2f, 2f)
            curveToRelative(1.208f, 0f, 2f, -0.88f, 2f, -2f)
            reflectiveCurveToRelative(-0.792f, -2f, -2f, -2f)
            close()
            moveToRelative(0f, 5f)
            curveToRelative(-0.862f, 0f, -1.759f, -0.29f, -2.434f, -1.04f)
            curveTo(6.895f, 12.713f, 6.5f, 11.579f, 6.5f, 10f)
            curveToRelative(0f, -1.171f, 0.264f, -2.28f, 0.839f, -3.113f)
            curveTo(7.927f, 6.036f, 8.827f, 5.5f, 10f, 5.5f)
            curveToRelative(1.623f, 0f, 2.417f, 1.091f, 2.682f, 1.563f)
            curveToRelative(0.136f, 0.24f, 0.05f, 0.546f, -0.19f, 0.681f)
            curveToRelative(-0.24f, 0.136f, -0.546f, 0.05f, -0.681f, -0.19f)
            curveTo(11.621f, 7.215f, 11.094f, 6.5f, 10f, 6.5f)
            curveToRelative(-0.827f, 0f, -1.427f, 0.36f, -1.839f, 0.955f)
            curveTo(7.76f, 8.04f, 7.525f, 8.87f, 7.501f, 9.838f)
            curveTo(8.04f, 9.032f, 8.959f, 8.5f, 10f, 8.5f)
            curveToRelative(1.792f, 0f, 3f, 1.36f, 3f, 3f)
            reflectiveCurveToRelative(-1.208f, 3f, -3f, 3f)
            close()
        }
    }.build()
}
