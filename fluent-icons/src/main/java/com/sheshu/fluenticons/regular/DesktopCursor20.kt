package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.DesktopCursor20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.DesktopCursor20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 2f)
            curveTo(2.895f, 2f, 2f, 2.895f, 2f, 4f)
            verticalLineToRelative(9f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(2f)
            horizontalLineTo(5.5f)
            curveTo(5.224f, 17f, 5f, 17.224f, 5f, 17.5f)
            reflectiveCurveTo(5.224f, 18f, 5.5f, 18f)
            horizontalLineTo(11f)
            lineToRelative(0.001f, -1f)
            horizontalLineTo(8f)
            verticalLineToRelative(-2f)
            horizontalLineToRelative(3.002f)
            lineToRelative(0.001f, -1f)
            horizontalLineTo(4f)
            curveToRelative(-0.552f, 0f, -1f, -0.448f, -1f, -1f)
            verticalLineTo(4f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            horizontalLineToRelative(12f)
            curveToRelative(0.552f, 0f, 1f, 0.448f, 1f, 1f)
            verticalLineToRelative(8.843f)
            lineToRelative(0.872f, 0.864f)
            curveTo(17.954f, 13.487f, 18f, 13.249f, 18f, 13f)
            verticalLineTo(4f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
            moveToRelative(8.857f, 8.146f)
            curveToRelative(-0.143f, -0.142f, -0.358f, -0.184f, -0.544f, -0.107f)
            curveToRelative(-0.187f, 0.078f, -0.308f, 0.26f, -0.308f, 0.462f)
            lineTo(12f, 18.498f)
            curveToRelative(0f, 0.215f, 0.138f, 0.406f, 0.342f, 0.474f)
            curveToRelative(0.204f, 0.069f, 0.428f, -0.001f, 0.558f, -0.173f)
            lineToRelative(1.995f, -2.647f)
            lineToRelative(3.496f, 0.776f)
            curveToRelative(0.218f, 0.049f, 0.44f, -0.053f, 0.548f, -0.248f)
            curveToRelative(0.106f, -0.196f, 0.07f, -0.438f, -0.087f, -0.595f)
            lineToRelative(-5.995f, -5.94f)
            close()
        }
    }.build()
}
