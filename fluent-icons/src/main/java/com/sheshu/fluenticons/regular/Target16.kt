package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Target16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Target16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(8f, 9f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveTo(8.552f, 7f, 8f, 7f)
            reflectiveCurveTo(7f, 7.448f, 7f, 8f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveTo(4.5f, 8f)
            curveToRelative(0f, -1.933f, 1.567f, -3.5f, 3.5f, -3.5f)
            reflectiveCurveToRelative(3.5f, 1.567f, 3.5f, 3.5f)
            reflectiveCurveToRelative(-1.567f, 3.5f, -3.5f, 3.5f)
            reflectiveCurveTo(4.5f, 9.933f, 4.5f, 8f)
            close()
            moveTo(8f, 5.5f)
            curveTo(6.62f, 5.5f, 5.5f, 6.62f, 5.5f, 8f)
            reflectiveCurveToRelative(1.12f, 2.5f, 2.5f, 2.5f)
            reflectiveCurveToRelative(2.5f, -1.12f, 2.5f, -2.5f)
            reflectiveCurveTo(9.38f, 5.5f, 8f, 5.5f)
            close()
            moveTo(2f, 8f)
            curveToRelative(0f, -3.313f, 2.687f, -6f, 6f, -6f)
            curveToRelative(3.315f, 0f, 6.001f, 2.687f, 6.001f, 6f)
            curveToRelative(0f, 3.315f, -2.686f, 6.001f, -6f, 6.001f)
            reflectiveCurveTo(2f, 11.315f, 2f, 8.001f)
            close()
            moveToRelative(6f, -5f)
            curveTo(5.24f, 3f, 3f, 5.239f, 3f, 8f)
            curveToRelative(0f, 2.762f, 2.239f, 5.001f, 5f, 5.001f)
            curveToRelative(2.762f, 0f, 5.001f, -2.239f, 5.001f, -5f)
            curveToRelative(0f, -2.762f, -2.239f, -5.001f, -5f, -5.001f)
            close()
        }
    }.build()
}
