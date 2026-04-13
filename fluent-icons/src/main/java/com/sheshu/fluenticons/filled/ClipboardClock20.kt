package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ClipboardClock20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ClipboardClock20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(10.5f, 9.5f)
            curveTo(10.5f, 9.224f, 10.276f, 9f, 10f, 9f)
            reflectiveCurveTo(9.5f, 9.224f, 9.5f, 9.5f)
            verticalLineTo(11f)
            curveToRelative(0f, 0.276f, 0.224f, 0.5f, 0.5f, 0.5f)
            horizontalLineToRelative(1.5f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            reflectiveCurveToRelative(-0.224f, -0.5f, -0.5f, -0.5f)
            horizontalLineToRelative(-1f)
            verticalLineToRelative(-1f)
            close()
            moveTo(7.085f, 3f)
            curveTo(7.291f, 2.417f, 7.847f, 2f, 8.5f, 2f)
            horizontalLineToRelative(3f)
            curveToRelative(0.653f, 0f, 1.209f, 0.417f, 1.415f, 1f)
            horizontalLineTo(14.5f)
            curveTo(15.328f, 3f, 16f, 3.672f, 16f, 4.5f)
            verticalLineToRelative(12f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-9f)
            curveTo(4.672f, 18f, 4f, 17.328f, 4f, 16.5f)
            verticalLineToRelative(-12f)
            curveTo(4f, 3.672f, 4.672f, 3f, 5.5f, 3f)
            horizontalLineToRelative(1.585f)
            close()
            moveTo(8.5f, 3f)
            curveTo(8.224f, 3f, 8f, 3.224f, 8f, 3.5f)
            reflectiveCurveTo(8.224f, 4f, 8.5f, 4f)
            horizontalLineToRelative(3f)
            curveTo(11.776f, 4f, 12f, 3.776f, 12f, 3.5f)
            reflectiveCurveTo(11.776f, 3f, 11.5f, 3f)
            horizontalLineToRelative(-3f)
            close()
            moveToRelative(5.5f, 8f)
            curveToRelative(0f, -2.21f, -1.79f, -4f, -4f, -4f)
            reflectiveCurveToRelative(-4f, 1.79f, -4f, 4f)
            reflectiveCurveToRelative(1.79f, 4f, 4f, 4f)
            reflectiveCurveToRelative(4f, -1.79f, 4f, -4f)
            close()
        }
    }.build()
}
