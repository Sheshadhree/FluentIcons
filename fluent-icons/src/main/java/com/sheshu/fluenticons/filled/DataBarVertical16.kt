package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.DataBarVertical16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.DataBarVertical16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.5f, 2f)
            curveTo(2.672f, 2f, 2f, 2.672f, 2f, 3.5f)
            verticalLineToRelative(9f)
            curveTo(2f, 13.328f, 2.672f, 14f, 3.5f, 14f)
            reflectiveCurveTo(5f, 13.328f, 5f, 12.5f)
            verticalLineToRelative(-9f)
            curveTo(5f, 2.672f, 4.328f, 2f, 3.5f, 2f)
            close()
            moveToRelative(4f, 3f)
            curveTo(6.672f, 5f, 6f, 5.672f, 6f, 6.5f)
            verticalLineToRelative(6f)
            curveTo(6f, 13.328f, 6.672f, 14f, 7.5f, 14f)
            reflectiveCurveTo(9f, 13.328f, 9f, 12.5f)
            verticalLineToRelative(-6f)
            curveTo(9f, 5.672f, 8.328f, 5f, 7.5f, 5f)
            close()
            moveToRelative(4f, 3f)
            curveTo(10.672f, 8f, 10f, 8.672f, 10f, 9.5f)
            verticalLineToRelative(3f)
            curveToRelative(0f, 0.828f, 0.672f, 1.5f, 1.5f, 1.5f)
            reflectiveCurveToRelative(1.5f, -0.672f, 1.5f, -1.5f)
            verticalLineToRelative(-3f)
            curveTo(13f, 8.672f, 12.328f, 8f, 11.5f, 8f)
            close()
        }
    }.build()
}
