package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Folder20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Folder20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(4.5f, 3f)
            curveTo(3.12f, 3f, 2f, 4.12f, 2f, 5.5f)
            verticalLineToRelative(9f)
            curveTo(2f, 15.88f, 3.12f, 17f, 4.5f, 17f)
            horizontalLineToRelative(11f)
            curveToRelative(1.38f, 0f, 2.5f, -1.12f, 2.5f, -2.5f)
            verticalLineToRelative(-7f)
            curveTo(18f, 6.12f, 16.88f, 5f, 15.5f, 5f)
            horizontalLineTo(9.707f)
            lineTo(8.22f, 3.513f)
            curveTo(7.89f, 3.184f, 7.446f, 3f, 6.982f, 3f)
            horizontalLineTo(4.5f)
            close()
            moveTo(3f, 5.5f)
            curveTo(3f, 4.672f, 3.672f, 4f, 4.5f, 4f)
            horizontalLineToRelative(2.482f)
            curveToRelative(0.2f, 0f, 0.39f, 0.079f, 0.53f, 0.22f)
            lineToRelative(1.28f, 1.28f)
            lineTo(7.44f, 6.854f)
            curveTo(7.346f, 6.947f, 7.22f, 7f, 7.086f, 7f)
            horizontalLineTo(3f)
            verticalLineTo(5.5f)
            close()
            moveTo(3f, 8f)
            horizontalLineToRelative(4.086f)
            curveToRelative(0.398f, 0f, 0.78f, -0.158f, 1.06f, -0.44f)
            lineTo(9.707f, 6f)
            horizontalLineTo(15.5f)
            curveTo(16.328f, 6f, 17f, 6.672f, 17f, 7.5f)
            verticalLineToRelative(7f)
            curveToRelative(0f, 0.828f, -0.672f, 1.5f, -1.5f, 1.5f)
            horizontalLineToRelative(-11f)
            curveTo(3.672f, 16f, 3f, 15.328f, 3f, 14.5f)
            verticalLineTo(8f)
            close()
        }
    }.build()
}
