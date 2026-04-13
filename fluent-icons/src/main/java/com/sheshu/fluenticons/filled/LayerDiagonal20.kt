package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.LayerDiagonal20: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.LayerDiagonal20",
        defaultWidth = 20.dp,
        defaultHeight = 20.dp,
        viewportWidth = 20f,
        viewportHeight = 20f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(9.447f, 2.107f)
            curveToRelative(0.955f, -0.379f, 1.99f, 0.293f, 2.05f, 1.301f)
            lineTo(5.422f, 5.814f)
            curveTo(4.564f, 6.154f, 4f, 6.984f, 4f, 7.906f)
            verticalLineToRelative(6.006f)
            curveToRelative(-0.97f, 0.345f, -2f, -0.374f, -2f, -1.414f)
            verticalLineTo(6.755f)
            curveTo(2f, 5.73f, 2.626f, 4.808f, 3.58f, 4.431f)
            lineToRelative(5.867f, -2.324f)
            close()
            moveToRelative(3f, 2f)
            curveToRelative(0.985f, -0.39f, 2.052f, 0.336f, 2.052f, 1.395f)
            verticalLineToRelative(0.102f)
            lineTo(9.263f, 7.678f)
            curveTo(8.502f, 7.98f, 8f, 8.718f, 8f, 9.538f)
            verticalLineToRelative(5.98f)
            lineToRelative(-0.947f, 0.375f)
            curveTo(6.068f, 16.283f, 5f, 15.557f, 5f, 14.498f)
            verticalLineTo(8.416f)
            curveToRelative(0f, -0.82f, 0.5f, -1.558f, 1.263f, -1.86f)
            lineToRelative(6.184f, -2.449f)
            close()
            moveTo(18f, 7.501f)
            verticalLineToRelative(6.623f)
            curveToRelative(0f, 0.615f, -0.376f, 1.168f, -0.948f, 1.395f)
            lineToRelative(-6f, 2.376f)
            curveTo(10.068f, 18.285f, 9f, 17.56f, 9f, 16.5f)
            verticalLineTo(9.877f)
            curveTo(9f, 9.262f, 9.376f, 8.71f, 9.948f, 8.483f)
            lineToRelative(6f, -2.377f)
            curveTo(16.932f, 5.716f, 18f, 6.442f, 18f, 7.501f)
            close()
        }
    }.build()
}
