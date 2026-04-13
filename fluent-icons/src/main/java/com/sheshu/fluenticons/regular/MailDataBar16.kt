package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.MailDataBar16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.MailDataBar16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2f, 11f)
            verticalLineTo(5f)
            curveToRelative(0f, -1.105f, 0.895f, -2f, 2f, -2f)
            horizontalLineToRelative(8f)
            curveToRelative(1.105f, 0f, 2f, 0.895f, 2f, 2f)
            verticalLineToRelative(3f)
            curveToRelative(0f, -0.74f, -0.402f, -1.387f, -1f, -1.732f)
            verticalLineTo(5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            horizontalLineTo(4f)
            curveTo(3.448f, 4f, 3f, 4.448f, 3f, 5f)
            verticalLineToRelative(0.74f)
            lineToRelative(5f, 2.692f)
            lineToRelative(2.132f, -1.148f)
            curveTo(10.047f, 7.507f, 10f, 7.748f, 10f, 8f)
            verticalLineToRelative(0.491f)
            lineToRelative(-1.763f, 0.95f)
            curveTo(8.09f, 9.52f, 7.911f, 9.52f, 7.763f, 9.44f)
            lineTo(3f, 6.874f)
            verticalLineTo(11f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            horizontalLineToRelative(3f)
            verticalLineToRelative(1f)
            horizontalLineTo(4f)
            curveToRelative(-1.105f, 0f, -2f, -0.895f, -2f, -2f)
            close()
            moveToRelative(10f, -4f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineTo(8f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(3f, 2f)
            curveToRelative(-0.552f, 0f, -1f, 0.448f, -1f, 1f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.552f, 0.448f, 1f, 1f, 1f)
            reflectiveCurveToRelative(1f, -0.448f, 1f, -1f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.552f, -0.448f, -1f, -1f, -1f)
            close()
            moveToRelative(-7f, 3f)
            curveToRelative(0f, -0.552f, 0.448f, -1f, 1f, -1f)
            reflectiveCurveToRelative(1f, 0.448f, 1f, 1f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.552f, -0.448f, 1f, -1f, 1f)
            reflectiveCurveToRelative(-1f, -0.448f, -1f, -1f)
            verticalLineToRelative(-3f)
            close()
        }
    }.build()
}
