package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.CalendarMail16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.CalendarMail16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(1f, 3.5f)
            curveTo(1f, 2.12f, 2.12f, 1f, 3.5f, 1f)
            horizontalLineToRelative(5f)
            curveTo(9.88f, 1f, 11f, 2.12f, 11f, 3.5f)
            verticalLineTo(6f)
            horizontalLineToRelative(-1f)
            verticalLineTo(4f)
            horizontalLineTo(2f)
            verticalLineToRelative(4.5f)
            curveTo(2f, 9.328f, 2.672f, 10f, 3.5f, 10f)
            horizontalLineTo(4f)
            verticalLineToRelative(1f)
            horizontalLineTo(3.5f)
            curveTo(2.12f, 11f, 1f, 9.88f, 1f, 8.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(3.5f, 2f)
            curveTo(2.847f, 2f, 2.291f, 2.417f, 2.085f, 3f)
            horizontalLineToRelative(7.83f)
            curveTo(9.709f, 2.417f, 9.153f, 2f, 8.5f, 2f)
            horizontalLineToRelative(-5f)
            close()
            moveTo(5f, 8.5f)
            curveTo(5f, 7.672f, 5.672f, 7f, 6.5f, 7f)
            horizontalLineToRelative(7f)
            curveTo(14.328f, 7f, 15f, 7.672f, 15f, 8.5f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-7f)
            curveTo(5.672f, 15f, 5f, 14.328f, 5f, 13.5f)
            verticalLineToRelative(-5f)
            close()
            moveTo(6.5f, 8f)
            curveTo(6.224f, 8f, 6f, 8.224f, 6f, 8.5f)
            verticalLineToRelative(0.441f)
            lineToRelative(4f, 2f)
            lineToRelative(4f, -2f)
            verticalLineTo(8.5f)
            curveTo(14f, 8.224f, 13.776f, 8f, 13.5f, 8f)
            horizontalLineToRelative(-7f)
            close()
            moveTo(6f, 13.5f)
            curveTo(6f, 13.776f, 6.224f, 14f, 6.5f, 14f)
            horizontalLineToRelative(7f)
            curveToRelative(0.276f, 0f, 0.5f, -0.224f, 0.5f, -0.5f)
            verticalLineToRelative(-3.441f)
            lineToRelative(-3.776f, 1.888f)
            curveToRelative(-0.141f, 0.07f, -0.307f, 0.07f, -0.448f, 0f)
            lineTo(6f, 10.06f)
            verticalLineToRelative(3.44f)
            close()
        }
    }.build()
}
