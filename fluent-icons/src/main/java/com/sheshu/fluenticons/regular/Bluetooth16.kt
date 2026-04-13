package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Bluetooth16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Bluetooth16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(7.285f, 1.048f)
            curveToRelative(0.174f, -0.082f, 0.38f, -0.058f, 0.53f, 0.064f)
            lineToRelative(4f, 3.25f)
            curveTo(11.932f, 4.457f, 12f, 4.599f, 12f, 4.75f)
            curveToRelative(0f, 0.15f, -0.068f, 0.293f, -0.185f, 0.388f)
            lineTo(8.293f, 8f)
            lineToRelative(3.522f, 2.862f)
            curveTo(11.932f, 10.957f, 12f, 11.099f, 12f, 11.25f)
            curveToRelative(0f, 0.15f, -0.068f, 0.293f, -0.185f, 0.388f)
            lineToRelative(-4f, 3.25f)
            curveToRelative(-0.15f, 0.122f, -0.356f, 0.146f, -0.53f, 0.063f)
            curveTo(7.111f, 14.87f, 7f, 14.694f, 7f, 14.5f)
            verticalLineTo(9.05f)
            lineToRelative(-3.185f, 2.588f)
            curveToRelative(-0.214f, 0.174f, -0.529f, 0.142f, -0.703f, -0.073f)
            curveToRelative(-0.174f, -0.214f, -0.142f, -0.529f, 0.073f, -0.703f)
            lineTo(6.707f, 8f)
            lineTo(3.185f, 5.138f)
            curveTo(2.97f, 4.964f, 2.938f, 4.65f, 3.112f, 4.435f)
            curveTo(3.286f, 4.22f, 3.601f, 4.188f, 3.815f, 4.362f)
            lineTo(7f, 6.949f)
            verticalLineTo(1.5f)
            curveToRelative(0f, -0.193f, 0.111f, -0.369f, 0.285f, -0.452f)
            close()
            moveTo(8f, 9.05f)
            verticalLineToRelative(4.4f)
            lineToRelative(2.707f, -2.2f)
            lineTo(8f, 9.05f)
            close()
            moveToRelative(0f, -2.1f)
            lineToRelative(2.707f, -2.2f)
            lineTo(8f, 2.55f)
            verticalLineToRelative(4.4f)
            close()
        }
    }.build()
}
