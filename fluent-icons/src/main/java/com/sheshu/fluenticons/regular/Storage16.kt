package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Storage16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Storage16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 6.5f)
            curveTo(1f, 5.12f, 2.12f, 4f, 3.5f, 4f)
            horizontalLineToRelative(9f)
            curveTo(13.88f, 4f, 15f, 5.12f, 15f, 6.5f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-9f)
            curveTo(2.12f, 11f, 1f, 9.88f, 1f, 8.5f)
            verticalLineToRelative(-2f)
            close()
            moveTo(3.5f, 5f)
            curveTo(2.672f, 5f, 2f, 5.672f, 2f, 6.5f)
            verticalLineToRelative(2f)
            curveTo(2f, 9.328f, 2.672f, 10f, 3.5f, 10f)
            horizontalLineToRelative(9f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-2f)
            curveTo(14f, 5.672f, 13.328f, 5f, 12.5f, 5f)
            horizontalLineToRelative(-9f)
            close()
            moveTo(10f, 7f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveTo(8f, 7.552f, 8f, 7f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(2f, 1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
