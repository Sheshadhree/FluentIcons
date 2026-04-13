package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Storage20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Storage20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(13f, 9f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveToRelative(2f, 1f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
            moveTo(2f, 8.5f)
            curveTo(2f, 7.12f, 3.12f, 6f, 4.5f, 6f)
            horizontalLineToRelative(11f)
            curveTo(16.88f, 6f, 18f, 7.12f, 18f, 8.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 1.38f, -1.12f, 2.5f, -2.5f, 2.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.12f, 14f, 2f, 12.88f, 2f, 11.5f)
            verticalLineToRelative(-3f)
            close()
            moveTo(4.5f, 7f)
            curveTo(3.672f, 7f, 3f, 7.672f, 3f, 8.5f)
            verticalLineToRelative(3f)
            curveTo(3f, 12.328f, 3.672f, 13f, 4.5f, 13f)
            horizontalLineToRelative(11f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveTo(17f, 7.672f, 16.328f, 7f, 15.5f, 7f)
            horizontalLineToRelative(-11f)
            close()
        }
    }.build()
}
