package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.CursorHover20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.CursorHover20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4f, 4f)
            curveTo(2.895f, 4f, 2f, 4.895f, 2f, 6f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 1.105f, 0.895f, 2f, 2f, 2f)
            horizontalLineToRelative(5f)
            verticalLineToRelative(-4.5f)
            curveToRelative(0f, -0.607f, 0.366f, -1.154f, 0.926f, -1.386f)
            curveToRelative(0.56f, -0.232f, 1.206f, -0.104f, 1.635f, 0.325f)
            lineToRelative(5f, 5f)
            curveToRelative(0.113f, 0.114f, 0.205f, 0.241f, 0.275f, 0.379f)
            curveTo(17.523f, 14.5f, 18f, 13.806f, 18f, 13f)
            verticalLineTo(6f)
            curveToRelative(0f, -1.105f, -0.895f, -2f, -2f, -2f)
            horizontalLineTo(4f)
            close()
            moveToRelative(6.854f, 6.146f)
            curveToRelative(-0.143f, -0.143f, -0.358f, -0.185f, -0.545f, -0.108f)
            curveTo(10.122f, 10.116f, 10f, 10.298f, 10f, 10.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.218f, 0.142f, 0.411f, 0.35f, 0.477f)
            reflectiveCurveToRelative(0.434f, -0.012f, 0.56f, -0.19f)
            lineToRelative(1.571f, -2.245f)
            lineToRelative(2.943f, 0.452f)
            curveToRelative(0.214f, 0.033f, 0.424f, -0.075f, 0.522f, -0.268f)
            curveToRelative(0.098f, -0.193f, 0.06f, -0.427f, -0.092f, -0.58f)
            lineToRelative(-5f, -5f)
            close()
            moveTo(11f, 15.915f)
            verticalLineToRelative(-4.207f)
            lineToRelative(3.066f, 3.067f)
            lineToRelative(-1.74f, -0.268f)
            curveToRelative(-0.188f, -0.03f, -0.376f, 0.051f, -0.486f, 0.207f)
            lineToRelative(-0.84f, 1.2f)
            close()
        }
    }.build()
}
