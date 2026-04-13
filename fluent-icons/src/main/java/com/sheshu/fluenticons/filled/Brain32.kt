package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.Brain32: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.Brain32",
        defaultWidth = 32.dp,
        defaultHeight = 32.dp,
        viewportWidth = 32f,
        viewportHeight = 32f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.375f, 2f)
            curveTo(13.35f, 2f, 14.255f, 2.303f, 15f, 2.818f)
            verticalLineTo(29f)
            curveToRelative(-0.836f, 0.627f, -1.874f, 1f, -3f, 1f)
            horizontalLineToRelative(-0.31f)
            curveToRelative(-2.186f, 0f, -4.12f, -1.422f, -4.772f, -3.509f)
            lineToRelative(-0.169f, -0.544f)
            curveTo(4.067f, 25.581f, 2f, 23.283f, 2f, 20.5f)
            verticalLineTo(20f)
            curveToRelative(0f, -2.162f, 1.143f, -4.056f, 2.858f, -5.112f)
            curveTo(3.726f, 13.97f, 3f, 12.57f, 3f, 11f)
            curveToRelative(0f, -2.692f, 2.128f, -4.886f, 4.793f, -4.995f)
            curveTo(8.096f, 3.744f, 10.031f, 2f, 12.375f, 2f)
            close()
            moveToRelative(7.25f, 0f)
            curveToRelative(2.344f, 0f, 4.279f, 1.744f, 4.582f, 4.005f)
            curveTo(26.872f, 6.114f, 29f, 8.308f, 29f, 11f)
            curveToRelative(0f, 1.57f, -0.726f, 2.971f, -1.858f, 3.888f)
            curveTo(28.857f, 15.944f, 30f, 17.838f, 30f, 20f)
            verticalLineToRelative(0.5f)
            curveToRelative(0f, 2.783f, -2.067f, 5.08f, -4.749f, 5.447f)
            lineToRelative(-0.169f, 0.544f)
            curveTo(24.43f, 28.578f, 22.496f, 30f, 20.31f, 30f)
            horizontalLineTo(20f)
            curveToRelative(-1.126f, 0f, -2.164f, -0.373f, -3f, -1.001f)
            verticalLineTo(2.819f)
            curveTo(17.746f, 2.302f, 18.65f, 2f, 19.625f, 2f)
            close()
        }
    }.build()
}
