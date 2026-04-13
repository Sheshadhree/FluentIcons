package com.sheshu.fluenticons.filled

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Filled.ArrowPrevious16: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Filled.ArrowPrevious16",
        defaultWidth = 16.dp,
        defaultHeight = 16.dp,
        viewportWidth = 16f,
        viewportHeight = 16f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.296f, 11.736f)
            curveToRelative(0.284f, 0.302f, 0.27f, 0.776f, -0.032f, 1.06f)
            curveTo(12.119f, 12.933f, 11.935f, 13f, 11.75f, 13f)
            curveToRelative(-0.199f, 0f, -0.398f, -0.079f, -0.546f, -0.236f)
            lineToRelative(-4f, -4.25f)
            curveToRelative(-0.272f, -0.288f, -0.272f, -0.738f, 0f, -1.026f)
            lineToRelative(4f, -4.252f)
            curveToRelative(0.283f, -0.303f, 0.759f, -0.316f, 1.06f, -0.032f)
            curveToRelative(0.302f, 0.283f, 0.316f, 0.758f, 0.032f, 1.06f)
            lineTo(8.78f, 8.002f)
            lineToRelative(3.516f, 3.735f)
            close()
            moveTo(4.75f, 3f)
            curveTo(4.336f, 3f, 4f, 3.337f, 4f, 3.75f)
            verticalLineToRelative(8.5f)
            curveTo(4f, 12.664f, 4.336f, 13f, 4.75f, 13f)
            reflectiveCurveToRelative(0.75f, -0.336f, 0.75f, -0.75f)
            verticalLineToRelative(-8.5f)
            curveTo(5.5f, 3.337f, 5.164f, 3f, 4.75f, 3f)
            close()
        }
    }.build()
}
