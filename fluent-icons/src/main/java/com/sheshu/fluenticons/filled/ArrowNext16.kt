package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowNext16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowNext16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(3.704f, 11.736f)
            curveToRelative(-0.284f, 0.302f, -0.27f, 0.776f, 0.032f, 1.06f)
            curveTo(3.881f, 12.933f, 4.065f, 13f, 4.25f, 13f)
            curveToRelative(0.199f, 0f, 0.398f, -0.079f, 0.546f, -0.236f)
            lineToRelative(4f, -4.25f)
            curveToRelative(0.272f, -0.288f, 0.272f, -0.738f, 0f, -1.026f)
            lineToRelative(-4f, -4.252f)
            curveTo(4.513f, 2.933f, 4.037f, 2.92f, 3.736f, 3.204f)
            curveTo(3.434f, 3.487f, 3.42f, 3.962f, 3.704f, 4.264f)
            lineTo(7.22f, 8.002f)
            lineToRelative(-3.516f, 3.735f)
            close()
            moveTo(11.25f, 3f)
            curveTo(11.664f, 3f, 12f, 3.337f, 12f, 3.75f)
            verticalLineToRelative(8.5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-8.5f)
            curveTo(10.5f, 3.337f, 10.836f, 3f, 11.25f, 3f)
            close()
        }
    }.build()
}
