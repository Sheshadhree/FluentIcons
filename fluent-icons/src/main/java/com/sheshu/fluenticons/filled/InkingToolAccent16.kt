package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.InkingToolAccent16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.InkingToolAccent16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(14.5f, 2f)
            verticalLineToRelative(2f)
            curveToRelative(0f, 0.276f, -0.224f, 0.5f, -0.5f, 0.5f)
            horizontalLineTo(2f)
            curveTo(1.724f, 4.5f, 1.5f, 4.276f, 1.5f, 4f)
            verticalLineTo(2f)
            horizontalLineToRelative(13f)
            close()
            moveToRelative(-4f, 2.5f)
            lineToRelative(0.52f, 0.476f)
            lineToRelative(-2.398f, 4.75f)
            curveTo(8.537f, 9.893f, 8.364f, 10f, 8.176f, 10f)
            curveTo(7.803f, 10f, 7.56f, 9.607f, 7.729f, 9.275f)
            lineToRelative(2.17f, -4.3f)
            lineTo(10.5f, 4.5f)
            close()
            moveTo(9f, 13f)
            curveToRelative(0f, 0.828f, -0.448f, 1.5f, -1f, 1.5f)
            reflectiveCurveTo(7f, 13.828f, 7f, 13f)
            reflectiveCurveToRelative(0.448f, -1.5f, 1f, -1.5f)
            reflectiveCurveToRelative(1f, 0.672f, 1f, 1.5f)
            close()
        }
    }.build()
}
