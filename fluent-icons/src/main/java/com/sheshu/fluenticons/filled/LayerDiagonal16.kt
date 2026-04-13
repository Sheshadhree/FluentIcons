package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayerDiagonal16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayerDiagonal16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3f, 10.915f)
            verticalLineToRelative(-4.29f)
            curveToRelative(0f, -0.975f, 0.567f, -1.861f, 1.452f, -2.27f)
            lineToRelative(4.5f, -2.077f)
            lineToRelative(0.03f, -0.013f)
            curveTo(8.835f, 1.322f, 7.824f, 0.73f, 6.909f, 1.123f)
            lineTo(2.515f, 3.006f)
            curveTo(1.596f, 3.4f, 1f, 4.304f, 1f, 5.304f)
            verticalLineTo(9.5f)
            curveToRelative(0f, 1.044f, 1.035f, 1.758f, 2f, 1.414f)
            close()
            moveToRelative(3f, 1.996f)
            verticalLineTo(8.645f)
            curveToRelative(0f, -1f, 0.596f, -1.904f, 1.515f, -2.298f)
            lineToRelative(4.483f, -1.922f)
            curveToRelative(-0.05f, -1.034f, -1.123f, -1.716f, -2.089f, -1.302f)
            lineToRelative(-5f, 2.143f)
            curveTo(4.358f, 5.502f, 4f, 6.044f, 4f, 6.644f)
            verticalLineToRelative(4.853f)
            curveToRelative(0f, 1.044f, 1.035f, 1.758f, 2f, 1.414f)
            close()
            moveToRelative(6.91f, -7.788f)
            curveTo(13.898f, 4.699f, 15f, 5.425f, 15f, 6.502f)
            verticalLineToRelative(4.826f)
            curveToRelative(0f, 0.598f, -0.355f, 1.138f, -0.903f, 1.376f)
            lineToRelative(-5f, 2.169f)
            curveTo(8.107f, 15.303f, 7f, 14.576f, 7f, 13.496f)
            verticalLineTo(8.645f)
            curveToRelative(0f, -0.6f, 0.358f, -1.143f, 0.91f, -1.38f)
            lineToRelative(5f, -2.142f)
            close()
        }
    }.build()
}
