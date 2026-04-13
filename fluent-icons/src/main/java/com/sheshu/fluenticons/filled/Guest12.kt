package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Guest12: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Guest12",
        defaultWidth = 12.dp,
        defaultHeight = 12.dp,
        viewportWidth = 12f,
        viewportHeight = 12f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 1f)
            curveTo(2.672f, 1f, 2f, 1.672f, 2f, 2.5f)
            verticalLineToRelative(7f)
            curveTo(2f, 10.328f, 2.672f, 11f, 3.5f, 11f)
            horizontalLineToRelative(5f)
            curveToRelative(0.828f, 0f, 1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-7f)
            curveTo(10f, 1.672f, 9.328f, 1f, 8.5f, 1f)
            horizontalLineToRelative(-5f)
            close()
            moveToRelative(2f, 1f)
            horizontalLineToRelative(1f)
            curveTo(6.776f, 2f, 7f, 2.224f, 7f, 2.5f)
            reflectiveCurveTo(6.776f, 3f, 6.5f, 3f)
            horizontalLineToRelative(-1f)
            curveTo(5.224f, 3f, 5f, 2.776f, 5f, 2.5f)
            reflectiveCurveTo(5.224f, 2f, 5.5f, 2f)
            close()
            moveTo(7f, 5f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveTo(5f, 5.552f, 5f, 5f)
            reflectiveCurveToRelative(0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            close()
            moveTo(4f, 7.5f)
            curveTo(4f, 7.224f, 4.224f, 7f, 4.5f, 7f)
            horizontalLineToRelative(3f)
            curveTo(7.776f, 7f, 8f, 7.224f, 8f, 7.5f)
            curveTo(8f, 8.5f, 7f, 9f, 6f, 9f)
            reflectiveCurveTo(4f, 8.5f, 4f, 7.5f)
            close()
        }
    }.build()
}
