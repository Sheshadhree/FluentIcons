package com.sheshu.fluenticons.regular

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp
import com.sheshu.fluenticons.FluentIcons

public val FluentIcons.Regular.Info24: ImageVector by lazy(LazyThreadSafetyMode.NONE) {
    ImageVector.Builder(
        name = "Regular.Info24",
        defaultWidth = 24.dp,
        defaultHeight = 24.dp,
        viewportWidth = 24f,
        viewportHeight = 24f
    ).apply {
        path(fill = SolidColor(Color.Black)) {
            moveTo(12.002f, 1.999f)
            curveToRelative(5.523f, 0f, 10.001f, 4.478f, 10.001f, 10.002f)
            curveToRelative(0f, 5.523f, -4.478f, 10.001f, -10.001f, 10.001f)
            curveTo(6.478f, 22.002f, 2f, 17.524f, 2f, 12.001f)
            curveTo(2f, 6.477f, 6.478f, 1.999f, 12.002f, 1.999f)
            close()
            moveToRelative(0f, 1.5f)
            curveToRelative(-4.696f, 0f, -8.502f, 3.806f, -8.502f, 8.502f)
            curveToRelative(0f, 4.695f, 3.806f, 8.501f, 8.502f, 8.501f)
            curveToRelative(4.695f, 0f, 8.501f, -3.806f, 8.501f, -8.501f)
            curveToRelative(0f, -4.696f, -3.806f, -8.502f, -8.501f, -8.502f)
            close()
            moveTo(12f, 10.5f)
            curveToRelative(0.414f, 0f, 0.75f, 0.336f, 0.75f, 0.75f)
            verticalLineToRelative(5f)
            curveToRelative(0f, 0.414f, -0.336f, 0.75f, -0.75f, 0.75f)
            reflectiveCurveToRelative(-0.75f, -0.336f, -0.75f, -0.75f)
            verticalLineToRelative(-5f)
            curveToRelative(0f, -0.414f, 0.336f, -0.75f, 0.75f, -0.75f)
            close()
            moveTo(12f, 9f)
            curveToRelative(0.552f, 0f, 1f, -0.448f, 1f, -1f)
            reflectiveCurveToRelative(-0.448f, -1f, -1f, -1f)
            reflectiveCurveToRelative(-1f, 0.448f, -1f, 1f)
            reflectiveCurveToRelative(0.448f, 1f, 1f, 1f)
            close()
        }
    }.build()
}
