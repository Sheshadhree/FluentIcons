package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CursorHoverOff20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CursorHoverOff20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(2.853f, 2.147f)
            curveToRelative(-0.195f, -0.196f, -0.511f, -0.196f, -0.707f, 0f)
            curveToRelative(-0.195f, 0.195f, -0.195f, 0.511f, 0f, 0.707f)
            lineToRelative(1.242f, 1.241f)
            curveTo(2.583f, 4.354f, 2f, 5.11f, 2f, 6f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.229f, 0.052f, -0.448f, 0.146f, -0.646f)
            lineTo(10f, 10.707f)
            verticalLineTo(17.5f)
            curveToRelative(0f, 0.218f, 0.142f, 0.411f, 0.35f, 0.477f)
            reflectiveCurveToRelative(0.434f, -0.012f, 0.56f, -0.19f)
            lineToRelative(1.571f, -2.245f)
            lineToRelative(2.781f, 0.427f)
            lineToRelative(1.884f, 1.885f)
            curveToRelative(0.196f, 0.195f, 0.512f, 0.195f, 0.708f, 0f)
            curveToRelative(0.195f, -0.196f, 0.195f, -0.512f, 0f, -0.708f)
            lineToRelative(-8f, -8f)
            lineToRelative(-7f, -7f)
            close()
            moveToRelative(11.213f, 12.627f)
            lineToRelative(-1.74f, -0.268f)
            curveToRelative(-0.188f, -0.03f, -0.376f, 0.051f, -0.486f, 0.207f)
            lineToRelative(-0.84f, 1.2f)
            verticalLineToRelative(-4.206f)
            lineToRelative(3.066f, 3.067f)
            close()
            moveToRelative(2.84f, 0.01f)
            curveTo(17.554f, 14.454f, 18f, 13.779f, 18f, 13f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(6.121f)
            lineToRelative(10.784f, 10.784f)
            close()
        }
    }.build()
}
